package com.whatsapp.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LC;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C26302CxJ;
import X.C72453Mb;
import X.C73203Rj;
import X.C89924dF;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.TextEmojiLabel;
import java.util.HashMap;

public final class UnrecoverableErrorDialogFragment extends Hilt_UnrecoverableErrorDialogFragment {
    public static final String A04;
    public AnonymousClass1L9 A00;
    public AnonymousClass1KB A01;
    public AnonymousClass1LC A02;
    public AnonymousClass11C A03;

    public Dialog A27(Bundle bundle) {
        String str;
        View A09 = AnonymousClass3MX.A09(LayoutInflater.from(A14()), (ViewGroup) null, 2131627251);
        HashMap A11 = C17880vN.A11();
        AnonymousClass1LC r3 = this.A02;
        if (r3 != null) {
            Uri A002 = r3.A00("https://faq.whatsapp.com/807139050546238/");
            C18070vi.A0X(A002);
            A11.put("uninstall-whatsapp", A002);
            TextEmojiLabel A0c = C72453Mb.A0c(A09, 2131429983);
            TextEmojiLabel A0c2 = C72453Mb.A0c(A09, 2131429982);
            AnonymousClass1LC r32 = this.A02;
            if (r32 != null) {
                String str2 = A04;
                Uri A003 = r32.A00(str2);
                C18070vi.A0X(A003);
                A11.put("install-whatsapp-playstore", A003);
                AnonymousClass1LC r4 = this.A02;
                if (r4 != null) {
                    Uri A004 = r4.A00("https://whatsapp.com/android/");
                    C18070vi.A0X(A004);
                    A11.put("install-whatsapp-website", A004);
                    Context context = A09.getContext();
                    C18030ve r10 = this.A02;
                    AnonymousClass1KB r7 = this.A01;
                    if (r7 != null) {
                        AnonymousClass1L9 r6 = this.A00;
                        if (r6 != null) {
                            AnonymousClass11C r9 = this.A03;
                            if (r9 != null) {
                                C26302CxJ.A0M(context, r6, r7, A0c, r9, r10, A09.getContext().getString(2131897345), A11);
                                Context context2 = A09.getContext();
                                C18030ve r5 = this.A02;
                                AnonymousClass1KB r15 = this.A01;
                                if (r15 != null) {
                                    AnonymousClass1L9 r14 = this.A00;
                                    if (r14 != null) {
                                        AnonymousClass11C r42 = this.A03;
                                        if (r42 != null) {
                                            boolean z = false;
                                            try {
                                                PackageManager packageManager = A14().getPackageManager();
                                                packageManager.getPackageInfo("com.android.vending", 0);
                                                if (AnonymousClass3MY.A07(Uri.parse(str2)).resolveActivity(packageManager) != null) {
                                                    z = true;
                                                }
                                            } catch (PackageManager.NameNotFoundException unused) {
                                            }
                                            Context context3 = A09.getContext();
                                            int i = 2131897344;
                                            if (z) {
                                                i = 2131897343;
                                            }
                                            C26302CxJ.A0M(context2, r14, r15, A0c2, r42, r5, context3.getString(i), A11);
                                            C89924dF.A00(C18070vi.A05(A09, 2131433260), this, 46);
                                            C73203Rj A042 = AnonymousClass4a6.A04(this);
                                            A042.A0c(A09);
                                            return AnonymousClass3MY.A0L(A042);
                                        }
                                    }
                                }
                            }
                            str = "systemServices";
                            C18070vi.A11(str);
                            throw null;
                        }
                        str = "activityUtils";
                        C18070vi.A11(str);
                        throw null;
                    }
                    str = "globalUI";
                    C18070vi.A11(str);
                    throw null;
                }
            }
        }
        str = "waLinkFactory";
        C18070vi.A11(str);
        throw null;
    }

    static {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("market://details?id=");
        A04 = AnonymousClass000.A0y("com.whatsapp", A10);
    }
}
