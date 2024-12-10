package com.whatsapp.invites;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E7;
import X.AnonymousClass1EC;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass733;
import X.AnonymousClass78T;
import X.C146447Pd;
import X.C17960vV;
import X.C18000vb;
import X.C18070vi;
import X.C24921Me;
import X.C27201Vd;
import X.C37451pZ;
import X.C72463Mc;
import X.C73583Wn;
import X.C89954dI;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

public final class SMSPreviewInviteBottomSheetFragment extends Hilt_SMSPreviewInviteBottomSheetFragment {
    public AnonymousClass1KB A00;
    public AnonymousClass11S A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public C27201Vd A04;
    public AnonymousClass733 A05;
    public C18000vb A06;
    public AnonymousClass1CJ A07;
    public C73583Wn A08;
    public AnonymousClass10I A09;
    public AnonymousClass00H A0A;
    public boolean A0B = true;
    public boolean A0C;
    public C37451pZ A0D;
    public final ArrayList A0E = AnonymousClass000.A13();
    public final ArrayList A0F = AnonymousClass000.A13();

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626977, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        int i;
        String A1H;
        String str2;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        View A052 = C18070vi.A05(view, 2131429504);
        C27201Vd r3 = this.A04;
        if (r3 != null) {
            this.A0D = r3.A06(A1D(), "hybrid-invite-group-participants-activity");
            Bundle A15 = A15();
            Iterator it = AnonymousClass3MZ.A1A(A15, UserJid.class, "sms_invites_jids").iterator();
            while (it.hasNext()) {
                this.A0F.add(it.next());
            }
            this.A0B = A15.getBoolean("all_participants_non_wa_in_request", true);
            TextView A0E2 = AnonymousClass3Ma.A0E(A052, 2131435169);
            Resources A092 = AnonymousClass3MZ.A09(this);
            ArrayList arrayList = this.A0F;
            String quantityString = A092.getQuantityString(2131755366, arrayList.size());
            C18070vi.A0X(quantityString);
            A0E2.setText(quantityString);
            AnonymousClass1EC A022 = AnonymousClass1EC.A01.A02(A15.getString("group_jid"));
            C17960vV.A07(A022);
            C18070vi.A0X(A022);
            TextView A0E3 = AnonymousClass3Ma.A0E(A052, 2131435168);
            if (arrayList.size() == 1) {
                int i2 = 2131895699;
                if (A01(this, A022)) {
                    i2 = 2131895702;
                }
                Object[] objArr = new Object[1];
                AnonymousClass1M9 r1 = this.A02;
                if (r1 != null) {
                    AnonymousClass1E7 A0E4 = r1.A0E((AnonymousClass1BI) arrayList.get(0));
                    if (A0E4 == null || (str2 = A0E4.A0K()) == null) {
                        str2 = "";
                    }
                    A1H = AnonymousClass3MX.A16(this, str2, objArr, 0, i2);
                } else {
                    str = "contactManager";
                }
            } else {
                if (this.A0B || arrayList.size() <= 1) {
                    i = 2131895700;
                    if (A01(this, A022)) {
                        i = 2131895703;
                    }
                } else {
                    i = 2131895701;
                    if (A01(this, A022)) {
                        i = 2131895704;
                    }
                }
                A1H = A1H(i);
            }
            C18070vi.A0X(A1H);
            A0E3.setText(A1H);
            RecyclerView recyclerView = (RecyclerView) C18070vi.A05(A052, 2131431798);
            C72463Mc.A0z(A1B(), recyclerView, 0);
            Context A14 = A14();
            AnonymousClass1CJ r11 = this.A07;
            if (r11 != null) {
                LayoutInflater from = LayoutInflater.from(A1B());
                C18070vi.A0X(from);
                C24921Me r8 = this.A03;
                if (r8 != null) {
                    C18000vb r10 = this.A06;
                    if (r10 != null) {
                        C37451pZ r9 = this.A0D;
                        if (r9 == null) {
                            str = "contactPhotoLoader";
                        } else {
                            C73583Wn r5 = new C73583Wn(A14, from, r8, r9, r10, r11);
                            this.A08 = r5;
                            recyclerView.setAdapter(r5);
                            AnonymousClass10I r52 = this.A09;
                            if (r52 != null) {
                                r52.CGN(new C146447Pd(this, 32));
                                C89954dI.A00(AnonymousClass1HF.A06(A052, 2131428442), this, 33);
                                AnonymousClass1HF.A06(A052, 2131428448).setOnClickListener(new AnonymousClass78T(this, A15.getInt("invite_trigger_source"), 18, A022));
                                return;
                            }
                            str = "waWorkers";
                        }
                    } else {
                        str = "whatsAppLocale";
                    }
                } else {
                    str = "waContactNames";
                }
            } else {
                str = "chatsCache";
            }
        } else {
            str = "contactPhotos";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A00(SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment, String str) {
        AnonymousClass1KB r1 = sMSPreviewInviteBottomSheetFragment.A00;
        if (r1 != null) {
            r1.A0H(str, 0);
        } else {
            AnonymousClass3MW.A1C();
            throw null;
        }
    }

    public static final boolean A01(SMSPreviewInviteBottomSheetFragment sMSPreviewInviteBottomSheetFragment, AnonymousClass1EC r2) {
        AnonymousClass1CJ r0 = sMSPreviewInviteBottomSheetFragment.A07;
        if (r0 != null) {
            int A062 = r0.A06(r2);
            if (A062 == 1 || A062 == 3) {
                return true;
            }
            return false;
        }
        AnonymousClass3MW.A1I();
        throw null;
    }

    public void A1K() {
        super.A1K();
        if (!this.A0C) {
            A00(this, AnonymousClass3MY.A0n(this, 2131891467));
        }
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && !A1B.isFinishing()) {
            A1B.finish();
        }
    }

    public void A1r() {
        super.A1r();
        C37451pZ r1 = this.A0D;
        if (r1 == null) {
            C18070vi.A11("contactPhotoLoader");
            throw null;
        } else {
            r1.A02();
        }
    }
}
