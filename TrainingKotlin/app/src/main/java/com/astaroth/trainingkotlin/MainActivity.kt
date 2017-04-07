package com.astaroth.trainingkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		recycler.layoutManager = GridLayoutManager(this, 2)
		recycler.adapter = ItemAdapter(getItems()) { item ->
			val intent = Intent(this, DetailActivity::class.java)
			intent.putExtra(DetailActivity.EXTRA_ID, item.id)
			startActivity(intent)
		}

		/*val items = listOf(Item("Title1", "url1"), Item("Title2", "url2"))
		var empty = emptyList<Item>()

		val sorted:List<String> = items
				.sortedBy(Item::title)
				.filter { it.url.isNotEmpty() }
				.map(Item::title)
		*/

	}
}
