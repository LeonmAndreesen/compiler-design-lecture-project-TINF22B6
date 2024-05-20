package com.auberer.compilerdesignlectureproject.parser;

public class PrefixExprNodeTestIntegration {
    import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.Set;



        @Test
        void testGetSelectionSet() {
            // Arrange
            Set<TokenType> expectedSet = new HashSet<>();
            expectedSet.add(TokenType.TOK_PLUS);
            expectedSet.add(TokenType.TOK_MINUS);
            expectedSet.addAll(ASTAtomicExprNode.getSelectionSet());

            // Execute
            Set<TokenType> actualSet = ASTPrefixExprNode.getSelectionSet();

            // Assert
            assertEquals(expectedSet, actualSet, "Die SelectionSets sollten gleich sein.");
        }
    }

}
