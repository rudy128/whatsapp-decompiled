package com.whatsapp.pininchat.expirationDialog;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass190;
import X.AnonymousClass1DF;
import X.AnonymousClass1OR;
import X.AnonymousClass1W6;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4M8;
import X.AnonymousClass4a6;
import X.AnonymousClass7AL;
import X.AnonymousClass7AQ;
import X.C111195io;
import X.C122736Rs;
import X.C124936aE;
import X.C132056m6;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C29351c6;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C41561wd;
import X.C445823z;
import X.C58052k4;
import X.C62262r7;
import X.C64052u8;
import X.C72473Md;
import X.C73203Rj;
import X.C86194Qr;
import X.C99164sN;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.SingleSelectionDialogRadioGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PinInChatExpirationDialogFragment extends Hilt_PinInChatExpirationDialogFragment {
    public AnonymousClass190 A00;
    public C124936aE A01;
    public C86194Qr A02;
    public C111195io A03;
    public C132056m6 A04;
    public AnonymousClass206 A05;
    public final C18100vl A06 = AnonymousClass1DF.A01(new C99164sN(this, 16));

    public static final void A00(View view, PinInChatExpirationDialogFragment pinInChatExpirationDialogFragment, AnonymousClass206 r15) {
        String str;
        String A022;
        int A002;
        C111195io r6 = pinInChatExpirationDialogFragment.A03;
        if (r6 == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        AnonymousClass206 A003 = C111195io.A00(r6);
        if (A003 != null) {
            long A012 = AnonymousClass11P.A01(r6.A01);
            int A004 = C122736Rs.THIRTY_DAYS.A00();
            AnonymousClass206 A005 = C111195io.A00(r6);
            if (A005 != null) {
                for (C122736Rs r1 : r6.A0T()) {
                    if (!r1.debugMenuOnlyField && (A002 = r6.A03.A00(r1, A005)) > A004) {
                        A004 = A002;
                    }
                }
            }
            long A032 = A012 + C17890vO.A03(A004);
            Long l = A003.A0U;
            if (l != null && l.longValue() < A032) {
                C28931bI.A00(view, 2131433849).A02().setVisibility(0);
            }
        }
        SingleSelectionDialogRadioGroup singleSelectionDialogRadioGroup = (SingleSelectionDialogRadioGroup) C18070vi.A05(view, 2131435464);
        C111195io r0 = pinInChatExpirationDialogFragment.A03;
        if (r0 != null) {
            List A0T = r0.A0T();
            ArrayList A0D = C29351c6.A0D(A0T);
            Iterator it = A0T.iterator();
            while (true) {
                if (it.hasNext()) {
                    C122736Rs r5 = (C122736Rs) it.next();
                    if (pinInChatExpirationDialogFragment.A04 == null) {
                        str = "expirationDurationUtils";
                        break;
                    }
                    Context A042 = AnonymousClass3MY.A04(view);
                    C18000vb r62 = pinInChatExpirationDialogFragment.A01;
                    C18070vi.A0W(r62);
                    C18070vi.A0d(r5, 2);
                    if (r5 == C122736Rs.DYNAMIC_DURATION) {
                        if (r15 instanceof C445823z) {
                            C445823z r02 = (C445823z) r15;
                            Long l2 = r02.A03;
                            long j = r02.A00;
                            if (l2 == null || l2.longValue() <= j) {
                                A022 = C72473Md.A0k(A042.getResources(), 3, 2131755133);
                                C18070vi.A0b(A022);
                                A0D.add(new AnonymousClass4M8(r5, A022));
                            } else {
                                A022 = A042.getString(2131890116);
                                C18070vi.A0b(A022);
                                A0D.add(new AnonymousClass4M8(r5, A022));
                            }
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            AnonymousClass206.A07(r15, "Dynamic duration is not supported for the message type: ", A10);
                            C17960vV.A0F(false, A10.toString());
                        }
                    }
                    A022 = C64052u8.A02(r62, r5.durationInDisplayTimeUnit, r5.displayTimeUnit);
                    if (r5.debugMenuOnlyField) {
                        A022 = AnonymousClass000.A0y(" [Internal Only]", AnonymousClass000.A11(A022));
                    }
                    C18070vi.A0b(A022);
                    A0D.add(new AnonymousClass4M8(r5, A022));
                } else {
                    C86194Qr r12 = pinInChatExpirationDialogFragment.A02;
                    if (r12 != null) {
                        C111195io r03 = pinInChatExpirationDialogFragment.A03;
                        if (r03 != null) {
                            r12.A00(singleSelectionDialogRadioGroup, r03.A00, A0D);
                            AnonymousClass3MX.A1Q(new PinInChatExpirationDialogFragment$addPinExpirationOptionSelections$1(pinInChatExpirationDialogFragment, (C30391dr) null), AnonymousClass3MZ.A0H(pinInChatExpirationDialogFragment));
                            return;
                        }
                    } else {
                        str = "radioGroupManager";
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public Dialog A27(Bundle bundle) {
        C124936aE r1 = this.A01;
        if (r1 != null) {
            AnonymousClass206 r7 = this.A05;
            AnonymousClass10E r12 = r1.A00.A02;
            AnonymousClass11P A6O = AnonymousClass10E.A6O(r12);
            C18030ve A8r = AnonymousClass10E.A8r(r12);
            C58052k4 r5 = (C58052k4) r12.A8T.get();
            C62262r7 r6 = (C62262r7) r12.A8S.get();
            this.A03 = new C111195io(A6O, A8r, AnonymousClass10E.AHP(r12), r5, r6, r7, (AnonymousClass205) this.A06.getValue(), (AnonymousClass1W6) r12.A3w.get(), AnonymousClass3MZ.A1B(r12));
            C73203Rj A032 = AnonymousClass4a6.A03(this);
            A032.A0E(2131894569);
            A032.A0g(this, new AnonymousClass7AQ(this, 20), 2131894568);
            AnonymousClass7AL.A00(this, A032, 6, 2131898766);
            View A0B = AnonymousClass3MX.A0B(AnonymousClass3MZ.A0E(this), (ViewGroup) null, 2131626463, false);
            AnonymousClass206 r0 = this.A05;
            if (r0 != null) {
                A00(A0B, this, r0);
            } else {
                C37581pm A0H = AnonymousClass3MZ.A0H(this);
                PinInChatExpirationDialogFragment$addDialogContent$2$1 pinInChatExpirationDialogFragment$addDialogContent$2$1 = new PinInChatExpirationDialogFragment$addDialogContent$2$1(A0B, this, this, (C30391dr) null);
                AnonymousClass1OR r02 = AnonymousClass1OR.A00;
                Integer num = AnonymousClass00R.A00;
                C30451dy.A02(num, r02, pinInChatExpirationDialogFragment$addDialogContent$2$1, A0H);
                C111195io r3 = this.A03;
                if (r3 == null) {
                    AnonymousClass3MW.A1H();
                    throw null;
                }
                C30451dy.A02(num, r3.A08, new PinInChatExpirationDialogViewModel$queryFMessageFromDatabase$1(r3, (C30391dr) null), C41561wd.A00(r3));
            }
            A032.setView(A0B);
            return AnonymousClass3MY.A0L(A032);
        }
        C18070vi.A11("viewModelFactory");
        throw null;
    }
}
