package com.whatsapp.permissions;

import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LC;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass86E;
import X.C177659Ab;
import X.C18030ve;
import X.C18070vi;
import X.C19830z4;
import X.C26302CxJ;
import X.C72453Mb;
import X.C72473Md;
import X.C824848d;
import X.C825348i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;

public abstract class RequestPermissionsBottomSheet extends Hilt_RequestPermissionsBottomSheet implements AnonymousClass86E {
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass1LC A02;
    public AnonymousClass11C A03;
    public C19830z4 A04;
    public C18030ve A05;
    public AnonymousClass00H A06;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131626449, false);
    }

    public void A21(Bundle bundle, View view) {
        View.OnClickListener r1;
        String str;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Bundle A15 = A15();
        String[] stringArray = A15.getStringArray("permissions");
        if (stringArray == null) {
            stringArray = new String[0];
        }
        int i = A15.getInt("message_id");
        TextView A0E = AnonymousClass3Ma.A0E(view, 2131433770);
        Context context = view.getContext();
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = view.getContext().getString(2131898700);
        AnonymousClass3MY.A0y(context, A0E, A1a, i);
        int i2 = A15.getInt("title_id");
        TextView A0J = AnonymousClass3MW.A0J(view, 2131433772);
        Context context2 = view.getContext();
        Object[] A1a2 = AnonymousClass3MW.A1a();
        A1a2[0] = view.getContext().getString(2131898700);
        AnonymousClass3MY.A0y(context2, A0J, A1a2, i2);
        int i3 = A15.getInt("nth_details_id");
        if (i3 != 0) {
            AnonymousClass3MY.A1X(A1H(i3), AnonymousClass3MW.A0J(view, 2131433223));
        }
        C72473Md.A0u(A15, AnonymousClass3Ma.A0C(view, 2131433767), "icon_id");
        C72473Md.A0u(A15, AnonymousClass3Ma.A0C(view, 2131431988), "line1_icon_id");
        C72473Md.A0u(A15, AnonymousClass3Ma.A0C(view, 2131431990), "line2_icon_id");
        C72473Md.A0u(A15, AnonymousClass3Ma.A0C(view, 2131431993), "line3_icon_id");
        int i4 = A15.getInt("line1_message_id");
        TextEmojiLabel A0c = C72453Mb.A0c(view, 2131431989);
        if (i4 != 0) {
            Context A14 = A14();
            C18030ve r10 = this.A05;
            if (r10 != null) {
                AnonymousClass1KB r7 = this.A01;
                if (r7 != null) {
                    AnonymousClass1L9 r6 = this.A00;
                    if (r6 != null) {
                        AnonymousClass11C r9 = this.A03;
                        if (r9 != null) {
                            String A1H = A1H(i4);
                            AnonymousClass1LC r2 = this.A02;
                            if (r2 != null) {
                                C26302CxJ.A0K(A14, r2.A00("https://www.whatsapp.com/security"), r6, r7, A0c, r9, r10, A1H, "learn-more");
                            } else {
                                str = "waLinkFactory";
                            }
                        } else {
                            str = "systemServices";
                        }
                    } else {
                        str = "activityUtils";
                    }
                } else {
                    str = "globalUI";
                }
            } else {
                str = "abProps";
            }
            C18070vi.A11(str);
            throw null;
        }
        int i5 = A15.getInt("line2_message_id");
        TextView A0E2 = AnonymousClass3Ma.A0E(view, 2131431991);
        if (i5 != 0) {
            A0E2.setText(i5);
        }
        int i6 = A15.getInt("line3_message_id");
        TextView A0E3 = AnonymousClass3Ma.A0E(view, 2131431994);
        if (i6 != 0) {
            Context context3 = view.getContext();
            Object[] A1a3 = AnonymousClass3MW.A1a();
            A1a3[0] = view.getContext().getString(2131898700);
            AnonymousClass3MY.A0y(context3, A0E3, A1a3, i6);
            A0E3.setVisibility(0);
        }
        String string = A15.getString("permission_requestor_screen_type");
        boolean z = A15.getBoolean("is_first_time_request");
        boolean z2 = A15.getBoolean("should_disable_cancel_on_outside_click");
        boolean z3 = A15.getBoolean("should_hide_cancel_button_on_1st_time");
        View A052 = C18070vi.A05(view, 2131428811);
        A052.setOnClickListener(new C825348i(7, string, this));
        if (z2) {
            A2D(false);
        }
        if (z && z3) {
            A052.setVisibility(8);
        }
        View A053 = C18070vi.A05(view, 2131433223);
        TextView A0E4 = AnonymousClass3Ma.A0E(view, 2131435879);
        if (z) {
            A053.setVisibility(8);
            r1 = new C824848d(stringArray, this, string, 1);
        } else {
            A053.setVisibility(0);
            A0E4.setText(2131894341);
            r1 = new C177659Ab(this, 43);
        }
        A0E4.setOnClickListener(r1);
        if (A2L()) {
            AnonymousClass3MX.A0C(view, 2131433771).setBackground((Drawable) null);
        }
    }

    public int A25() {
        return 2132083612;
    }
}
