package com.whatsapp.businessdirectory.view.activity;

import X.AnonymousClass8BR;
import X.C72453Mb;
import android.content.Intent;
import android.view.MenuItem;

public final class DirectoryBusinessChainingActivity extends BusinessDirectoryActivity {
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 1) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent A07 = AnonymousClass8BR.A07(this, BusinessDirectoryActivity.class);
        A07.putExtra("arg_launch_consumer_home", true);
        A07.setFlags(67108864);
        startActivity(A07);
        return true;
    }
}
