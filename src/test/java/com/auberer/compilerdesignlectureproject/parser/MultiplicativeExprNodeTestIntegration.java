package com.auberer.compilerdesignlectureproject.parser;

public class MultiplicativeExprNodeTestIntegration {import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Set;



        @Test
        void testGetSelectionSet() {
            // Arrange
            Set<TokenType> expectedSet = Set.of(
                    TokenType.TOK_PLUS,
                    TokenType.TOK_MINUS,
                    TokenType.TOK_MULTIPLY,
                    TokenType.TOK_DIVIDE,
                    TokenType.TOK_LPAREN,
                    TokenType.TOK_IDENTIFIER,
                    TokenType.TOK_INT_LIT,
                    TokenType.TOK_DOUBLE_LIT,
                    TokenType.TOK_STRING_LIT,
                    TokenType.TOK_BOOL_LIT
            );

            // Execute
            Set<TokenType> actualSet = ASTMultiplicativeExprNode.getSelectionSet();

            // Assert
            assertEquals("Die SelectionSets sollten gleich sein.", expectedSet, actualSet);
        }
    }

}
