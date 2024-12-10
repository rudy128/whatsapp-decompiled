package com.whatsapp.ephemeral;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass126;
import X.AnonymousClass12M;
import X.AnonymousClass18K;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1PR;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4QD;
import X.AnonymousClass5NU;
import X.C000200d;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18070vi;
import X.C18100vl;
import X.C199410f;
import X.C22971Dz;
import X.C23581Gv;
import X.C24671Lf;
import X.C25831Pu;
import X.C33251iW;
import X.C42941yz;
import X.C64002u3;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C75033dN;
import X.C81533zO;
import X.C83694Gh;
import X.C91014f0;
import X.C94164k9;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class ChangeEphemeralSettingActivity extends AnonymousClass1FY {
    public int A00;
    public C33251iW A01;
    public C24671Lf A02;
    public AnonymousClass1NN A03;
    public AnonymousClass1MZ A04;
    public AnonymousClass1PR A05;
    public AnonymousClass4QD A06;
    public AnonymousClass18K A07;
    public AnonymousClass126 A08;
    public AnonymousClass12M A09;
    public C25831Pu A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public boolean A0E;
    public final C18100vl A0F;
    public final C18100vl A0G;
    public final C18100vl A0H;
    public final C23581Gv A0I;

    public ChangeEphemeralSettingActivity() {
        this(0);
        this.A0F = AnonymousClass1DF.A00(AnonymousClass00R.A01, new AnonymousClass5NU(this));
        this.A0H = C83694Gh.A00(this, "current_setting", -1);
        this.A0G = C83694Gh.A00(this, "entry_point", 1);
        this.A0I = new C94164k9(this, 18);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_setting", this.A00);
    }

    private final void A03() {
        String str;
        AnonymousClass1KB r2;
        int i;
        Integer num;
        C18100vl r22 = this.A0F;
        C17960vV.A07(r22.getValue());
        boolean A0d = C22971Dz.A0d(AnonymousClass3MW.A0h(r22));
        if (A0d) {
            AnonymousClass00H r0 = this.A0B;
            if (r0 == null) {
                str = "blockListManager";
                C18070vi.A11(str);
                throw null;
            } else if (AnonymousClass3MW.A0V(r0).A0P((UserJid) AnonymousClass3MX.A0m(r22))) {
                r2 = this.A05;
                i = 2131889947;
                if (this.A00 == 0) {
                    i = 2131889946;
                }
                r2.A08(i, 1);
            }
        }
        if (this.A00 != -1 && C72453Mb.A0I(this.A0H) != this.A00) {
            if (AnonymousClass3MW.A1Y(this)) {
                if (C22971Dz.A0W(AnonymousClass3MW.A0h(r22))) {
                    AnonymousClass1BI A0m = AnonymousClass3MX.A0m(r22);
                    C18070vi.A0z(A0m, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                    AnonymousClass1EC r6 = (AnonymousClass1EC) A0m;
                    int i2 = this.A00;
                    AnonymousClass12M r1 = this.A09;
                    if (r1 != null) {
                        AnonymousClass126 r5 = this.A08;
                        if (r5 != null) {
                            AnonymousClass1NN r4 = this.A03;
                            if (r4 != null) {
                                r1.A0F(new C75033dN(r4, r5, r6, (String) null, (List) null, 224), r6, i2, 1);
                                A0Q(i2);
                                return;
                            }
                            str = "conversationObservers";
                        } else {
                            str = "groupChatManager";
                        }
                    } else {
                        str = "groupXmppMethods";
                    }
                } else if (A0d) {
                    AnonymousClass1BI A0m2 = AnonymousClass3MX.A0m(r22);
                    C18070vi.A0z(A0m2, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    UserJid userJid = (UserJid) A0m2;
                    int i3 = this.A00;
                    C33251iW r23 = this.A01;
                    if (r23 != null) {
                        r23.A0Z(userJid, true, i3, 1);
                        A0Q(i3);
                        return;
                    }
                    str = "userActions";
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Ephemeral not supported for this type of jid, type=");
                    Jid A0h = AnonymousClass3MW.A0h(r22);
                    if (A0h != null) {
                        num = Integer.valueOf(A0h.getType());
                    } else {
                        num = null;
                    }
                    A10.append(num);
                    C17890vO.A0w(A10);
                    return;
                }
                C18070vi.A11(str);
                throw null;
            }
            r2 = this.A05;
            i = 2131889932;
            r2.A08(i, 1);
        }
    }

    private final void A0Q(int i) {
        long A0I2;
        String str;
        C81533zO r3 = new C81533zO();
        r3.A02 = C17880vN.A0n(i);
        C18100vl r2 = this.A0H;
        if (C72453Mb.A0I(r2) == -1) {
            A0I2 = 0;
        } else {
            A0I2 = (long) C72453Mb.A0I(r2);
        }
        r3.A03 = Long.valueOf(A0I2);
        int A0I3 = C72453Mb.A0I(this.A0G);
        int i2 = 1;
        if (A0I3 != 1) {
            if (A0I3 == 2) {
                i2 = 2;
            } else if (A0I3 == 3) {
                i2 = 3;
            }
        }
        r3.A00 = Integer.valueOf(i2);
        C18100vl r1 = this.A0F;
        if (C22971Dz.A0W(AnonymousClass3MW.A0h(r1))) {
            AnonymousClass1MZ r22 = this.A04;
            if (r22 != null) {
                C42941yz r0 = AnonymousClass1EC.A01;
                AnonymousClass1EC A002 = C42941yz.A00(AnonymousClass3MW.A0h(r1));
                C17960vV.A07(A002);
                C199410f A082 = r22.A08.A0C(A002).A08();
                C18070vi.A0X(A082);
                r3.A01 = Integer.valueOf(C64002u3.A02(A082.size()));
            } else {
                str = "groupParticipantsManager";
                C18070vi.A11(str);
                throw null;
            }
        }
        AnonymousClass18K r02 = this.A07;
        if (r02 != null) {
            r02.CC7(r3);
            return;
        }
        str = "wamRuntime";
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A0E) {
            this.A0E = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r2 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r2, this, r2.A45);
            AnonymousClass1FB.A0L(A0L, r2, this, r2.A5A);
            this.A0B = C000200d.A00(A0L.A0x);
            this.A02 = AnonymousClass3Ma.A0S(A0L);
            this.A03 = AnonymousClass3Ma.A0e(A0L);
            this.A0C = C000200d.A00(A0L.AKT);
            this.A0A = (C25831Pu) A0L.A3R.get();
            this.A05 = (AnonymousClass1PR) A0L.AKV.get();
            this.A08 = AnonymousClass3MY.A0X(A0L);
            this.A04 = AnonymousClass3MY.A0V(A0L);
            this.A09 = AnonymousClass3Ma.A0h(A0L);
            this.A01 = AnonymousClass3MZ.A0U(A0L);
            this.A06 = (AnonymousClass4QD) r2.A42.get();
            this.A0D = C000200d.A00(A0L.ABc);
            this.A07 = AnonymousClass3Ma.A0g(A0L);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x007f, code lost:
        if (X.C22971Dz.A0d(X.AnonymousClass3MW.A0h(r5)) != false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
            r19 = this;
            r10 = r19
            r3 = r20
            super.onCreate(r3)
            X.1Lf r1 = r10.A02
            if (r1 == 0) goto L_0x0237
            X.1Gv r0 = r10.A0I
            r1.registerObserver(r0)
            r0 = 2131626561(0x7f0e0a41, float:1.8880362E38)
            r10.setContentView((int) r0)
            r0 = 2131430498(0x7f0b0c62, float:1.8482699E38)
            android.view.View r2 = X.AnonymousClass3MY.A0H(r10, r0)
            r0 = 2131430499(0x7f0b0c63, float:1.84827E38)
            android.view.View r1 = X.AnonymousClass3MY.A0H(r10, r0)
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            r4 = 0
            r0 = 2131430497(0x7f0b0c61, float:1.8482697E38)
            android.view.View r0 = X.C110885hR.A0A(r10, r0)
            r0.setVisibility(r4)
            X.C43391zj.A02(r2, r1)
            r0 = 2131889914(0x7f120efa, float:1.9414505E38)
            r5 = 2131889914(0x7f120efa, float:1.9414505E38)
            X.AnonymousClass3MY.A0t(r10, r0)
            androidx.appcompat.widget.Toolbar r2 = X.C72463Mc.A0T(r10)
            X.0vb r1 = r10.A00
            r0 = 2131231675(0x7f0803bb, float:1.8079438E38)
            X.AnonymousClass3NL.A02(r10, r2, r1, r0)
            java.lang.String r0 = r10.getString(r5)
            r2.setTitle((java.lang.CharSequence) r0)
            int r0 = X.AnonymousClass4Z9.A01(r10, r4)
            r2.setBackgroundResource(r0)
            r0 = 2132083960(0x7f1504f8, float:1.9808077E38)
            r2.A0Q(r10, r0)
            r1 = 21
            X.4dG r0 = new X.4dG
            r0.<init>(r10, r1)
            r2.setNavigationOnClickListener(r0)
            r10.setSupportActionBar(r2)
            X.0vl r5 = r10.A0F
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0h(r5)
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 != 0) goto L_0x0081
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0h(r5)
            boolean r0 = X.C22971Dz.A0d(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0082
        L_0x0081:
            r2 = 1
        L_0x0082:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Ephemeral setting can only be changed for Groups and 1:1, jid type="
            r1.append(r0)
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0h(r5)
            if (r0 == 0) goto L_0x0136
            int r0 = r0.getType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0099:
            r1.append(r0)
            java.lang.String r0 = " is not supported"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.C17960vV.A0F(r2, r0)
            X.0vl r2 = r10.A0H
            int r1 = X.C72453Mb.A0I(r2)
            r0 = -1
            if (r1 == r0) goto L_0x00af
            r4 = 1
        L_0x00af:
            java.lang.String r0 = "add current ephemeral duration in bundle with extra ARG_CURRENT_SETTING"
            X.C17960vV.A0F(r4, r0)
            int r0 = X.C72453Mb.A0I(r2)
            r10.A00 = r0
            if (r20 == 0) goto L_0x00c8
            java.lang.String r1 = "selected_setting"
            int r0 = X.C72453Mb.A0I(r2)
            int r0 = r3.getInt(r1, r0)
            r10.A00 = r0
        L_0x00c8:
            r0 = 2131430515(0x7f0b0c73, float:1.8482733E38)
            android.view.View r11 = r10.findViewById(r0)
            android.widget.RadioGroup r11 = (android.widget.RadioGroup) r11
            r1 = 2
            X.4eo r0 = new X.4eo
            r0.<init>(r10, r1)
            r11.setOnCheckedChangeListener(r0)
            r0 = 2131430494(0x7f0b0c5e, float:1.848269E38)
            android.view.View r1 = X.AnonymousClass3MY.A0H(r10, r0)
            r0 = 8
            r1.setVisibility(r0)
            int r4 = r10.A00
            X.0ve r3 = r10.A0E
            X.C18070vi.A0W(r3)
            X.00H r0 = r10.A0D
            if (r0 == 0) goto L_0x0234
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            r2 = 0
            r1 = 3
            X.C18070vi.A0d(r0, r1)
            X.1zj r12 = X.C43391zj.A00
            r16 = r2
            r13 = r3
            r14 = r4
            r15 = r2
            X.C43391zj.A03(r11, r12, r13, r14, r15, r16)
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0h(r5)
            boolean r0 = X.C22971Dz.A0d(r0)
            if (r0 == 0) goto L_0x013d
            X.1Pu r4 = r10.A0A
            if (r4 == 0) goto L_0x0139
            X.1BI r3 = X.AnonymousClass3MX.A0m(r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r3, r0)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            boolean r0 = r4.A01(r3)
            if (r0 != 0) goto L_0x013d
            r0 = 1
            java.util.Iterator r3 = X.C99434so.A00(r11, r0)
        L_0x0128:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x013d
            android.view.View r0 = X.AnonymousClass3MX.A0E(r3)
            r0.setEnabled(r2)
            goto L_0x0128
        L_0x0136:
            r0 = 0
            goto L_0x0099
        L_0x0139:
            java.lang.String r0 = "disappearingMessagesUtils2"
            goto L_0x023c
        L_0x013d:
            r0 = 2131430495(0x7f0b0c5f, float:1.8482693E38)
            android.view.View r14 = r10.findViewById(r0)
            com.whatsapp.TextEmojiLabel r14 = (com.whatsapp.TextEmojiLabel) r14
            com.whatsapp.jid.Jid r0 = X.AnonymousClass3MW.A0h(r5)
            boolean r0 = X.C22971Dz.A0e(r0)
            if (r0 == 0) goto L_0x01d2
            r0 = 2131889896(0x7f120ee8, float:1.9414469E38)
            java.lang.String r17 = X.AnonymousClass3MX.A15(r10, r0)
        L_0x0157:
            X.0ve r5 = r10.A0E
            X.1KB r13 = r10.A05
            X.1L9 r12 = r10.A01
            X.11C r15 = r10.A08
            X.4QD r0 = r10.A06
            if (r0 == 0) goto L_0x0231
            X.129 r4 = r0.A01
            java.lang.String r3 = "chats"
            java.lang.String r0 = "about-disappearing-messages"
            android.net.Uri r11 = r4.A05(r3, r0)
            X.C18070vi.A0X(r11)
            java.lang.String r18 = "learn-more"
            r16 = r5
            X.C26302CxJ.A0K(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.0vb r0 = r10.A00
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x0186
            r0 = 5
            r14.setGravity(r0)
            r14.setTextDirection(r1)
        L_0x0186:
            X.00H r0 = r10.A0C
            if (r0 == 0) goto L_0x022e
            java.lang.Object r0 = r0.get()
            X.2ij r0 = (X.C57222ij) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x01d1
            r0 = 2131430100(0x7f0b0ad4, float:1.8481891E38)
            android.view.View r8 = r10.findViewById(r0)
            r8.setVisibility(r2)
            r0 = 2131430101(0x7f0b0ad5, float:1.8481893E38)
            android.view.View r9 = r10.findViewById(r0)
            r0 = 2131430099(0x7f0b0ad3, float:1.848189E38)
            android.widget.TextView r5 = X.AnonymousClass3MX.A0L(r10, r0)
            X.1PR r0 = r10.A05
            if (r0 == 0) goto L_0x023a
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C18070vi.A03(r0)
            java.lang.String r0 = "disappearing_mode_timestamp"
            r3 = 0
            long r6 = r1.getLong(r0, r3)
            r1 = 8
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01db
            r9.setVisibility(r2)
            r5.setVisibility(r1)
            r0 = 22
            X.C89934dG.A00(r8, r10, r0)
        L_0x01d1:
            return
        L_0x01d2:
            r0 = 2131889897(0x7f120ee9, float:1.941447E38)
            java.lang.String r17 = X.C18070vi.A0F(r10, r0)
            goto L_0x0157
        L_0x01db:
            r5.setVisibility(r2)
            r9.setVisibility(r1)
            r0 = 2131889508(0x7f120d64, float:1.9413682E38)
            java.lang.String r1 = X.C18070vi.A0F(r10, r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r1)
            android.text.SpannableStringBuilder r4 = X.AnonymousClass3MW.A09(r0)
            int r1 = r1.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r0 = r4.getSpans(r2, r1, r0)
            if (r0 == 0) goto L_0x0225
            X.4s7 r3 = new X.4s7
            r3.<init>(r0)
        L_0x0201:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0225
            java.lang.Object r2 = r3.next()
            android.text.style.URLSpan r2 = (android.text.style.URLSpan) r2
            java.lang.String r1 = "disappearing_mode_setting_link"
            java.lang.String r0 = r2.getURL()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0201
            X.3c8 r0 = new X.3c8
            r0.<init>(r10)
            X.C72473Md.A0x(r4, r2, r0)
            r4.removeSpan(r2)
            goto L_0x0201
        L_0x0225:
            X.0ve r0 = r10.A0E
            X.AnonymousClass3Ma.A1I(r5, r0)
            r5.setText(r4)
            return
        L_0x022e:
            java.lang.String r0 = "disappearingMessagesUtils"
            goto L_0x023c
        L_0x0231:
            java.lang.String r0 = "userExperienceEphemeralMessageUtils"
            goto L_0x023c
        L_0x0234:
            java.lang.String r0 = "waDebugBuildSharedPreferences"
            goto L_0x023c
        L_0x0237:
            java.lang.String r0 = "contactObservers"
            goto L_0x023c
        L_0x023a:
            java.lang.String r0 = "disappearingModeSharedPreferences"
        L_0x023c:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ephemeral.ChangeEphemeralSettingActivity.onCreate(android.os.Bundle):void");
    }

    public void onBackPressed() {
        A03();
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        C24671Lf r1 = this.A02;
        if (r1 != null) {
            r1.unregisterObserver(this.A0I);
        } else {
            C18070vi.A11("contactObservers");
            throw null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            A03();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onStart() {
        super.onStart();
        AnonymousClass4QD r3 = this.A06;
        if (r3 != null) {
            r3.A00(AnonymousClass3MX.A0O(this), AnonymousClass3MX.A0m(this.A0F), 2);
        } else {
            C18070vi.A11("userExperienceEphemeralMessageUtils");
            throw null;
        }
    }

    public ChangeEphemeralSettingActivity(int i) {
        this.A0E = false;
        C91014f0.A00(this, 3);
    }
}
