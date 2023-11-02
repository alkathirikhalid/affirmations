package com.alkathirikhalid.affirmations

import android.content.Context
import com.alkathirikhalid.affirmations.adapter.ItemAdapter
import com.alkathirikhalid.affirmations.data.Datasource
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = Datasource().loadAffirmations()
        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}