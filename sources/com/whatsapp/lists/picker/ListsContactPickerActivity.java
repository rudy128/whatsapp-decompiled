package com.whatsapp.lists.picker;

import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1OX;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3gf;
import X.AnonymousClass4CZ;
import X.AnonymousClass5IL;
import X.AnonymousClass5IM;
import X.AnonymousClass5O7;
import X.C18070vi;
import X.C18100vl;
import X.C24141Ja;
import X.C30391dr;
import X.C30451dy;
import X.C41561wd;
import X.C41761x1;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C82994Cy;
import X.C91014f0;
import X.C99274sY;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ListsContactPickerActivity extends AnonymousClass3gf {
    public boolean A00;
    public final C18100vl A01;

    public ListsContactPickerActivity() {
        this(0);
        this.A01 = C99274sY.A00(new AnonymousClass5IM(this), new AnonymousClass5IL(this), new AnonymousClass5O7(this), AnonymousClass3MW.A15(ListsContactPickerViewModel.class));
    }

    public void A55(ArrayList arrayList) {
        C18070vi.A0d(arrayList, 0);
        this.A06.A0n(arrayList);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
        }
    }

    public void A52(AnonymousClass1E7 r5, boolean z) {
        C82994Cy r1;
        super.A52(r5, z);
        ListsContactPickerViewModel listsContactPickerViewModel = (ListsContactPickerViewModel) this.A01.getValue();
        AnonymousClass1BI r2 = r5.A0J;
        if (r2 != null) {
            if (z) {
                r1 = C82994Cy.SEARCH;
            } else {
                List list = listsContactPickerViewModel.A06;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C18070vi.A18(C72453Mb.A0l(it), r2)) {
                                r1 = C82994Cy.SUGGESTION;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                r1 = C82994Cy.ALL_CONTACTS;
            }
            AnonymousClass3MW.A12(listsContactPickerViewModel.A08).put(r5, r1);
        }
    }

    public void A53(AnonymousClass1E7 r2, boolean z) {
        super.A53(r2, z);
        AnonymousClass3MW.A12(((ListsContactPickerViewModel) this.A01.getValue()).A08).remove(r2);
    }

    public void onCreate(Bundle bundle) {
        C41761x1 r6;
        super.onCreate(bundle);
        Bundle A09 = AnonymousClass3MY.A09(this);
        if (A09 != null) {
            r6 = (C41761x1) C24141Ja.A00(A09, C41761x1.class, "LABELINFO");
        } else {
            r6 = null;
        }
        ListsContactPickerViewModel listsContactPickerViewModel = (ListsContactPickerViewModel) this.A01.getValue();
        AnonymousClass4CZ r4 = AnonymousClass4CZ.CHATS;
        AnonymousClass1OX A002 = C41561wd.A00(listsContactPickerViewModel);
        listsContactPickerViewModel.A00 = C30451dy.A02(AnonymousClass00R.A00, listsContactPickerViewModel.A09, new ListsContactPickerViewModel$loadData$1(r6, r4, listsContactPickerViewModel, (C30391dr) null), A002);
    }

    public ListsContactPickerActivity(int i) {
        this.A00 = false;
        C91014f0.A00(this, 41);
    }
}
