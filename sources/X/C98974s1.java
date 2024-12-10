package X;

import com.facebook.msys.mci.FileManager;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.community.SelectCommunityForGroupActivity;
import com.whatsapp.jid.UserJid;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4s1  reason: invalid class name and case insensitive filesystem */
public class C98974s1 implements Comparator {
    public final int A00;
    public final Object A01;

    public C98974s1(Map map, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A01 = map;
        } else {
            this.A01 = map;
        }
    }

    public static List A00(Iterable iterable, Object obj, int i) {
        return C29431cG.A0y(iterable, new C98974s1(obj, i));
    }

    public final int compare(Object obj, Object obj2) {
        long j;
        Integer num;
        Integer num2;
        boolean z;
        boolean z2;
        int i;
        switch (this.A00) {
            case 0:
                return FileManager.lambda$sortFilesByNewestFirst$0((Map) this.A01, (File) obj, (File) obj2);
            case 2:
                AnonymousClass1E7 r8 = (AnonymousClass1E7) obj2;
                boolean z3 = r8.A0g;
                boolean A06 = C24921Me.A06(r8);
                boolean A0B = r8.A0B();
                int i2 = 0;
                if (z3) {
                    i2 = 1;
                }
                if (A0B) {
                    i2 += 100;
                } else if (A06) {
                    i2 += 10;
                }
                num2 = Integer.valueOf(i2);
                AnonymousClass1E7 r7 = (AnonymousClass1E7) obj;
                boolean z4 = r7.A0g;
                z = C24921Me.A06(r7);
                z2 = r7.A0B();
                i = 0;
                if (z4) {
                    i = 1;
                    break;
                }
                break;
            case 3:
                AnonymousClass1E7 r82 = (AnonymousClass1E7) obj2;
                UserJid userJid = ((C178119Bw) this.A01).A04.A01;
                boolean A1Y = AnonymousClass3MZ.A1Y(r82, userJid);
                boolean z5 = r82.A0g;
                int i3 = 0;
                if (A1Y) {
                    i3 = SearchActionVerificationClientService.NOTIFICATION_ID;
                }
                if (z5) {
                    i3++;
                }
                Integer valueOf = Integer.valueOf(i3);
                AnonymousClass1E7 r72 = (AnonymousClass1E7) obj;
                boolean A1Y2 = AnonymousClass3MZ.A1Y(r72, userJid);
                boolean z6 = r72.A0g;
                int i4 = 0;
                if (A1Y2) {
                    i4 = SearchActionVerificationClientService.NOTIFICATION_ID;
                }
                if (z6) {
                    i4++;
                }
                return C40151uF.A00(valueOf, Integer.valueOf(i4));
            case 4:
                AnonymousClass1R3 r5 = ((C85804Ou) this.A01).A04;
                AnonymousClass206 A062 = r5.A06(((AnonymousClass1E7) obj2).A0J, true);
                long j2 = 0;
                if (A062 != null) {
                    j = A062.A0I;
                } else {
                    j = 0;
                }
                Long valueOf2 = Long.valueOf(j);
                AnonymousClass206 A063 = r5.A06(((AnonymousClass1E7) obj).A0J, true);
                if (A063 != null) {
                    j2 = A063.A0I;
                }
                return C40151uF.A00(valueOf2, Long.valueOf(j2));
            case 5:
                C34511kb r0 = (C34511kb) this.A01;
                A2B a2b = (A2B) obj;
                A2B a2b2 = (A2B) obj2;
                C18070vi.A0n(r0, a2b, a2b2);
                int A05 = r0.A02.A05(a2b.A02, a2b2.A02);
                if (A05 == 0) {
                    return a2b.A06.compareTo(a2b2.A06);
                }
                return A05;
            case 6:
            case 7:
                AnonymousClass3rD r73 = (AnonymousClass3rD) obj;
                SelectCommunityForGroupActivity selectCommunityForGroupActivity = (SelectCommunityForGroupActivity) this.A01;
                AnonymousClass1CJ r1 = selectCommunityForGroupActivity.A03;
                if (r1 != null) {
                    C22931Dv r02 = AnonymousClass1BI.A00;
                    String A0F = r1.A0F(C22931Dv.A00(r73.A00.A0J));
                    String str = "";
                    if (A0F == null) {
                        A0F = str;
                    }
                    AnonymousClass3rD r83 = (AnonymousClass3rD) obj2;
                    AnonymousClass1CJ r12 = selectCommunityForGroupActivity.A03;
                    if (r12 != null) {
                        String A0F2 = r12.A0F(C22931Dv.A00(r83.A00.A0J));
                        if (A0F2 != null) {
                            str = A0F2;
                        }
                        return C40151uF.A00(A0F, str);
                    }
                }
                AnonymousClass3MW.A1I();
                throw null;
            case 8:
                AnonymousClass1E7 r84 = (AnonymousClass1E7) obj2;
                boolean z7 = r84.A0g;
                boolean A064 = C24921Me.A06(r84);
                boolean A0B2 = r84.A0B();
                int i5 = 1000;
                if (z7) {
                    i5 = 1001;
                }
                if (A0B2) {
                    i5 += 100;
                } else if (A064) {
                    i5 += 10;
                }
                num2 = Integer.valueOf(i5);
                AnonymousClass1E7 r74 = (AnonymousClass1E7) obj;
                boolean z8 = r74.A0g;
                z = C24921Me.A06(r74);
                z2 = r74.A0B();
                i = 1000;
                if (z8) {
                    i = 1001;
                    break;
                }
                break;
            case 11:
                C107265Za r2 = (C107265Za) this.A01;
                return C40151uF.A00(r2.BXA(((C108445bi) obj).getId()), r2.BXA(((C108445bi) obj2).getId()));
            case 12:
                String str2 = ((C88434Zr) obj2).A00;
                String str3 = ((C88434Zr) this.A01).A00;
                return C40151uF.A00(Boolean.valueOf(C18070vi.A18(str2, str3)), Boolean.valueOf(C18070vi.A18(((C88434Zr) obj).A00, str3)));
            case 13:
                Map map = (Map) this.A01;
                C86864Tj r03 = (C86864Tj) map.get(obj2);
                Integer num3 = null;
                if (r03 != null) {
                    num = Integer.valueOf(r03.A00);
                } else {
                    num = null;
                }
                C86864Tj r04 = (C86864Tj) map.get(obj);
                if (r04 != null) {
                    num3 = Integer.valueOf(r04.A00);
                }
                return C40151uF.A00(num, num3);
            case 16:
                C22821Di[] r4 = (C22821Di[]) this.A01;
                C18070vi.A0d(r4, 0);
                for (C22821Di r05 : r4) {
                    int A002 = C40151uF.A00((Comparable) r05.invoke(obj), (Comparable) r05.invoke(obj2));
                    if (A002 != 0) {
                        return A002;
                    }
                }
                return 0;
            default:
                AnonymousClass1OS r13 = (AnonymousClass1OS) this.A01;
                C18070vi.A0d(r13, 0);
                return AnonymousClass000.A0M(r13.invoke(obj, obj2));
        }
        if (z2) {
            i += 100;
        } else if (z) {
            i += 10;
        }
        return C40151uF.A00(num2, Integer.valueOf(i));
    }

    public C98974s1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
