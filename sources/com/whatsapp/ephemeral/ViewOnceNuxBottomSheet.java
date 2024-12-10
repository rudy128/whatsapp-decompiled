package com.whatsapp.ephemeral;

import X.AnonymousClass129;
import X.AnonymousClass18K;
import X.AnonymousClass1L9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4PP;
import X.AnonymousClass86E;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C25241Nl;
import X.C34441kU;
import X.C72453Mb;
import X.C81483zJ;
import X.C89934dG;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class ViewOnceNuxBottomSheet extends Hilt_ViewOnceNuxBottomSheet implements AnonymousClass86E {
    public static final AnonymousClass4PP A0B = new Object();
    public int A00 = -1;
    public AnonymousClass1L9 A01;
    public C18030ve A02;
    public AnonymousClass18K A03;
    public C25241Nl A04;
    public C34441kU A05;
    public AnonymousClass129 A06;
    public boolean A07 = true;
    public String A08 = "-1";
    public boolean A09;
    public boolean A0A;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        Bundle A15 = A15();
        this.A09 = A15.getBoolean("IN_GROUP", false);
        this.A08 = A15.getString("CHAT_JID", "-1");
        this.A00 = A15.getInt("MESSAGE_TYPE", -1);
        this.A0A = A15.getBoolean("FORCE_SHOW", false);
        this.A07 = A15.getBoolean("IS_SENDER", true);
        return layoutInflater.inflate(2131627372, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        int i;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        View A0C = AnonymousClass3MX.A0C(view, 2131436853);
        View A0C2 = AnonymousClass3MX.A0C(view, 2131436854);
        View A0C3 = AnonymousClass3MX.A0C(view, 2131436852);
        TextView A0W = C72453Mb.A0W(view, 2131436859);
        TextView A0W2 = C72453Mb.A0W(view, 2131436855);
        TextView A0W3 = C72453Mb.A0W(view, 2131436857);
        if (this.A07) {
            A0W.setText(2131897919);
            A0W2.setText(2131897920);
            i = 2131897918;
        } else {
            C18030ve r9 = this.A02;
            if (r9 == null) {
                AnonymousClass3MW.A1A();
                throw null;
            } else if (C18020vd.A05(C18040vf.A02, r9, 2802)) {
                A0W.setText(2131897925);
                A0W2.setText(2131897923);
                i = 2131897924;
            } else if (this.A00 == 42) {
                A0W.setText(2131897936);
                A0W2.setText(2131897914);
                i = 2131897937;
            } else {
                A0W.setText(2131897955);
                A0W2.setText(2131897915);
                i = 2131897938;
            }
        }
        A0W3.setText(i);
        C89934dG.A00(A0C, this, 26);
        C89934dG.A00(A0C2, this, 27);
        C89934dG.A00(A0C3, this, 28);
        A01(this, false);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        C18070vi.A0d(dialogInterface, 0);
        C34441kU r1 = this.A05;
        if (r1 != null) {
            if (this.A07) {
                str = "ephemeral_view_once";
            } else {
                str = "ephemeral_view_once_receiver";
            }
            r1.A00.A00(str, (Object) null);
            super.onDismiss(dialogInterface);
            return;
        }
        C18070vi.A11("nuxManagerBridge");
        throw null;
    }

    public static final void A00(ViewOnceNuxBottomSheet viewOnceNuxBottomSheet) {
        String str;
        C34441kU r1 = viewOnceNuxBottomSheet.A05;
        if (r1 != null) {
            if (viewOnceNuxBottomSheet.A07) {
                str = "ephemeral_view_once";
            } else {
                str = "ephemeral_view_once_receiver";
            }
            r1.A00.A00(str, (Object) null);
            viewOnceNuxBottomSheet.A29();
            return;
        }
        C18070vi.A11("nuxManagerBridge");
        throw null;
    }

    public static final void A01(ViewOnceNuxBottomSheet viewOnceNuxBottomSheet, boolean z) {
        String str;
        int i;
        C81483zJ r3 = new C81483zJ();
        if (!C18070vi.A18(viewOnceNuxBottomSheet.A08, "-1")) {
            r3.A00 = Boolean.valueOf(viewOnceNuxBottomSheet.A09);
            C25241Nl r1 = viewOnceNuxBottomSheet.A04;
            if (r1 != null) {
                r3.A03 = r1.A05(viewOnceNuxBottomSheet.A08);
                int i2 = 2;
                if (viewOnceNuxBottomSheet.A00 == 42) {
                    i2 = 1;
                }
                r3.A01 = Integer.valueOf(i2);
                if (viewOnceNuxBottomSheet.A07) {
                    i = 2;
                    if (z) {
                        i = 7;
                    }
                } else {
                    i = 5;
                    if (z) {
                        i = 10;
                    }
                }
                r3.A02 = Integer.valueOf(i);
                AnonymousClass18K r0 = viewOnceNuxBottomSheet.A03;
                if (r0 != null) {
                    r0.CC7(r3);
                    return;
                }
                str = "wamRuntime";
            } else {
                str = "wamThreadIdManager";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public void A1u() {
        String str;
        super.A1u();
        if (!this.A0A) {
            C34441kU r3 = this.A05;
            if (r3 != null) {
                if (this.A07) {
                    str = "ephemeral_view_once";
                } else {
                    str = "ephemeral_view_once_receiver";
                }
                if (r3.A00.A01((Object) null, str)) {
                    A29();
                    return;
                }
                return;
            }
            C18070vi.A11("nuxManagerBridge");
            throw null;
        }
    }
}
