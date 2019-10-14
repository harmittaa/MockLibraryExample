package com.github.harmittaa.mocklibraryexample

import android.test.mock.MockContext
import com.nhaarman.mockitokotlin2.doReturn
import com.nhaarman.mockitokotlin2.mock
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun testMockContext() {
        val mockedPackageName = "mocked"
        val con = mock<MockContext>() {
            on { isRestricted } doReturn true
            on { packageName } doReturn mockedPackageName
        }
        assertTrue(con.isRestricted)
        assertEquals(con.packageName, mockedPackageName)
    }
}
