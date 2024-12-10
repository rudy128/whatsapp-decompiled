package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.35a  reason: invalid class name and case insensitive filesystem */
public final class C688735a implements AnonymousClass3MB {
    public final C24681Lg A00;
    public final AnonymousClass1KB A01;
    public final C126976db A02;
    public final C32251gt A03;
    public final C52932bi A04;
    public final AnonymousClass1RW A05;
    public final C18030ve A06;
    public final AnonymousClass1W6 A07;
    public final AnonymousClass00H A08;

    public int BVp() {
        return 8;
    }

    public boolean CM8() {
        return true;
    }

    public void CRg(AnonymousClass206 r4, AnonymousClass206 r5) {
        if (!C18070vi.A18(r4.A0v.A00, r5.A0v.A00) || !C18070vi.A18(r4.A0H(), r5.A0H())) {
            throw new C32711hd(0);
        }
    }

    public void BCg(AnonymousClass206 r6, AnonymousClass206 r7) {
        if (r7.A0x == -1) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("AlbumMessageUtils/createAssociationToAlbumMessage failed to create association between ");
            A10.append(r7);
            C17900vP.A0X(r6, " and ", A10);
            return;
        }
        C60512o9.A01(r6, new C693236t(AnonymousClass6RT.MEDIA_ALBUM, (A51) null, r7.A0x));
        r6.A0b(67108864);
        r6.A0S = C17880vN.A0i();
    }

    public boolean CM5() {
        return C18020vd.A05(C18040vf.A02, this.A06, 8528);
    }

    public void CRA(AnonymousClass206 r9, Integer num, long j) {
        if (r9 instanceof AnonymousClass247) {
            AnonymousClass247 r4 = (AnonymousClass247) r9;
            AnonymousClass25F r2 = r4.A04;
            synchronized (r2) {
                if (r2.A03) {
                    ArrayList A10 = C17880vN.A10(r4.A17());
                    if (!C29401cD.A0N(A10, new AnonymousClass3IB(j))) {
                        Log.e("MediaAlbumAssociationType/parent message doesn't contain the child that is deleted");
                    }
                    r4.A19(A10, r4.A18());
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                if (AnonymousClass25A.A0G(intValue)) {
                    r4.A02 = Math.max(r4.A02 - 1, 0);
                } else if ("video".equals(AnonymousClass25A.A0B(intValue))) {
                    r4.A03 = Math.max(r4.A03 - 1, 0);
                }
            }
            if (r4.A02 == 0 && r4.A03 == 0) {
                r9.A0X(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
            }
            this.A07.A05(r9, -1);
            this.A01.A0J(new C21453AkK(this, r9, 4));
        }
    }

    public void CRB(AnonymousClass206 r14, AnonymousClass206 r15) {
        AnonymousClass1BI r2;
        Object obj;
        AnonymousClass1BI r22;
        Object obj2;
        if (r15 instanceof AnonymousClass247) {
            AnonymousClass247 r23 = (AnonymousClass247) r15;
            AnonymousClass25F r7 = r23.A04;
            synchronized (r7) {
                if (r14 instanceof AnonymousClass21V) {
                    if (r7.A03) {
                        ArrayList A10 = C17880vN.A10(r23.A17());
                        A10.add(r14);
                        r23.A19(A10, r23.A18());
                    }
                    int i = r14.A0u;
                    if (AnonymousClass25A.A0G(i)) {
                        r23.A02++;
                    } else if ("video".equals(AnonymousClass25A.A0B(i))) {
                        r23.A03++;
                    }
                } else if (r14 instanceof AnonymousClass23N) {
                    ArrayList A102 = C17880vN.A10(r23.A18());
                    A102.add(r14);
                    r23.A19(r23.A17(), A102);
                }
            }
        }
        if (r14 instanceof AnonymousClass21V) {
            C18030ve r6 = this.A06;
            C18040vf r5 = C18040vf.A02;
            if (C18020vd.A05(r5, r6, 11281)) {
                C32251gt r4 = this.A03;
                AnonymousClass205 r1 = r14.A0v;
                if (!r1.A02 && (r22 = r1.A00) != null) {
                    int i2 = r14.A0u;
                    boolean z = false;
                    boolean z2 = true;
                    if (i2 != 1) {
                        z2 = false;
                        if (i2 == 3) {
                            z = true;
                        }
                    }
                    HashMap hashMap = r4.A00;
                    synchronized (hashMap) {
                        ArrayList arrayList = (ArrayList) hashMap.get(r22);
                        if (arrayList == null) {
                            arrayList = AnonymousClass000.A13();
                            hashMap.put(r22, arrayList);
                        }
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((C59252m0) obj2).A02.A0x == r15.A0x) {
                                break;
                            }
                        }
                        C59252m0 r42 = (C59252m0) obj2;
                        if (r42 == null) {
                            r42 = new C59252m0(r15);
                            arrayList.add(r42);
                        }
                        if (z2) {
                            r42.A00++;
                        } else if (z) {
                            r42.A01++;
                        }
                    }
                }
            }
            if (C18020vd.A05(r5, r6, 11423)) {
                C52932bi r43 = this.A04;
                AnonymousClass205 r12 = r14.A0v;
                if (!r12.A02 && (r2 = r12.A00) != null) {
                    int i3 = r14.A0u;
                    boolean z3 = false;
                    boolean z4 = true;
                    if (i3 != 1) {
                        z4 = false;
                        if (i3 == 3) {
                            z3 = true;
                        }
                    }
                    HashMap hashMap2 = r43.A01;
                    synchronized (hashMap2) {
                        ArrayList arrayList2 = (ArrayList) hashMap2.get(r2);
                        if (arrayList2 == null) {
                            arrayList2 = AnonymousClass000.A13();
                            hashMap2.put(r2, arrayList2);
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (((C59262m1) obj).A02.A0x == r15.A0x) {
                                break;
                            }
                        }
                        C59262m1 r52 = (C59262m1) obj;
                        if (r52 == null) {
                            r52 = new C59262m1(r15);
                            arrayList2.add(r52);
                        }
                        if (z4) {
                            r52.A00++;
                        } else if (z3) {
                            r52.A01++;
                        }
                    }
                }
                if (!this.A05.A00().A01(r15.A0v.A00)) {
                    ((C22621Co) this.A08.get()).A09(r15);
                }
            }
        }
        if (!r15.A0z(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            r15.A0V(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
        this.A07.A05(r15, -1);
        this.A01.A0J(new C21453AkK(this, r15, 5));
    }

    public void CRh(C20077A6d a6d, C166048cG r5, AnonymousClass206 r6) {
        int i = r6.A0u;
        if (!AnonymousClass25A.A0G(i) && !"video".equals(AnonymousClass25A.A0B(i))) {
            throw new C32711hd(0);
        }
    }

    public C688735a(AnonymousClass1KB r2, C126976db r3, C32251gt r4, C52932bi r5, AnonymousClass1RW r6, C24681Lg r7, C18030ve r8, AnonymousClass1W6 r9, AnonymousClass00H r10) {
        C18070vi.A0w(r8, r2, r7, r9, r3);
        C18070vi.A0q(r10, r4, r5);
        C18070vi.A0d(r6, 9);
        this.A06 = r8;
        this.A01 = r2;
        this.A00 = r7;
        this.A07 = r9;
        this.A02 = r3;
        this.A08 = r10;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public AnonymousClass6RT BNA() {
        return AnonymousClass6RT.MEDIA_ALBUM;
    }

    public Integer BOc() {
        return AnonymousClass00R.A01;
    }

    public Integer BOd() {
        return AnonymousClass00R.A01;
    }

    public Integer BOe() {
        return AnonymousClass00R.A01;
    }

    public C49382Qg BOg() {
        return C49382Qg.DETACH_CHILD_ON_PARENT_REVOKE;
    }
}
