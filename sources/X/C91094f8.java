package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.community.Hilt_CommunityDeleteDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.4f8  reason: invalid class name and case insensitive filesystem */
public class C91094f8 implements AnonymousClass02H {
    public final int A00;
    public final Object A01;

    public C91094f8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean Bks(MenuItem menuItem, AnonymousClass02B r7) {
        switch (this.A00) {
            case 0:
                if (menuItem.getItemId() == 2131432538) {
                    CallLogActivity callLogActivity = (CallLogActivity) this.A01;
                    if (callLogActivity.A0d != null) {
                        HashSet hashSet = callLogActivity.A0p;
                        if (!hashSet.isEmpty()) {
                            hashSet.size();
                            callLogActivity.A0d.size();
                            callLogActivity.A0F.A0C(C17880vN.A10(hashSet));
                            callLogActivity.A0d.removeAll(hashSet);
                            ArrayList arrayList = callLogActivity.A0d;
                            if (arrayList == null || arrayList.isEmpty()) {
                                callLogActivity.finish();
                                return true;
                            }
                            AnonymousClass02B r0 = callLogActivity.A04;
                            if (r0 == null) {
                                return true;
                            }
                            r0.A05();
                            return true;
                        }
                    }
                    if (callLogActivity.A0d == null) {
                        Log.e("callLogActivity/onActionItemClicked/delete: Calls are null");
                    }
                    if (!callLogActivity.A0p.isEmpty()) {
                        return true;
                    }
                    Log.e("callLogActivity/onActionItemClicked/delete: no calls selected");
                    return true;
                } else if (menuItem.getItemId() != 2131432534) {
                    return false;
                } else {
                    CallLogActivity callLogActivity2 = (CallLogActivity) this.A01;
                    callLogActivity2.startActivity(AnonymousClass1LU.A0P(callLogActivity2, (Uri) null, callLogActivity2.A00, (String) null, true));
                    return true;
                }
            case 1:
                if (AnonymousClass3MY.A01(menuItem, 1) != 2131432582) {
                    return false;
                }
                C85664Og r2 = (C85664Og) this.A01;
                ArrayList A10 = C17880vN.A10(((AnonymousClass4TK) r2.A04.A06()).A00);
                Activity A002 = AnonymousClass1L9.A00(r2.A01);
                AnonymousClass3MW.A1W(A002);
                C18070vi.A0d(A10, 0);
                Hilt_CommunityDeleteDialogFragment hilt_CommunityDeleteDialogFragment = new Hilt_CommunityDeleteDialogFragment();
                Bundle A0D = C17880vN.A0D();
                A0D.putStringArrayList("selectedParentJids", C22971Dz.A0B(A10));
                hilt_CommunityDeleteDialogFragment.A1R(A0D);
                ((AnonymousClass1FU) A002).CMl(hilt_CommunityDeleteDialogFragment);
                return true;
            default:
                return false;
        }
    }

    public boolean BqR(Menu menu, AnonymousClass02B r7) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.A01;
                C18030ve r1 = callLogActivity.A0E;
                callLogActivity.A0b.get();
                C40811vJ.A0B(r1);
                i = 2131432538;
                i2 = 2131888327;
                break;
            case 1:
                C18070vi.A0d(menu, 1);
                i = 2131432582;
                i2 = 2131898874;
                break;
            default:
                AnonymousClass4aY r2 = (AnonymousClass4aY) this.A01;
                View A09 = AnonymousClass3MX.A09(LayoutInflater.from(r2.A2Q.getSupportActionBar().A0A()), (ViewGroup) null, 2131624967);
                AnonymousClass1FY A0Q = AnonymousClass3MW.A0Q(r2);
                r7.A09(A09);
                if (C72473Md.A1V(r2) && (A0Q instanceof C23251Fh)) {
                    C23251Fh.A0V((C23251Fh) A0Q, 8);
                }
                WaEditText waEditText = (WaEditText) A09.findViewById(2131434969);
                r2.A1W = waEditText;
                if (waEditText == null) {
                    return false;
                }
                waEditText.setOnFocusChangeListener(new C90134da(this, 3));
                r2.A1W.addTextChangedListener(r2.A7b);
                r2.A1W.setOnEditorActionListener(new C90944et(this, 3));
                View A06 = AnonymousClass1HF.A06(A09, 2131434974);
                r2.A0N = A06;
                C89914dE.A00(A06, this, 43);
                View A062 = AnonymousClass1HF.A06(A09, 2131434878);
                r2.A0L = A062;
                C89914dE.A00(A062, this, 44);
                r2.A0O = AnonymousClass1HF.A06(A09, 2131434975);
                r2.A0M = AnonymousClass1HF.A06(A09, 2131434879);
                r2.A1W.setText(r2.A2Z.A02);
                r2.A1W.selectAll();
                r2.A1W.requestFocus();
                r2.A1W.setSelected(true);
                return true;
        }
        AnonymousClass3MX.A07(menu, i, i2).setIcon(2131231847).setShowAsAction(2);
        return true;
    }

    public void BrJ(AnonymousClass02B r6) {
        Object tag;
        switch (this.A00) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.A01;
                if (!callLogActivity.isFinishing()) {
                    HashSet hashSet = callLogActivity.A0p;
                    if (hashSet.size() > 0) {
                        hashSet.clear();
                        for (int i = 0; i < callLogActivity.A02.getChildCount(); i++) {
                            View childAt = callLogActivity.A02.getChildAt(i);
                            if (!(childAt == null || (tag = childAt.getTag()) == null || !(tag instanceof AnonymousClass4RY))) {
                                ((AnonymousClass4RY) tag).A00(false, true, false);
                            }
                        }
                    }
                    callLogActivity.A04 = null;
                    return;
                }
                return;
            case 1:
                C85664Og r1 = (C85664Og) this.A01;
                ((AnonymousClass4TK) r1.A04.A06()).A01.invoke();
                r1.A00 = null;
                return;
            default:
                r6.A09((View) null);
                AnonymousClass4aY r0 = (AnonymousClass4aY) this.A01;
                r0.A0e = null;
                AnonymousClass4aY.A0s(r0);
                return;
        }
    }

    public boolean C1U(Menu menu, AnonymousClass02B r8) {
        switch (this.A00) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.A01;
                Locale A0N = callLogActivity.A00.A0N();
                Object[] A1a = AnonymousClass3MW.A1a();
                AnonymousClass000.A1L(A1a, callLogActivity.A0p.size());
                r8.A0B(String.format(A0N, "%d", A1a));
                return true;
            case 1:
                C18070vi.A0d(r8, 0);
                C85664Og r4 = (C85664Og) this.A01;
                Locale A0N2 = r4.A03.A0N();
                Object[] objArr = new Object[1];
                C17880vN.A1T(objArr, ((AnonymousClass4TK) r4.A04.A06()).A00.size(), 0);
                String format = String.format(A0N2, "%d", Arrays.copyOf(objArr, 1));
                C18070vi.A0X(format);
                r8.A0B(format);
                AnonymousClass01E r2 = r4.A01;
                AnonymousClass1L9.A03(AnonymousClass3MY.A0H(r2, 2131427510), r2.getWindowManager());
                return true;
            default:
                return false;
        }
    }
}
