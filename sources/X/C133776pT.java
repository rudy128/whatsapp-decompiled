package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6pT  reason: invalid class name and case insensitive filesystem */
public final class C133776pT {
    public final AnonymousClass118 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public final boolean A00() {
        AnonymousClass00H r3 = this.A01;
        C35511mM A11 = C108945cZ.A11(r3);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FbAccountManager/hasSystemUnlinkedUser called by ");
        C18070vi.A0d(AnonymousClass000.A0y("STATUS_PRIVACY_ACTIVITY", A10), 0);
        if (C61422pf.A00((C61422pf) ((C129506hu) A11.A00.get()).A03.get()).getBoolean("pref_xfamily_fb_account_has_system_unlinked", false) || AnonymousClass6YD.A00(C108945cZ.A0E(this.A00)) || C108945cZ.A11(r3).A06(AnonymousClass00R.A19)) {
            return true;
        }
        return false;
    }

    public C133776pT(AnonymousClass118 r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }

    public final boolean A01(int i, Collection collection) {
        C57032iQ r3;
        ArrayList arrayList;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C17880vN.A0Y(it).A0H <= 0) {
                        break;
                    }
                } else {
                    if (!collection.isEmpty()) {
                        Iterator it2 = collection.iterator();
                        while (it2.hasNext()) {
                            if (!AnonymousClass74B.A07(C17880vN.A0Y(it2))) {
                                return false;
                            }
                        }
                    }
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                if (!(i == 7 || i == 8 || i == 12 || i == 13)) {
                                    if (i == 15 && AnonymousClass6YD.A00(C108945cZ.A0E(this.A00)) && !C108945cZ.A11(this.A01).A06(AnonymousClass00R.A19) && !AnonymousClass74B.A08(collection)) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        C18100vl r6 = ((AnonymousClass6QE) this.A02.get()).A01;
                                        SharedPreferences A0C = C17880vN.A0C(r6);
                                        long j = AnonymousClass6QE.A03;
                                        int i2 = ((currentTimeMillis - A0C.getLong("ts", -j)) > j ? 1 : ((currentTimeMillis - A0C.getLong("ts", -j)) == j ? 0 : -1));
                                        SharedPreferences A0C2 = C17880vN.A0C(r6);
                                        if (i2 >= 0 ? A0C2.getInt("left", 3) > 0 : A0C2.getInt("shown", 3) < 3) {
                                            r3 = (C57032iQ) this.A03.get();
                                            arrayList = C29351c6.A0E(collection);
                                            Iterator it3 = collection.iterator();
                                            while (it3.hasNext()) {
                                                C108995ce.A1Q(arrayList, it3);
                                            }
                                        }
                                    }
                                }
                            } else if (AnonymousClass6YD.A00(C108945cZ.A0E(this.A00)) || C108945cZ.A11(this.A01).A06(AnonymousClass00R.A19)) {
                                C57032iQ r32 = (C57032iQ) this.A03.get();
                                ArrayList A0E = C29351c6.A0E(collection);
                                Iterator it4 = collection.iterator();
                                while (it4.hasNext()) {
                                    C108995ce.A1Q(A0E, it4);
                                }
                                Iterator it5 = A0E.iterator();
                                while (it5.hasNext()) {
                                    if (r32.A00(C17890vO.A07(it5))) {
                                        return true;
                                    }
                                }
                            }
                        }
                        if ((AnonymousClass6YD.A00(C108945cZ.A0E(this.A00)) || C108945cZ.A11(this.A01).A06(AnonymousClass00R.A19)) && !AnonymousClass74B.A08(collection)) {
                            r3 = (C57032iQ) this.A03.get();
                            arrayList = C29351c6.A0E(collection);
                            Iterator it6 = collection.iterator();
                            while (it6.hasNext()) {
                                C108995ce.A1Q(arrayList, it6);
                            }
                        }
                    } else if (C108945cZ.A11(this.A01).A06(AnonymousClass00R.A19) && !AnonymousClass74B.A08(collection)) {
                        r3 = (C57032iQ) this.A03.get();
                        arrayList = C29351c6.A0E(collection);
                        Iterator it7 = collection.iterator();
                        while (it7.hasNext()) {
                            C108995ce.A1Q(arrayList, it7);
                        }
                    }
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        if (!r3.A00(C17890vO.A07(it8))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
