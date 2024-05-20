package com.auberer.compilerdesignlectureproject.parser;

public class AdditiveExprNodeTestIntegration {import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Set;
import java.util.EnumSet;



        private ASTAdditiveExprNode node;

        @Before
        public void setUp() {
            node = new ASTAdditiveExprNode();
        }

        @Test
        public void testOperatorsListAdd() {

            // Testet das Hinzufügen von Operatoren zur Liste
            node.operatorsListAdd(ASTAdditiveExprNode.AdditiveOperator.PLUS);
            node.operatorsListAdd(ASTAdditiveExprNode.AdditiveOperator.MINUS);

            // Erwartet, dass die Liste genau zwei Elemente enthält
            assertEquals("Die Liste der Operatoren sollte zwei Elemente enthalten.", 2, node.operatorList.size());
        }

        @Test
        public void testGetSelectionSet() {
            // Testet, ob die getSelectionSet-Methode das erwartete Set zurückgibt
            Set<TokenType> expectedSet = ASTCompareExprNode.getSelectionSet();
            Set<TokenType> actualSet = ASTAdditiveExprNode.getSelectionSet();

            // Erwartet, dass das zurückgegebene Set dem von ASTCompareExprNode entspricht
            assertEquals("Die SelectionSets sollten gleich sein.", expectedSet, actualSet);
        }

        @Test
        public void testAccept() {
            // Testet die accept-Methode mit einem Mock-Visitor
            ASTVisitor<Integer> visitor = new ASTVisitor<Integer>() {
                @Override
                public Integer visitAdditiveExpr(ASTAdditiveExprNode node) {
                    return 1; // Gibt eine Dummy-Nummer zurück
                }
            };

            int result = node.accept(visitor);

            // Erwartet, dass die accept-Methode den Wert 1 zurückgibt
            assertEquals("Die accept-Methode sollte 1 zurückgeben.", 1, result);
        }
    }

}
