package com.lj.libraryExample

import org.junit.Test
import org.junit.Assert.*

class TakeIfUnlessUnitTest {
    @Test
    fun takeIf_whenPredicateTrue_returnObject() {
        // Arrange
        val sut = "conditionTrue"

        // Act
        val result = sut.takeIf { it.contains("True") }

        // Assert
        assertEquals(result, sut)
    }
    @Test
    fun takeIf_whenPredicateFalse_returnNull() {
        // Arrange
        val sut = "conditionTrue"

        // Act
        val result = sut.takeIf { it.contains("False") }

        // Assert
        assertNull(result)
    }
    @Test
    fun takeUnless_whenPredicateTrue_returnNull() {
        // Arrange
        val sut = "conditionTrue"

        // Act
        val result = sut.takeUnless { it.contains("True") }

        // Assert
        assertNull(result)
    }
    @Test
    fun takeUnless_whenPredicateFalse_returnObject() {
        // Arrange
        val sut = "conditionTrue"

        // Act
        val result = sut.takeUnless { it.contains("False") }

        // Assert
        assertEquals(result, sut)
    }
}