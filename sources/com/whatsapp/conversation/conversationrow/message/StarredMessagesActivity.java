package com.whatsapp.conversation.conversationrow.message;

import X.AnonymousClass000;
import X.AnonymousClass1WR;
import X.AnonymousClass387;
import X.AnonymousClass3MY;
import X.AnonymousClass3vC;
import X.AnonymousClass4JB;
import X.AnonymousClass4SD;
import X.AnonymousClass4a6;
import X.AnonymousClass4bA;
import X.C108675c7;
import X.C108775cH;
import X.C17880vN;
import X.C28521aN;
import X.C31191fA;
import X.C73203Rj;
import X.C81153ym;
import X.C93854je;
import X.C95504mL;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;

public class StarredMessagesActivity extends AnonymousClass3vC {
    public MenuItem A00;
    public AnonymousClass4JB A01;
    public C31191fA A02;
    public AnonymousClass387 A03;
    public C28521aN A04;
    public final AnonymousClass1WR A05 = new C95504mL(this, 9);

    public class UnstarAllDialogFragment extends Hilt_StarredMessagesActivity_UnstarAllDialogFragment {
        public Dialog A27(Bundle bundle) {
            C73203Rj A02 = AnonymousClass4a6.A02(this);
            A02.A0D(2131897357);
            return C73203Rj.A00(new AnonymousClass4bA(this, 21), A02, 2131897358);
        }
    }

    public C108775cH A4c() {
        if (!this.A02.A0L() || !C17880vN.A1X(this.A02.A05.A01) || this.A0E != null) {
            return super.A4c();
        }
        AnonymousClass4JB r0 = this.A01;
        return new C93854je(AnonymousClass3MY.A0S(r0.A00.A01), super.A4c());
    }

    public C108675c7 getConversationRowCustomizer() {
        return this.A00.A0M.A06;
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setTitle(2131896288);
        this.A00.A0W.registerObserver(this.A05);
        C81153ym r1 = new C81153ym();
        if (AnonymousClass000.A1X(this.A0E)) {
            i = 1;
        } else {
            i = 0;
        }
        r1.A00 = i;
        this.A00.A0Z.CC7(r1);
        setContentView(2131626986);
        ListView listView = getListView();
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnScrollListener(this.A0M);
        A4b(this.A04);
        A4f();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ListAdapter listAdapter;
        MenuItem add = menu.add(0, 2131432647, 0, 2131897356);
        this.A00 = add;
        add.setShowAsAction(0);
        MenuItem menuItem = this.A00;
        AnonymousClass4SD r1 = (AnonymousClass4SD) this.A00.get();
        synchronized (r1) {
            listAdapter = r1.A00;
        }
        menuItem.setVisible(!listAdapter.isEmpty());
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.A0W.unregisterObserver(this.A05);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131432647) {
            return super.onOptionsItemSelected(menuItem);
        }
        new Hilt_StarredMessagesActivity_UnstarAllDialogFragment().A2C(getSupportFragmentManager(), "UnstarAllDialogFragment");
        return true;
    }
}
