package com.auberer.compilerdesignlectureproject.sema;

import com.auberer.compilerdesignlectureproject.ast.ASTNode;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SymbolTable implements Serializable {

  Map<String, SymbolTableEntry> symbols = new HashMap<>(); // Mapping between name and symbol table entry
  Scope scope; // Scope, where this symbol table lives in

  public SymbolTable(Scope scope) {
    this.scope = scope;
  }

  public void insert(String name, ASTNode declNode) {
    symbols.put(name, new SymbolTableEntry(scope, name, declNode));
  }

  public SymbolTableEntry lookup(String name) {
    SymbolTableEntry entry = lookupStrict(name);
    if (entry != null)
      return entry;
    if (scope.parent == null)
      return null;
    return scope.parent.lookupSymbol(name);
  }

  public SymbolTableEntry lookupStrict(String name) {
    return symbols.get(name);
  }

}
