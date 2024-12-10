package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.6MX  reason: invalid class name */
public class AnonymousClass6MX extends A34 {
    public AnonymousClass8AI A00;
    public final AnonymousClass1SB A01;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass8AI r0 = this.A00;
        if (r0 != null) {
            r0.Bzs();
        }
        this.A00 = null;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        if (this instanceof AnonymousClass6Hn) {
            return ((AnonymousClass6Hn) this).A0J((Void[]) objArr);
        }
        if (this instanceof AnonymousClass6Hm) {
            return ((AnonymousClass6Hm) this).A0J((Void[]) objArr);
        }
        return A0J((Void[]) objArr);
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, java.util.Comparator] */
    public Void A0J(Void... voidArr) {
        String str;
        AnonymousClass8CU r7 = this.A02;
        if (!r7.isCancelled()) {
            AnonymousClass1SB r5 = this.A01;
            List A0E = r5.A0E();
            if (!r7.isCancelled()) {
                ArrayList A0B = r5.A0B();
                if (!r7.isCancelled()) {
                    ArrayList arrayList = new ArrayList(A0E.size() + A0B.size());
                    ? obj = new Object();
                    arrayList.addAll(A0E);
                    arrayList.addAll(A0B);
                    Collections.sort(arrayList, obj);
                    A0C(arrayList);
                    if (!r7.isCancelled()) {
                        ArrayList A02 = ((AnonymousClass702) r5.A0N.get()).A02();
                        HashMap A11 = C17880vN.A11();
                        Iterator it = A02.iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            String A012 = C137416vQ.A01((String) pair.first, (String) pair.second);
                            C17890vO.A0z(A012, A11, C108945cZ.A0z(r5.A0F).A02(A012));
                        }
                        Collections.sort(A02, new C146997Rk((Object) A11, 14));
                        ArrayList A13 = AnonymousClass000.A13();
                        Iterator it2 = A02.iterator();
                        while (it2.hasNext()) {
                            Pair pair2 = (Pair) it2.next();
                            try {
                                String str2 = (String) pair2.first;
                                String str3 = (String) pair2.second;
                                AnonymousClass725 A002 = ((C134006pr) r5.A0M.get()).A00(str2, str3, C18070vi.A15(str2, str3));
                                A13.add(A002);
                                LinkedHashSet A003 = ((C134416qY) r5.A0O.get()).A00();
                                String str4 = A002.A0H;
                                A002.A0B = A003.contains(str4);
                                AnonymousClass1SB.A03(A002, r5);
                                Object obj2 = A11.get(str4);
                                C17960vV.A07(obj2);
                                A002.A00 = AnonymousClass000.A0M(obj2);
                                A0C(A002);
                            } catch (AnonymousClass1SD e) {
                                e = e;
                                str = "StickerRepository/getInstalledThirdPartyStickerPacksSync/fetch of sticker pack restricted";
                                Log.e(str, e);
                            } catch (Exception e2) {
                                e = e2;
                                str = "StickerRepository/getInstalledThirdPartyStickerPacksSync/failed to fetch sticker pack";
                                Log.e(str, e);
                            }
                        }
                        A13.size();
                        HashSet A12 = C17880vN.A12();
                        Iterator it3 = A13.iterator();
                        while (it3.hasNext()) {
                            A12.add(C108945cZ.A0y(it3).A0H);
                        }
                        Iterator it4 = A0B.iterator();
                        while (it4.hasNext()) {
                            AnonymousClass725 A0y = C108945cZ.A0y(it4);
                            String str5 = A0y.A0H;
                            if (!A12.contains(str5)) {
                                C17900vP.A0e("LoadStickerPickerPacksAsyncTask/doInBackground failed to load pack ", str5, AnonymousClass000.A10());
                                A0C(A0y);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public AnonymousClass6MX(AnonymousClass1SB r1) {
        this.A01 = r1;
    }

    public void A0I(Object... objArr) {
        AnonymousClass8AI r2;
        if (!C108945cZ.A1T(this) && (r2 = this.A00) != null) {
            C147367Sw r1 = objArr[0];
            if (r1 instanceof C147367Sw) {
                r2.Bzr(r1);
            } else if (r1 instanceof AnonymousClass725) {
                r2.Bzq((AnonymousClass725) r1);
            } else if (r1 instanceof String) {
                r2.Bzt((String) r1);
            }
        }
    }

    public AnonymousClass6MX(AnonymousClass1SB r1, AnonymousClass8AI r2) {
        this.A01 = r1;
        this.A00 = r2;
    }
}
