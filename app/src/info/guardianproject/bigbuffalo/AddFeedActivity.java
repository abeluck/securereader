package info.guardianproject.bigbuffalo;

import info.guardianproject.bigbuffalo.R;

import android.os.Bundle;

public class AddFeedActivity extends FragmentActivityWithMenu
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		// Display home as up
		setDisplayHomeAsUp(true);

		setContentView(R.layout.activity_add_feed);
		setMenuIdentifier(R.menu.activity_add_feed);
	}
}
