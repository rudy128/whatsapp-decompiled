package com.whatsapp;

import X.A8V;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass12E;
import X.AnonymousClass18K;
import X.AnonymousClass1Vo;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4I0;
import X.C108945cZ;
import X.C108955ca;
import X.C114965t2;
import X.C1181262g;
import X.C132846nh;
import X.C133846pb;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19830z4;
import X.C219217x;
import X.C27301Vn;
import X.C72453Mb;
import X.C72843Ns;
import X.C99014s7;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.permissions.RequestNotificationPermissionActivity;
import com.whatsapp.registration.directmigration.RequestPermissionFromSisterAppActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class RequestPermissionActivity extends C114965t2 {
    public C132846nh A00;
    public AnonymousClass12E A01;
    public AnonymousClass11C A02;
    public C219217x A03;
    public C19830z4 A04;
    public AnonymousClass18K A05;
    public C133846pb A06;
    public AnonymousClass00H A07;
    public String A08;
    public boolean A09;
    public Set A0A;
    public boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f4, code lost:
        if (r1 != false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0102, code lost:
        if (r8 != false) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r10 = r15
            r6 = r16
            super.onCreate(r6)
            android.os.Bundle r5 = X.AnonymousClass3MY.A09(r15)
            if (r5 != 0) goto L_0x0015
            java.lang.String r0 = "request/permission/activity/extra is null"
        L_0x000e:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r15.finish()
            return
        L_0x0015:
            java.lang.String r0 = "permission_requester_screen"
            java.lang.String r0 = r5.getString(r0)
            r15.A08 = r0
            java.lang.String r0 = "permissions"
            java.lang.String[] r12 = r5.getStringArray(r0)
            if (r12 != 0) goto L_0x0028
            java.lang.String r0 = "request/permission/activity/no-permissions-passed"
            goto L_0x000e
        L_0x0028:
            java.lang.String r0 = "title_id"
            int r2 = r5.getInt(r0)
            r1 = 2130970796(0x7f0408ac, float:1.7550312E38)
            r0 = 2131102217(0x7f060a09, float:1.7816866E38)
            int r3 = X.AnonymousClass3Ma.A00(r15, r1, r0)
            android.view.Window r0 = r15.getWindow()
            X.AnonymousClass3Ma.A1H(r0, r3)
            android.view.Window r1 = r15.getWindow()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.addFlags(r0)
            android.view.Window r1 = r15.getWindow()
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r1.clearFlags(r0)
            r0 = 2130970286(0x7f0406ae, float:1.7549278E38)
            int r0 = X.AnonymousClass4Z9.A00(r15, r0)
            int r1 = X.C19740yt.A00(r15, r0)
            r0 = 1050253722(0x3e99999a, float:0.3)
            int r1 = X.AnonymousClass1Z2.A03(r0, r3, r1)
            android.view.Window r0 = r15.getWindow()
            r0.setStatusBarColor(r1)
            r0 = 2131626448(0x7f0e09d0, float:1.8880132E38)
            r15.setContentView((int) r0)
            java.lang.String r0 = "entry_point"
            int r11 = r5.getInt(r0)
            java.lang.String r0 = "permission_value_for_logging"
            int r13 = r5.getInt(r0)
            r0 = 2131428811(0x7f0b05cb, float:1.8479277E38)
            r4 = 2131428811(0x7f0b05cb, float:1.8479277E38)
            android.view.View r1 = r15.findViewById(r0)
            r3 = 0
            X.6L9 r0 = new X.6L9
            r0.<init>(r15, r11, r13, r3)
            r1.setOnClickListener(r0)
            if (r2 == 0) goto L_0x00a1
            r0 = 2131433772(0x7f0b192c, float:1.848934E38)
            r1 = 2131433772(0x7f0b192c, float:1.848934E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r15, r0)
            r0.setText(r2)
            X.AnonymousClass3MX.A1H(r15, r1, r3)
        L_0x00a1:
            java.lang.String r0 = "drawable_id"
            int r1 = r5.getInt(r0)
            r2 = 1
            if (r1 == 0) goto L_0x01bf
            r0 = 2131433768(0x7f0b1928, float:1.848933E38)
            android.widget.ImageView r0 = X.AnonymousClass3MX.A0I(r15, r0)
            r0.setImageResource(r1)
            r0 = 2131433767(0x7f0b1927, float:1.8489329E38)
            android.view.View r0 = r15.findViewById(r0)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131433769(0x7f0b1929, float:1.8489333E38)
            X.AnonymousClass3MX.A1H(r15, r0, r1)
        L_0x00c6:
            java.lang.String r0 = "cancel_button_message_id"
            int r1 = r5.getInt(r0)
            if (r1 == 0) goto L_0x00d5
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r15, r4)
            r0.setText(r1)
        L_0x00d5:
            if (r16 == 0) goto L_0x00df
            java.lang.String r0 = "permissions_requested"
            boolean r0 = r6.getBoolean(r0, r3)
            r15.A09 = r0
        L_0x00df:
            boolean r1 = X.AnonymousClass74O.A0N(r15, r12)
            java.lang.String r0 = "force_ui"
            boolean r0 = r5.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x00f6
            java.lang.String r0 = "perm_denial_message_id"
            int r0 = r5.getInt(r0)
            if (r0 == 0) goto L_0x00f6
            r9 = 0
            if (r1 == 0) goto L_0x00f7
        L_0x00f6:
            r9 = 1
        L_0x00f7:
            X.0z4 r0 = r15.A04
            if (r0 == 0) goto L_0x0208
            boolean r8 = X.AnonymousClass74O.A0S(r0, r12)
            if (r1 != 0) goto L_0x0104
            r6 = 1
            if (r8 == 0) goto L_0x0105
        L_0x0104:
            r6 = 0
        L_0x0105:
            java.lang.String r0 = "hide_permissions_rationale"
            boolean r7 = r5.getBoolean(r0, r3)
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "minimal_partial_permissions"
            java.lang.String[] r4 = r1.getStringArrayExtra(r0)
            if (r4 == 0) goto L_0x0126
            int r0 = r4.length
            int r1 = X.C200610r.A03(r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>(r1)
            X.C200410p.A0T(r0, r4)
            r15.A0A = r0
        L_0x0126:
            java.lang.String r0 = "extra_for_automation"
            boolean r0 = r5.getBoolean(r0, r3)
            r15.A0B = r0
            X.6pb r0 = r15.A06
            if (r0 == 0) goto L_0x0205
            r0.A00()
            boolean r0 = r15.A09
            if (r0 != 0) goto L_0x01f2
            if (r9 != 0) goto L_0x013d
            if (r8 != 0) goto L_0x01f2
        L_0x013d:
            if (r7 != 0) goto L_0x01f2
            java.lang.String r0 = r15.A3T(r5, r6)
            r15.A3V(r0, r5)
            boolean r0 = r15 instanceof com.whatsapp.registration.directmigration.RequestPermissionFromSisterAppActivity
            if (r0 == 0) goto L_0x017d
            r0 = 2131435879(0x7f0b2167, float:1.8493613E38)
            android.view.View r4 = X.AnonymousClass3MY.A0C(r15, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131894393(0x7f122079, float:1.942359E38)
            r4.setText(r0)
            r1 = 5
        L_0x015a:
            X.6L9 r0 = new X.6L9
            r0.<init>(r15, r11, r13, r1)
            r4.setOnClickListener(r0)
        L_0x0162:
            r0 = 2131433771(0x7f0b192b, float:1.8489337E38)
            X.AnonymousClass3MX.A1H(r15, r0, r3)
            java.lang.String r1 = r15.A08
            if (r1 == 0) goto L_0x0179
            X.00H r0 = r15.A07
            if (r0 == 0) goto L_0x020b
            java.lang.Object r0 = r0.get()
            X.A8V r0 = (X.A8V) r0
            r0.A0C(r1)
        L_0x0179:
            r15.A3U(r11, r13, r2)
            return
        L_0x017d:
            boolean r0 = r15 instanceof com.whatsapp.permissions.RequestNotificationPermissionActivity
            if (r0 == 0) goto L_0x0192
            r0 = 2131435879(0x7f0b2167, float:1.8493613E38)
            android.view.View r4 = X.AnonymousClass3MY.A0C(r15, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2131894393(0x7f122079, float:1.942359E38)
            r4.setText(r0)
            r1 = 4
            goto L_0x015a
        L_0x0192:
            boolean r1 = r15 instanceof com.whatsapp.metaai.voice.permission.RequestMetaAiVoicePermissionActivity
            r0 = 2131435879(0x7f0b2167, float:1.8493613E38)
            android.view.View r4 = X.AnonymousClass3MY.A0H(r15, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r1 == 0) goto L_0x01a9
            if (r6 == 0) goto L_0x01b5
            r0 = 2131894393(0x7f122079, float:1.942359E38)
            r4.setText(r0)
            r1 = 3
            goto L_0x015a
        L_0x01a9:
            if (r6 == 0) goto L_0x01b3
            r0 = 2131894393(0x7f122079, float:1.942359E38)
            r4.setText(r0)
            r1 = 1
            goto L_0x015a
        L_0x01b3:
            r14 = 0
            goto L_0x01b6
        L_0x01b5:
            r14 = 2
        L_0x01b6:
            X.6LA r9 = new X.6LA
            r9.<init>(r10, r11, r12, r13, r14)
            r4.setOnClickListener(r9)
            goto L_0x0162
        L_0x01bf:
            java.lang.String r0 = "drawable_ids"
            int[] r7 = r5.getIntArray(r0)
            if (r7 == 0) goto L_0x00c6
            int r1 = r7.length
            r0 = 3
            if (r1 != r0) goto L_0x00c6
            r0 = 2131433767(0x7f0b1927, float:1.8489329E38)
            android.widget.ImageView r1 = X.AnonymousClass3MX.A0I(r15, r0)
            r0 = r7[r3]
            r1.setImageResource(r0)
            r0 = 2131433768(0x7f0b1928, float:1.848933E38)
            android.widget.ImageView r1 = X.AnonymousClass3MX.A0I(r15, r0)
            r0 = r7[r2]
            r1.setImageResource(r0)
            r0 = 2131433769(0x7f0b1929, float:1.8489333E38)
            android.widget.ImageView r1 = X.AnonymousClass3MX.A0I(r15, r0)
            r0 = 2
            r0 = r7[r0]
            r1.setImageResource(r0)
            goto L_0x00c6
        L_0x01f2:
            r15.A09 = r2
            X.0z4 r0 = r15.A04
            if (r0 == 0) goto L_0x0208
            X.AnonymousClass74O.A0H(r0, r12)
            X.C110885hR.A0B(r15, r12, r3)
            r0 = 2131433771(0x7f0b192b, float:1.8489337E38)
            X.C72463Mc.A19(r15, r0)
            return
        L_0x0205:
            java.lang.String r0 = "cameraOpenTracker"
            goto L_0x020d
        L_0x0208:
            java.lang.String r0 = "waSharedPreferences"
            goto L_0x020d
        L_0x020b:
            java.lang.String r0 = "funnelLogger"
        L_0x020d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C18070vi.A0d(keyEvent, 1);
        return super.onKeyDown(i, keyEvent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String str;
        String str2;
        String str3;
        C18070vi.A0e(strArr, 1, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0) {
            setResult(-1);
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                boolean z = true;
                if (i2 < length) {
                    String str4 = strArr[i2];
                    int i4 = i3 + 1;
                    int i5 = iArr[i3];
                    if (i5 == 0) {
                        C19830z4 r0 = this.A04;
                        if (r0 == null) {
                            str = "waSharedPreferences";
                            break;
                        }
                        C17880vN.A1B(C19830z4.A00(r0), str4);
                        if ("android.permission.WRITE_CONTACTS".equals(str4)) {
                            C132846nh r1 = this.A00;
                            if (r1 == null) {
                                str = "androidContactsContentObserver";
                                break;
                            }
                            AnonymousClass11C r02 = this.A02;
                            if (r02 == null) {
                                str = "systemServices";
                                break;
                            }
                            r1.A00(r02);
                            AnonymousClass12E r03 = this.A01;
                            if (r03 == null) {
                                str = "contactSyncer";
                                break;
                            }
                            r03.A05();
                        }
                        Set set = this.A0A;
                        if (set != null) {
                            set.remove(str4);
                        }
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("request/permission/activity/");
                        A10.append(str4);
                        C17890vO.A1A(A10, " denied");
                        if (this.A0A == null) {
                            setResult(0);
                        }
                    }
                    if (this.A08 != null) {
                        if (i5 != 0) {
                            z = false;
                        }
                        if (C18070vi.A18(str4, "android.permission.WRITE_CONTACTS")) {
                            str2 = "access_to_contacts";
                        } else if (C18070vi.A18(str4, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                            str2 = "access_to_files";
                        } else {
                            continue;
                        }
                        if (z) {
                            str3 = "allow";
                        } else {
                            str3 = "not_now";
                        }
                        AnonymousClass00H r04 = this.A07;
                        if (r04 == null) {
                            str = "funnelLogger";
                            break;
                        }
                        ((A8V) r04.get()).A0H(str2, str3);
                    }
                    i2++;
                    i3 = i4;
                } else {
                    Set set2 = this.A0A;
                    if (set2 != null && C108945cZ.A1U(set2)) {
                        setResult(0);
                    }
                    finish();
                    return;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("permissions_requested", this.A09);
    }

    public final String A3T(Bundle bundle, boolean z) {
        String str;
        String str2;
        String string = bundle.getString("formatted_message_html");
        if (string != null) {
            return string;
        }
        if (z) {
            str = "perm_denial_message_id";
        } else {
            str = "message_id";
        }
        int i = bundle.getInt(str);
        if (i == 0) {
            return null;
        }
        if (z) {
            str2 = "perm_denial_message_params_id";
        } else {
            str2 = "message_params_id";
        }
        int[] intArray = bundle.getIntArray(str2);
        if (intArray == null) {
            return getString(i);
        }
        ArrayList A0z = C17880vN.A0z(r3);
        for (int string2 : intArray) {
            A0z.add(getString(string2));
        }
        String[] A1b = C108955ca.A1b(A0z);
        return getString(i, Arrays.copyOf(A1b, A1b.length));
    }

    public final void A3U(int i, int i2, int i3) {
        if (i != 0 && i2 != 0) {
            if (C18020vd.A05(C18040vf.A02, this.A01, 9270)) {
                C1181262g r1 = new C1181262g();
                r1.A00 = Integer.valueOf(i3);
                r1.A01 = Integer.valueOf(i);
                r1.A02 = Integer.valueOf(i2);
                AnonymousClass18K r0 = this.A05;
                if (r0 != null) {
                    r0.CC7(r1);
                } else {
                    C18070vi.A11("wamRuntime");
                    throw null;
                }
            }
        }
    }

    public void A3V(String str, Bundle bundle) {
        if (str != null) {
            TextView textView = (TextView) AnonymousClass3MY.A0H(this, 2131433770);
            if (bundle.getString("formatted_message_html") != null) {
                Context A042 = AnonymousClass3MY.A04(textView);
                Spanned fromHtml = Html.fromHtml(str);
                C18070vi.A0z(fromHtml, "null cannot be cast to non-null type android.text.Spannable");
                Spannable spannable = (Spannable) fromHtml;
                C99014s7 A002 = AnonymousClass4I0.A00(spannable.getSpans(0, spannable.length(), URLSpan.class));
                while (A002.hasNext()) {
                    Object next = A002.next();
                    C18070vi.A0X(next);
                    URLSpan uRLSpan = (URLSpan) next;
                    spannable.setSpan(new C72843Ns(A042, uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                    spannable.removeSpan(uRLSpan);
                }
                textView.setText(spannable);
                AnonymousClass3Ma.A1I(textView, this.A01);
                textView.setFocusable(true);
                textView.setClickable(true);
                return;
            }
            textView.setText(str);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("request/permission/activity/there is no message id for ");
        String A0y = AnonymousClass000.A0y(Arrays.toString(bundle.getStringArray("permissions")), A10);
        C18070vi.A0X(A0y);
        Log.e(A0y);
        finish();
    }

    public void onResume() {
        String str;
        super.onResume();
        Bundle A092 = AnonymousClass3MY.A09(this);
        C17960vV.A07(A092);
        String[] stringArray = A092.getStringArray("permissions");
        if (stringArray != null) {
            if (this instanceof RequestPermissionFromSisterAppActivity) {
                int length = stringArray.length;
                int i = 0;
                while (i < length) {
                    if (C219217x.A01(this, stringArray[i])) {
                        i++;
                    } else {
                        return;
                    }
                }
            } else {
                if (this instanceof RequestNotificationPermissionActivity) {
                    C27301Vn r0 = ((RequestNotificationPermissionActivity) this).A00;
                    if (r0 == null) {
                        str = "waNotificationManager";
                    } else if (!((AnonymousClass1Vo) r0).A00.A01()) {
                        return;
                    }
                } else {
                    int length2 = stringArray.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        String str2 = stringArray[i2];
                        C219217x r02 = this.A03;
                        if (r02 == null) {
                            str = "waPermissionsHelper";
                        } else if (r02.A02(str2) == 0) {
                            C19830z4 r03 = this.A04;
                            if (r03 != null) {
                                C17880vN.A1B(C19830z4.A00(r03), str2);
                                i2++;
                            } else {
                                str = "waSharedPreferences";
                            }
                        } else {
                            return;
                        }
                    }
                }
                C18070vi.A11(str);
                throw null;
            }
        }
        if (!this.A0B) {
            Log.i("request/permission/activity/permissions has been granted while we were paused");
            C72453Mb.A14(this);
        }
    }
}
