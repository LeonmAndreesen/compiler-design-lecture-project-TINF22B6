package com.auberer.compilerdesignlectureproject.parser;

public class AtomicExprNodeTestIntegration {

    import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Set;



        @Test
        void testGetSelectionSet() {
            // Arrange
            Set<TokenType> expectedSet = Set.of(
                    TokenType.TOK_INT_LIT,
                    TokenType.TOK_DOUBLE_LIT,
                    TokenType.TOK_STRING_LIT,
                    TokenType.TOK_IDENTIFIER,
                    TokenType.TOK_CALL,
                    TokenType.TOK_PRINT,
                    TokenType.TOK_LPAREN
            );

            // Execute
            Set<TokenType> actualSet = ASTAtomicExprNode.getSelectionSet();

            // Assert
            assertEquals("Die SelectionSets sollten gleich sein.", expectedSet, actualSet);
        }
    }

}
