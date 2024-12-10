package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Ra  reason: invalid class name and case insensitive filesystem */
public abstract class C181579Ra {
    public static final C163108Ts A00(AnonymousClass8X8 r7, C58072k6 r8) {
        C166318ch r1;
        int i;
        C166348ck r0 = ((C166418cr) r7.A00).templateMessage_;
        if (r0 == null) {
            r0 = C166348ck.DEFAULT_INSTANCE;
        }
        C163108Ts r3 = (C163108Ts) AnonymousClass8BS.A0K(r0).A0O();
        String str = r8.A02;
        C165868bt r12 = (C165868bt) C17880vN.A0G(r3);
        int i2 = C165868bt.DOCUMENT_MESSAGE_FIELD_NUMBER;
        str.getClass();
        r12.bitField0_ |= 32;
        r12.hydratedContentText_ = str;
        String str2 = r8.A03;
        if (!(str2 == null || str2.length() == 0)) {
            C165868bt r13 = (C165868bt) C17880vN.A0G(r3);
            r13.bitField0_ |= 64;
            r13.hydratedFooterText_ = str2;
        }
        List<C61762qD> list = r8.A06;
        if (list != null && !list.isEmpty()) {
            ArrayList A13 = AnonymousClass000.A13();
            for (C61762qD r72 : list) {
                C23624Bmt A0N = C166318ch.DEFAULT_INSTANCE.A0N();
                int i3 = r72.A07;
                if (i3 == 1) {
                    C23624Bmt A0N2 = C164438Yv.DEFAULT_INSTANCE.A0N();
                    String str3 = r72.A01;
                    C164438Yv r14 = (C164438Yv) C17880vN.A0G(A0N2);
                    str3.getClass();
                    r14.bitField0_ |= 2;
                    r14.id_ = str3;
                    String str4 = r72.A09;
                    C164438Yv r15 = (C164438Yv) C17880vN.A0G(A0N2);
                    str4.getClass();
                    r15.bitField0_ |= 1;
                    r15.displayText_ = str4;
                    r1 = (C166318ch) C17880vN.A0G(A0N);
                    C23577Bm6 A0C = A0N2.A0C();
                    A0C.getClass();
                    r1.hydratedButton_ = A0C;
                    i = 1;
                } else if (i3 == 3) {
                    C23624Bmt A0N3 = C164428Yu.DEFAULT_INSTANCE.A0N();
                    String str5 = r72.A09;
                    C164428Yu r16 = (C164428Yu) C17880vN.A0G(A0N3);
                    str5.getClass();
                    r16.bitField0_ |= 1;
                    r16.displayText_ = str5;
                    String str6 = r72.A01;
                    C164428Yu r17 = (C164428Yu) C17880vN.A0G(A0N3);
                    str6.getClass();
                    r17.bitField0_ |= 2;
                    r17.phoneNumber_ = str6;
                    r1 = (C166318ch) C17880vN.A0G(A0N);
                    C23577Bm6 A0C2 = A0N3.A0C();
                    A0C2.getClass();
                    r1.hydratedButton_ = A0C2;
                    i = 3;
                } else if (i3 == 2) {
                    C23624Bmt A0N4 = C165518bH.DEFAULT_INSTANCE.A0N();
                    String str7 = r72.A09;
                    C165518bH r18 = (C165518bH) C17880vN.A0G(A0N4);
                    str7.getClass();
                    r18.bitField0_ |= 1;
                    r18.displayText_ = str7;
                    String str8 = r72.A01;
                    C165518bH r19 = (C165518bH) C17880vN.A0G(A0N4);
                    str8.getClass();
                    r19.bitField0_ |= 2;
                    r19.url_ = str8;
                    C23577Bm6 A09 = AnonymousClass8BS.A09(A0N4, A0N);
                    r1 = (C166318ch) A0N.A00;
                    A09.getClass();
                    r1.hydratedButton_ = A09;
                    i = 2;
                } else {
                    int i4 = r72.A06;
                    C166318ch r110 = (C166318ch) C17880vN.A0G(A0N);
                    r110.bitField0_ |= 8;
                    r110.index_ = i4;
                    A13.add(A0N.A0C());
                }
                r1.hydratedButtonCase_ = i;
                int i42 = r72.A06;
                C166318ch r1102 = (C166318ch) C17880vN.A0G(A0N);
                r1102.bitField0_ |= 8;
                r1102.index_ = i42;
                A13.add(A0N.A0C());
            }
            C165868bt r2 = (C165868bt) C17880vN.A0G(r3);
            EE9 ee9 = r2.hydratedButtons_;
            if (!((C27296DbR) ee9).A00) {
                ee9 = C23577Bm6.A09(ee9);
                r2.hydratedButtons_ = ee9;
            }
            DND.A09(A13, ee9);
        }
        return r3;
    }
}
