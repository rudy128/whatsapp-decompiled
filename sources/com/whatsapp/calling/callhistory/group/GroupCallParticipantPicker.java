package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass11E;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1M2;
import X.AnonymousClass1M9;
import X.AnonymousClass1OX;
import X.AnonymousClass1VD;
import X.AnonymousClass1VP;
import X.AnonymousClass1Y5;
import X.AnonymousClass1YL;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3rC;
import X.AnonymousClass4CC;
import X.AnonymousClass4EO;
import X.AnonymousClass4Fu;
import X.AnonymousClass4HY;
import X.AnonymousClass4SL;
import X.AnonymousClass78T;
import X.AnonymousClass7RP;
import X.AnonymousClass7RT;
import X.C003401n;
import X.C108435bh;
import X.C132966nw;
import X.C1408673j;
import X.C146987Rj;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18090vk;
import X.C19880zA;
import X.C199429zz;
import X.C219217x;
import X.C23761Hn;
import X.C28931bI;
import X.C30391dr;
import X.C30451dy;
import X.C37311pJ;
import X.C41561wd;
import X.C70563Bp;
import X.C72463Mc;
import X.C72473Md;
import X.C74713cF;
import X.C74803cp;
import X.C77613qp;
import X.C88394Zn;
import X.C88554a7;
import X.C91574fu;
import X.C99144sL;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.contact.picker.SelectedContactsList;
import com.whatsapp.contact.picker.viewmodels.ReachoutTimelockViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GroupCallParticipantPicker extends C77613qp implements C108435bh {
    public TextEmojiLabel A00;
    public GroupCallParticipantSuggestionsViewModel A01 = null;
    public AnonymousClass1VP A02;
    public C37311pJ A03;
    public C219217x A04;
    public C28931bI A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public ArrayList A0L;
    public boolean A0M = true;
    public boolean A0N = false;
    public ReachoutTimelockViewModel A0O;
    public boolean A0P = false;
    public final List A0Q = AnonymousClass000.A13();

    public static View A12(GroupCallParticipantPicker groupCallParticipantPicker) {
        GroupCallParticipantPicker groupCallParticipantPicker2 = groupCallParticipantPicker;
        if (C18020vd.A05(C18040vf.A02, groupCallParticipantPicker.A0E, 10631)) {
            return ((C132966nw) groupCallParticipantPicker.A09.get()).A00(groupCallParticipantPicker.A02, groupCallParticipantPicker, 100);
        }
        View A012 = C88394Zn.A01(groupCallParticipantPicker2, groupCallParticipantPicker.A02, groupCallParticipantPicker.A05, (AnonymousClass11E) groupCallParticipantPicker.A0A.get(), groupCallParticipantPicker.A0E, 100);
        FrameLayout frameLayout = new FrameLayout(groupCallParticipantPicker2);
        frameLayout.addView(A012);
        frameLayout.setImportantForAccessibility(2);
        groupCallParticipantPicker2.A0Q.add(A012);
        return frameLayout;
    }

    public void A52(AnonymousClass1E7 r8, boolean z) {
        boolean z2 = z;
        super.A52(r8, z);
        Jid A012 = AnonymousClass1E7.A01(r8);
        if (A012 != null && this.A01 != null) {
            C1408673j A0c = C74803cp.A0c(this);
            A0c.A02.execute(new AnonymousClass7RT(A012, A0c, this.A01.A01, 14, z2));
        }
    }

    public void A53(AnonymousClass1E7 r8, boolean z) {
        boolean z2 = z;
        super.A53(r8, z);
        AnonymousClass1BI r3 = r8.A0J;
        if (r3 != null && this.A01 != null) {
            C1408673j A0c = C74803cp.A0c(this);
            A0c.A02.execute(new AnonymousClass7RT(A0c, r3, this.A01.A01, 15, z2));
        }
    }

    public static FrameLayout A13(GroupCallParticipantPicker groupCallParticipantPicker) {
        ListView listView = groupCallParticipantPicker.A02;
        AnonymousClass00H r3 = groupCallParticipantPicker.A0E;
        C18070vi.A0j(listView, r3);
        View A012 = C88554a7.A01(groupCallParticipantPicker.getLayoutInflater(), new AnonymousClass78T((Activity) groupCallParticipantPicker, r3), listView, 2131231854, AnonymousClass1YL.A00(listView.getContext(), 2130970097, C72473Md.A06(listView)), 2131889415);
        if (!AnonymousClass3MX.A1V(groupCallParticipantPicker)) {
            if (C18020vd.A00(C18040vf.A02, groupCallParticipantPicker.A0E, 11714) >= 2) {
                C18000vb r2 = groupCallParticipantPicker.A0F;
                C19880zA r1 = (C19880zA) groupCallParticipantPicker.A0I.get();
                AnonymousClass3Ma.A1O(r2, 2, r1);
                C88394Zn.A03(groupCallParticipantPicker, A012, r1, r2, (C18090vk) null);
            }
        }
        FrameLayout frameLayout = new FrameLayout(groupCallParticipantPicker);
        frameLayout.addView(A012);
        frameLayout.setImportantForAccessibility(2);
        groupCallParticipantPicker.A0Q.add(A012);
        return frameLayout;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r3.A0i.isEmpty() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A14() {
        /*
            r3 = this;
            java.lang.String r0 = r3.A0R
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0011
            java.util.List r0 = r3.A0i
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0013
        L_0x0011:
            r2 = 8
        L_0x0013:
            java.util.List r0 = r3.A0Q
            java.util.Iterator r1 = r0.iterator()
        L_0x0019:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0027
            android.view.View r0 = X.AnonymousClass3MX.A0E(r1)
            r0.setVisibility(r2)
            goto L_0x0019
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker.A14():void");
    }

    public static void A15(GroupCallParticipantPicker groupCallParticipantPicker) {
        if (groupCallParticipantPicker.A01 != null) {
            boolean z = !TextUtils.isEmpty(groupCallParticipantPicker.A0R);
            Iterator it = groupCallParticipantPicker.A4p().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C1408673j A0c = C74803cp.A0c(groupCallParticipantPicker);
                C199429zz r5 = groupCallParticipantPicker.A01.A01;
                C18070vi.A0d(next, 0);
                A0c.A02.execute(new AnonymousClass7RT(A0c, next, r5, 16, z));
            }
        }
    }

    public static void A16(GroupCallParticipantPicker groupCallParticipantPicker) {
        if (groupCallParticipantPicker.A00 == null) {
            Log.e("GroupCallParticipantPicker/groupParticipantWarningTextView unexpectedly null");
            return;
        }
        if (groupCallParticipantPicker.A5E()) {
            TextEmojiLabel textEmojiLabel = groupCallParticipantPicker.A00;
            C18000vb r5 = groupCallParticipantPicker.A0F;
            long A4f = (long) groupCallParticipantPicker.A4f();
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, groupCallParticipantPicker.A4f(), 0);
            textEmojiLabel.setText(r5.A0K(objArr, 2131755271, A4f));
            return;
        }
        C18000vb r52 = groupCallParticipantPicker.A0F;
        long A4f2 = (long) groupCallParticipantPicker.A4f();
        Object[] objArr2 = new Object[1];
        C17880vN.A1T(objArr2, groupCallParticipantPicker.A4f(), 0);
        Spanned fromHtml = Html.fromHtml(r52.A0K(objArr2, 2131755509, A4f2));
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(fromHtml);
        URLSpan[] A1b = C72473Md.A1b(fromHtml, 0);
        if (A1b != null) {
            for (URLSpan uRLSpan : A1b) {
                if ("learn_more_link".equals(uRLSpan.getURL())) {
                    Log.i("GroupCallParticipantPicker/getCustomWarningLayout/learn_more_link link found");
                    int spanStart = A092.getSpanStart(uRLSpan);
                    int spanEnd = A092.getSpanEnd(uRLSpan);
                    int spanFlags = A092.getSpanFlags(uRLSpan);
                    A092.removeSpan(uRLSpan);
                    A092.setSpan(new C74713cF((Context) groupCallParticipantPicker, groupCallParticipantPicker, C72463Mc.A02(groupCallParticipantPicker)), spanStart, spanEnd, spanFlags);
                }
            }
        }
        groupCallParticipantPicker.A00.setText(A092);
        AnonymousClass3Ma.A1I(groupCallParticipantPicker.A00, groupCallParticipantPicker.A0E);
    }

    public static void A17(GroupCallParticipantPicker groupCallParticipantPicker) {
        C28931bI r1;
        int i;
        if (((AnonymousClass1VD) groupCallParticipantPicker.A0G.get()).A00.A03()) {
            AnonymousClass4HY.A00(groupCallParticipantPicker.A05.A02().getContext(), groupCallParticipantPicker.A05.A02(), groupCallParticipantPicker);
            r1 = groupCallParticipantPicker.A05;
            i = 0;
        } else {
            r1 = groupCallParticipantPicker.A05;
            i = 8;
        }
        r1.A04(i);
    }

    public static boolean A1B(GroupCallParticipantPicker groupCallParticipantPicker) {
        ArrayList arrayList;
        if ((!AnonymousClass3MX.A0g(groupCallParticipantPicker.A0C).A05() || C72463Mc.A1W(groupCallParticipantPicker.A0B)) && (arrayList = groupCallParticipantPicker.A0L) != null && !arrayList.isEmpty()) {
            if (C18020vd.A00(C18040vf.A02, groupCallParticipantPicker.A0E, 6742) == 1) {
                return true;
            }
        }
        return false;
    }

    public void A4u(int i) {
        if (i > 0 || getSupportActionBar() == null || A1A(this)) {
            super.A4u(i);
            return;
        }
        boolean A19 = A19(this);
        C003401n supportActionBar = getSupportActionBar();
        if (A19) {
            Resources resources = getResources();
            int size = this.A0T.size();
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, this.A0T.size());
            supportActionBar.A0R(resources.getQuantityString(2131755250, size, A1a));
            return;
        }
        supportActionBar.A0L(2131886494);
    }

    public void A4z(AnonymousClass4SL r3, AnonymousClass1E7 r4) {
        if (((AnonymousClass1VD) this.A0G.get()).A01(r4, true)) {
            r3.A00(getString(2131894911), true, 1);
        } else {
            super.A4z(r3, r4);
        }
    }

    public void A55(ArrayList arrayList) {
        ArrayList A0r = C72463Mc.A0r(getIntent(), UserJid.class);
        ArrayList arrayList2 = arrayList;
        if (A0r.isEmpty()) {
            AnonymousClass1M2.A0C(this.A06.A04, arrayList2, 2, false, false, false, false, false);
            if (this.A0L == null) {
                if (C18020vd.A00(C18040vf.A02, this.A0E, 6742) == 1) {
                    this.A0L = AnonymousClass000.A13();
                    if (!AnonymousClass3MX.A0g(this.A0C).A07() || C72463Mc.A1W(this.A0B)) {
                        AnonymousClass1M9 r0 = this.A06;
                        AnonymousClass1M2.A0C(r0.A04, this.A0L, 2, true, false, false, false, false);
                    }
                    Collections.sort(this.A0L, new C146987Rj(this.A08, this.A0F));
                    arrayList2.addAll(this.A0L);
                    return;
                }
                return;
            }
            return;
        }
        A18(this, arrayList2, A0r);
    }

    public boolean A5D() {
        if (!(this instanceof GroupCallParticipantPickerSheet)) {
            C18030ve r2 = this.A0E;
            C18040vf r1 = C18040vf.A02;
            if (C18020vd.A00(r1, r2, 5370) <= 0 || !C18020vd.A05(r1, r2, 5757)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A5E() {
        if (this instanceof GroupCallParticipantPickerSheet) {
            return false;
        }
        return AnonymousClass000.A1R(C18020vd.A00(C18040vf.A02, this.A0E, 5370));
    }

    public void BEb(AnonymousClass1E7 r2) {
        if (r2.A0y || !((AnonymousClass1VD) this.A0G.get()).A00.A02() || this.A0i.size() <= 0) {
            super.BEb(r2);
            A14();
            return;
        }
        C74803cp.A0x(this);
    }

    public void onCreate(Bundle bundle) {
        WDSSearchBar wDSSearchBar;
        if (bundle == null) {
            this.A0P = true;
        }
        super.onCreate(bundle);
        if (A5E() && (wDSSearchBar = this.A0H) != null) {
            wDSSearchBar.A08.setTrailingButtonIcon(AnonymousClass4CC.A00);
            this.A0H.A08.setHint(2131895490);
        }
        boolean A1a = AnonymousClass3MY.A1a(getIntent(), "call_with_screen_sharing");
        this.A0N = A1a;
        if (A1a) {
            SelectedContactsList selectedContactsList = this.A0A;
            if (selectedContactsList instanceof GroupCallSelectedContactsList) {
                GroupCallSelectedContactsList groupCallSelectedContactsList = (GroupCallSelectedContactsList) selectedContactsList;
                groupCallSelectedContactsList.A02.setVisibility(8);
                groupCallSelectedContactsList.A01 = groupCallSelectedContactsList.getResources().getDimensionPixelSize(2131168607);
            }
        }
    }

    public static void A18(GroupCallParticipantPicker groupCallParticipantPicker, ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3MY.A1O(groupCallParticipantPicker.A06, C17880vN.A0Q(it), arrayList);
        }
    }

    public static boolean A19(GroupCallParticipantPicker groupCallParticipantPicker) {
        if (groupCallParticipantPicker.getIntent().getIntExtra("call_from_ui", 0) != 44 || !groupCallParticipantPicker.A5E()) {
            return false;
        }
        return true;
    }

    public static boolean A1A(GroupCallParticipantPicker groupCallParticipantPicker) {
        if (groupCallParticipantPicker.getIntent().getIntExtra("call_from_ui", 0) != 16 || !groupCallParticipantPicker.A5E()) {
            return false;
        }
        return true;
    }

    public void A4b(ListAdapter listAdapter) {
        int intExtra = getIntent().getIntExtra("hidden_jids", 0);
        if (intExtra > 0) {
            ListView listView = getListView();
            View inflate = getLayoutInflater().inflate(2131625479, listView, false);
            listView.addFooterView(inflate, (Object) null, false);
            TextView A0E2 = C17880vN.A0E(inflate, 2131431268);
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, intExtra, 0);
            A0E2.setText(this.A0F.A0K(A1a, 2131755173, (long) intExtra));
            AnonymousClass1Y5.A01(inflate);
        }
        super.A4b(listAdapter);
    }

    public void A4r() {
        if (A5D()) {
            if (this.A01 == null) {
                this.A01 = (GroupCallParticipantSuggestionsViewModel) AnonymousClass3MW.A0N(this).A00(GroupCallParticipantSuggestionsViewModel.class);
                C1408673j A0c = C74803cp.A0c(this);
                A0c.A02.execute(new C70563Bp(A0c, 16));
            }
            GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel = this.A01;
            List list = this.A0i;
            C18070vi.A0d(list, 0);
            if (groupCallParticipantSuggestionsViewModel.A03 == null && groupCallParticipantSuggestionsViewModel.A01 == null) {
                AnonymousClass1OX A002 = C41561wd.A00(groupCallParticipantSuggestionsViewModel);
                groupCallParticipantSuggestionsViewModel.A03 = C30451dy.A02(AnonymousClass00R.A00, C23761Hn.A01, new GroupCallParticipantSuggestionsViewModel$loadSuggestions$1(groupCallParticipantSuggestionsViewModel, list, (C30391dr) null), A002);
            }
        }
        ReachoutTimelockViewModel reachoutTimelockViewModel = (ReachoutTimelockViewModel) AnonymousClass3MW.A0N(this).A00(ReachoutTimelockViewModel.class);
        this.A0O = reachoutTimelockViewModel;
        reachoutTimelockViewModel.A02.registerObserver(reachoutTimelockViewModel.A01);
        C91574fu.A00(this, this.A0O.A00, 12);
        super.A4r();
    }

    public void A54(String str) {
        int i;
        super.A54(str);
        A14();
        if (A5D()) {
            C1408673j A0c = C74803cp.A0c(this);
            if (str != null) {
                i = str.length();
            } else {
                i = 0;
            }
            A0c.A02.execute(new AnonymousClass7RP(A0c, i, 42));
        }
    }

    public void A59(List list) {
        AnonymousClass3rC r2;
        if (list.size() > 0 && A5E()) {
            if (!TextUtils.isEmpty(this.A0R)) {
                if (!(list.get(0) instanceof AnonymousClass3rC)) {
                    String string = getString(2131892454);
                    C18070vi.A0d(string, 1);
                    r2 = new AnonymousClass3rC(string, false);
                }
            } else if (!A5D() || this.A0M) {
                r2 = new AnonymousClass3rC(getString(2131892452), AnonymousClass3MX.A0g(this.A0C).A00());
                AnonymousClass4EO A4m = A4m();
                if (A4m != null) {
                    list.add(0, A4m);
                }
            }
            list.add(0, r2);
        }
        super.A59(list);
        if (this.A0P) {
            this.A0P = false;
            if (!A1A(this)) {
                if (A19(this)) {
                    if (C18020vd.A00(C18040vf.A02, this.A0E, 5370) == 1) {
                        return;
                    }
                } else {
                    return;
                }
            }
            WDSSearchBar wDSSearchBar = this.A0H;
            if (wDSSearchBar != null) {
                AnonymousClass4Fu.A00(wDSSearchBar.A08, new C99144sL(this, 25));
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 || i == 101 || i == 2) {
            WDSSearchBar wDSSearchBar = this.A0H;
            if (wDSSearchBar != null && AnonymousClass000.A1P(wDSSearchBar.A08.getVisibility())) {
                this.A0H.A02(false);
            }
            if (i == 101 && i2 == -1) {
                finish();
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A01 != null) {
            C1408673j A0c = C74803cp.A0c(this);
            A0c.A02.execute(new C70563Bp(A0c, 15));
        }
    }

    public boolean onSearchRequested() {
        boolean onSearchRequested = super.onSearchRequested();
        if (A5D()) {
            C1408673j A0c = C74803cp.A0c(this);
            A0c.A02.execute(new C70563Bp(A0c, 13));
        }
        return onSearchRequested;
    }
}
