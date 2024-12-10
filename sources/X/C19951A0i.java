package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A0i  reason: case insensitive filesystem */
public abstract class C19951A0i {
    public final CountDownLatch A00 = new CountDownLatch(1);
    public volatile Object A01;

    public void A01() {
        Object r3;
        String str;
        String str2;
        Object obj;
        Object obj2;
        int i;
        Object r6;
        String str3;
        String str4;
        Object obj3;
        Object obj4;
        String str5;
        String str6;
        Object obj5;
        Object obj6;
        int i2;
        Object r5;
        String str7;
        String str8;
        Object obj7;
        Object obj8;
        byte[] bArr;
        byte[] bArr2;
        String str9;
        Map map;
        Object obj9;
        int i3;
        if (this instanceof AnonymousClass9CM) {
            AnonymousClass9CM r0 = (AnonymousClass9CM) this;
            AnonymousClass9CC r7 = new AnonymousClass9CC(r0, 12);
            String str10 = r0.A06;
            int i4 = r0.A00;
            byte[] bArr3 = r0.A0B;
            String str11 = r0.A04;
            String str12 = r0.A05;
            byte[] bArr4 = r0.A0A;
            byte[] bArr5 = r0.A09;
            String str13 = r0.A03;
            Map map2 = r0.A08;
            JniBridge.jvidispatchIIOOOOOOOOOO((long) i4, str10, str11, str12, str13, r0.A07, r7, bArr3, bArr4, bArr5, map2);
        } else if (this instanceof AnonymousClass9CN) {
            AnonymousClass9CN r02 = (AnonymousClass9CN) this;
            AnonymousClass9CC r8 = new AnonymousClass9CC(r02, 11);
            String str14 = r02.A07;
            String str15 = r02.A05;
            String str16 = r02.A06;
            byte[] bArr6 = r02.A0C;
            byte[] bArr7 = r02.A0B;
            byte[] bArr8 = r02.A0A;
            JniBridge.jvidispatchIOOOOOOOOOOOOO(str14, str15, str16, r02.A02, r02.A03, r02.A04, r02.A08, r8, bArr6, bArr7, bArr8, (Object) null, r02.A09);
        } else {
            if (this instanceof AnonymousClass9CL) {
                AnonymousClass9CL r03 = (AnonymousClass9CL) this;
                obj8 = new AnonymousClass9CC(r03, 9);
                str7 = r03.A04;
                str8 = r03.A05;
                bArr = r03.A0A;
                bArr2 = r03.A09;
                str9 = r03.A06;
                obj9 = r03.A03;
                r5 = r03.A02;
                map = r03.A08;
                obj7 = r03.A07;
                i3 = 1;
            } else if (this instanceof AnonymousClass9CO) {
                AnonymousClass9CO r04 = (AnonymousClass9CO) this;
                AnonymousClass9CC r12 = new AnonymousClass9CC(r04, 8);
                String str17 = r04.A08;
                String str18 = r04.A09;
                byte[] bArr9 = r04.A0F;
                byte[] bArr10 = r04.A0D;
                String str19 = r04.A0A;
                String str20 = r04.A07;
                String str21 = r04.A06;
                int i5 = r04.A01;
                int i6 = r04.A02;
                int i7 = r04.A00;
                byte[] bArr11 = r04.A0E;
                String str22 = r04.A05;
                Map map3 = r04.A0C;
                List list = r04.A0B;
                long j = (long) i7;
                String str23 = str17;
                String str24 = str18;
                long j2 = (long) i6;
                long j3 = (long) i5;
                JniBridge.jvidispatchIIIIOOOOOOOOOOOO(j3, j2, j, str23, str24, str19, str20, str21, str22, list, r12, bArr9, bArr10, bArr11, map3);
                return;
            } else if (this instanceof AnonymousClass9CK) {
                AnonymousClass9CK r05 = (AnonymousClass9CK) this;
                r5 = new AnonymousClass9CC(r05, 7);
                str7 = r05.A03;
                str8 = r05.A04;
                obj7 = r05.A0A;
                obj8 = r05.A07;
                bArr = r05.A09;
                bArr2 = r05.A08;
                str9 = r05.A02;
                map = r05.A06;
                obj9 = r05.A05;
                i3 = 0;
            } else if (this instanceof AnonymousClass9CD) {
                AnonymousClass9CD r06 = (AnonymousClass9CD) this;
                JniBridge.jvidispatchIOOOO(1, r06.A02, r06.A03, new AnonymousClass9CC(r06, 0), r06.A04);
                return;
            } else {
                if (this instanceof AnonymousClass9CE) {
                    AnonymousClass9CE r07 = (AnonymousClass9CE) this;
                    obj2 = new AnonymousClass9CC(r07, 6);
                    str = r07.A03;
                    str2 = r07.A05;
                    r3 = r07.A02;
                    obj = r07.A04;
                    i = 2;
                } else {
                    if (this instanceof AnonymousClass9CI) {
                        AnonymousClass9CI r08 = (AnonymousClass9CI) this;
                        r6 = new AnonymousClass9CC(r08, 5);
                        str3 = r08.A04;
                        str4 = r08.A05;
                        obj3 = r08.A09;
                        obj4 = r08.A08;
                        str5 = r08.A03;
                        str6 = r08.A06;
                        obj6 = r08.A02;
                        obj5 = r08.A07;
                        i2 = 3;
                    } else if (this instanceof AnonymousClass9CH) {
                        AnonymousClass9CH r09 = (AnonymousClass9CH) this;
                        AnonymousClass9CC r4 = new AnonymousClass9CC(r09, 3);
                        JniBridge.jvidispatchIOOOOOOO(r09.A02, r09.A03, r09.A04, r4, r09.A07, r09.A06, r09.A05);
                        return;
                    } else if (this instanceof AnonymousClass9CG) {
                        AnonymousClass9CG r010 = (AnonymousClass9CG) this;
                        JniBridge.jvidispatchIOOOOOO(0, r010.A03, r010.A04, r010.A02, new AnonymousClass9CC(r010, 1), r010.A06, r010.A05);
                        return;
                    } else if (this instanceof AnonymousClass9CJ) {
                        AnonymousClass9CJ r011 = (AnonymousClass9CJ) this;
                        switch (r011.A00) {
                            case 0:
                                r6 = new C122276Oq(r011, 0);
                                str3 = r011.A08;
                                str4 = r011.A09;
                                obj3 = r011.A05;
                                obj4 = r011.A03;
                                str5 = r011.A0A;
                                str6 = r011.A07;
                                obj5 = r011.A02;
                                obj6 = r011.A04;
                                i2 = 1;
                                break;
                            case 1:
                                r6 = new C122276Oq(r011, 1);
                                str3 = r011.A08;
                                str4 = r011.A09;
                                obj3 = r011.A05;
                                obj4 = r011.A03;
                                str5 = r011.A0A;
                                str6 = r011.A07;
                                obj5 = r011.A02;
                                obj6 = r011.A04;
                                i2 = 2;
                                break;
                            default:
                                r6 = new AnonymousClass9CC(r011, 10);
                                str3 = r011.A0A;
                                str4 = r011.A08;
                                str5 = r011.A09;
                                obj3 = r011.A05;
                                obj4 = r011.A03;
                                str6 = r011.A07;
                                obj5 = r011.A02;
                                obj6 = r011.A04;
                                i2 = 0;
                                break;
                        }
                    } else {
                        AnonymousClass9CF r012 = (AnonymousClass9CF) this;
                        if (r012.A00 != 0) {
                            obj = new AnonymousClass9CC(r012, 4);
                            str = r012.A05;
                            str2 = r012.A06;
                            obj2 = r012.A02;
                            r3 = r012.A03;
                            i = 1;
                        } else {
                            r3 = new AnonymousClass9CC(r012, 2);
                            str = r012.A05;
                            str2 = r012.A06;
                            obj = r012.A04;
                            obj2 = r012.A02;
                            i = 0;
                        }
                    }
                    JniBridge.jvidispatchIOOOOOOOOO(i2, str3, str4, str5, str6, obj6, r6, obj3, obj4, obj5);
                    return;
                }
                JniBridge.jvidispatchIOOOOO(i, str, str2, r3, obj, obj2);
                return;
            }
            JniBridge.jvidispatchIOOOOOOOOOO(i3, str7, str8, str9, obj9, r5, obj7, obj8, bArr, bArr2, map);
        }
    }

    public final void A02(Object obj) {
        this.A01 = obj;
        this.A00.countDown();
    }

    public static final Object A00(C19951A0i a0i) {
        try {
            a0i.A01();
            a0i.A00.await(60000, TimeUnit.MILLISECONDS);
            return a0i.A01;
        } catch (Exception e) {
            Log.e("AsyncRunnable/runAndWait", e);
            return null;
        }
    }
}
