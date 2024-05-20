package com.auberer.compilerdesignlectureproject.parser;

public class LogicalExprNodeTestIntegration {
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Set;



        @Test
        void testGetSelectionSet() {
            // Arrange
            Set<TokenType> expectedSet = ASTCompareExprNode.getSelectionSet();

            // Execute
            Set<TokenType> actualSet = ASTLogicalExprNode.getSelectionSet();

            // Assert
            assertEquals(expectedSet, actualSet, "Die SelectionSets sollten gleich sein.");
        }

        @Test
        void testOperatorsListAdd() {
            // Arrange
            ASTLogicalExprNode node = new ASTLogicalExprNode();
            node.operatorsListAdd(ASTLogicalExprNode.LogicalOperator.AND);
            node.operatorsListAdd(ASTLogicalExprNode.LogicalOperator.OR);

            // Act
            List<ASTLogicalExprNode.LogicalOperator> operatorList = node.operatorList;

            // Assert
            assertTrue(operatorList.contains(ASTLogicalExprNode.LogicalOperator.AND), "Die Liste sollte AND enthalten.");
            assertTrue(operatorList.contains(ASTLogicalExprNode.LogicalOperator.OR), "Die Liste sollte OR enthalten.");
            assertEquals(2, operatorList.size(), "Die Liste der Operatoren sollte zwei Elemente enthalten.");
        }
    }

}
