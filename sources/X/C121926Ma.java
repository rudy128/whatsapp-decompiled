package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6Ma  reason: invalid class name and case insensitive filesystem */
public abstract class C121926Ma extends A34 {
    public final AnonymousClass11S A00;
    public final AnonymousClass1PM A01;
    public final C24921Me A02;
    public final C18000vb A03;
    public final String A04;
    public final WeakReference A05;
    public final ArrayList A06;
    public final HashSet A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final Set A0B;
    public final AnonymousClass1M9 A0C;
    public final AnonymousClass1UN A0D;
    public final C18030ve A0E;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C127096dn r7 = (C127096dn) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A05.get();
        if (contactPickerFragment != null && contactPickerFragment.A1b()) {
            contactPickerFragment.A4B.A01();
            contactPickerFragment.A0o = null;
            contactPickerFragment.A2W(r7);
            String A1H = contactPickerFragment.A1H(2131886286);
            if (C108965cb.A1X(contactPickerFragment.A15)) {
                List list = r7.A00;
                if (!list.isEmpty() && !(list.get(0) instanceof AnonymousClass7ED)) {
                    int i = 0;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (((C1599786p) list.get(i2)).getContact() != null) {
                            i++;
                        }
                    }
                    if (i == 1) {
                        A1H = contactPickerFragment.A1H(2131886288);
                    } else {
                        Object[] objArr = new Object[1];
                        C17880vN.A1T(objArr, i, 0);
                        A1H = contactPickerFragment.A1I(2131886287, objArr);
                    }
                }
            }
            ((C132446mp) contactPickerFragment.A2q.get()).A00(contactPickerFragment.A1n(), A1H);
        }
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        C127096dn[] r3 = (C127096dn[]) objArr;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A05.get();
        if (contactPickerFragment != null && contactPickerFragment.A1b()) {
            contactPickerFragment.A2W(r3[0]);
        }
    }

    public String A0J(ContactPickerFragment contactPickerFragment) {
        int i;
        String str;
        if (this instanceof C116535xv) {
            C116535xv r1 = (C116535xv) this;
            if (r1.A06 != null) {
                str = r1.A04;
            } else {
                i = 2131888805;
                if (r1.A0r) {
                    i = 2131888806;
                }
                return contactPickerFragment.A1H(i);
            }
        } else if (this.A06 != null) {
            str = this.A04;
        } else {
            i = 2131888805;
            return contactPickerFragment.A1H(i);
        }
        return contactPickerFragment.A2E(str);
    }

    public void A0K(ArrayList arrayList) {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A05.get();
        if (contactPickerFragment != null && contactPickerFragment.A1b()) {
            String A0J = A0J(contactPickerFragment);
            if (!TextUtils.isEmpty(A0J)) {
                arrayList.add(new AnonymousClass7ED(A0J));
            }
        }
    }

    public void A0L(ArrayList arrayList, List list, int i, boolean z) {
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && fragment.A1b() && !list.isEmpty()) {
            if (!z) {
                AnonymousClass7EJ.A00(fragment.A1H(i), arrayList);
            }
            if (!C36301nf.A01(this.A0E, 12563)) {
                AnonymousClass11S r0 = this.A00;
                r0.A0I();
                AnonymousClass1E8 r1 = r0.A0D;
                if (r1 != null && A0P() && !list.isEmpty() && list.remove(r1)) {
                    list.add(0, r1);
                }
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AnonymousClass7EA(C17880vN.A0O(it)));
        }
    }

    public void A0M(ArrayList arrayList, List list, List list2, List list3, List list4) {
        int i;
        Fragment fragment = (Fragment) this.A05.get();
        if (fragment != null && fragment.A1b()) {
            if ((!list.isEmpty() || !list2.isEmpty() || !list3.isEmpty()) && !list4.isEmpty()) {
                if (this instanceof C116515xt) {
                    i = 2131893618;
                } else {
                    i = 2131888817;
                }
                AnonymousClass7EJ.A00(fragment.A1H(i), arrayList);
                if (A0P()) {
                    AnonymousClass11S r0 = this.A00;
                    r0.A0I();
                    AnonymousClass1E8 r1 = r0.A0D;
                    if (r1 != null && !list.contains(r1) && !list2.contains(r1)) {
                        arrayList.add(new AnonymousClass7EA(r1));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0O() {
        /*
            r4 = this;
            java.util.HashSet r1 = r4.A07
            boolean r0 = r1.isEmpty()
            r3 = 1
            if (r0 != 0) goto L_0x0021
            java.util.Iterator r2 = r1.iterator()
        L_0x000d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0021
            int r1 = X.C72453Mb.A0H(r2)
            r0 = 42
            if (r1 == r0) goto L_0x001f
            r0 = 43
            if (r1 != r0) goto L_0x000d
        L_0x001f:
            r0 = 0
            return r0
        L_0x0021:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121926Ma.A0O():boolean");
    }

    public boolean A0P() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A05.get();
        if (contactPickerFragment == null) {
            return false;
        }
        if (contactPickerFragment.A3V || contactPickerFragment.A3S || contactPickerFragment.A3c) {
            return true;
        }
        return false;
    }

    public C121926Ma(AnonymousClass11S r2, AnonymousClass1M9 r3, AnonymousClass1PM r4, C24921Me r5, ContactPickerFragment contactPickerFragment, C18000vb r7, AnonymousClass1UN r8, C18030ve r9, String str, HashSet hashSet, List list, List list2, List list3, List list4, Set set) {
        ArrayList arrayList;
        this.A05 = AnonymousClass3MW.A0z(contactPickerFragment);
        this.A08 = list2;
        this.A09 = list3;
        this.A0A = list4;
        if (list != null) {
            arrayList = C17880vN.A10(list);
        } else {
            arrayList = null;
        }
        this.A06 = arrayList;
        this.A04 = str;
        this.A07 = hashSet;
        this.A0B = set;
        this.A0E = r9;
        this.A00 = r2;
        this.A03 = r7;
        this.A0C = r3;
        this.A02 = r5;
        this.A01 = r4;
        this.A0D = r8;
    }

    public static void A08(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new AnonymousClass7EA(C17880vN.A0O(it)));
        }
        list.size();
        arrayList.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (X.C36301nf.A01(r1.A0B, 11864) == false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(java.util.List r10, java.util.List r11, java.util.Set r12, java.util.Set r13, boolean r14) {
        /*
            r9 = this;
            java.util.Iterator r8 = r10.iterator()
        L_0x0004:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0077
            X.1E7 r4 = X.C17880vN.A0O(r8)
            if (r4 == 0) goto L_0x0004
            X.1BI r3 = r4.A0J
            if (r3 == 0) goto L_0x0004
            boolean r0 = r12.contains(r3)
            if (r0 != 0) goto L_0x0004
            boolean r0 = r13.contains(r3)
            if (r0 != 0) goto L_0x0004
            boolean r0 = r4.A10
            if (r0 == 0) goto L_0x0004
            X.1Me r7 = r9.A02
            java.util.ArrayList r6 = r9.A06
            r2 = 1
            r1 = r9
            boolean r5 = r9 instanceof X.C116535xv
            if (r5 == 0) goto L_0x0043
            X.5xv r1 = (X.C116535xv) r1
            boolean r0 = r1.A0l
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A0s
            if (r0 == 0) goto L_0x0043
        L_0x0038:
            X.0ve r1 = r1.A0B
            r0 = 11864(0x2e58, float:1.6625E-41)
            boolean r1 = X.C36301nf.A01(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            boolean r0 = r7.A0m(r4, r6, r2, r0)
            if (r0 == 0) goto L_0x0004
            r2 = r9
            if (r5 == 0) goto L_0x005e
            X.5xv r2 = (X.C116535xv) r2
            X.1BI r1 = r4.A0J
            boolean r0 = X.C22971Dz.A0K(r1)
            if (r0 == 0) goto L_0x0004
            boolean r0 = X.C116535xv.A05(r2, r4, r1)
            if (r0 == 0) goto L_0x0066
            goto L_0x0004
        L_0x005e:
            X.1BI r0 = r4.A0J
            boolean r0 = X.C22971Dz.A0K(r0)
            if (r0 == 0) goto L_0x0004
        L_0x0066:
            r12.add(r3)
            boolean r0 = r9.A0Q(r4, r14)
            if (r0 == 0) goto L_0x0073
            r11.add(r4)
            goto L_0x0004
        L_0x0073:
            r13.add(r3)
            goto L_0x0004
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121926Ma.A0N(java.util.List, java.util.List, java.util.Set, java.util.Set, boolean):void");
    }

    public boolean A0Q(AnonymousClass1E7 r6, boolean z) {
        UserJid A0x;
        if (r6.A0F()) {
            A0x = r6.A0K;
        } else {
            A0x = AnonymousClass3MZ.A0x(r6);
        }
        if (!z && A0x != null && this.A01.A04(A0x)) {
            return false;
        }
        if (this instanceof C116525xu) {
            return true;
        }
        boolean z2 = this instanceof C116515xt;
        if (!z2) {
            C116535xv r1 = (C116535xv) this;
            if (r1.A0c && (r1.A0q || r1.A0s || r1.A0l || r1.A0e || r1.A0p)) {
                UserJid A0x2 = AnonymousClass3MZ.A0x(r6);
                if (!C1402170l.A01(r1.A0C, A0x2) && new C63852tn(r1.A01, (C25491Ok) null, A0x2).A03()) {
                    return false;
                }
            }
        }
        if (z2 || !((C116535xv) this).A0p || C22971Dz.A0e(r6.A0J) || r6.A0B()) {
            return true;
        }
        return false;
    }
}
