package com.whatsapp.xfamily.groups.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass126;
import X.AnonymousClass1E7;
import X.AnonymousClass1E9;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1L9;
import X.AnonymousClass1PU;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3gf;
import X.AnonymousClass4SL;
import X.AnonymousClass5YZ;
import X.C000200d;
import X.C107515Zz;
import X.C128166fY;
import X.C146827Qt;
import X.C17880vN;
import X.C17900vP;
import X.C17960vV;
import X.C18070vi;
import X.C21429Ajw;
import X.C24211Jh;
import X.C24921Me;
import X.C30101dO;
import X.C43421zm;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C84064Hs;
import X.C85894Pd;
import X.C90984ex;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public final class LinkExistingGroupActivity extends AnonymousClass3gf implements AnonymousClass5YZ, C107515Zz {
    public C85894Pd A00;
    public AnonymousClass1EC A01;
    public C128166fY A02;
    public C30101dO A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public Map A0G;
    public boolean A0H;

    public LinkExistingGroupActivity() {
        this(0);
    }

    public void A4v(View view, View view2, View view3, View view4) {
        C18070vi.A0d(view, 0);
        C18070vi.A0o(view2, view3, view4);
        super.A4v(view, view2, view3, view4);
        view3.setVisibility(8);
        View A0B2 = AnonymousClass3MX.A0B(getLayoutInflater(), this.A02, 2131625812, false);
        TextView A0E2 = AnonymousClass3Ma.A0E(A0B2, 2131432014);
        C43421zm.A04(A0E2);
        A0E2.setText(2131889742);
        View A052 = C18070vi.A05(A0B2, 2131427603);
        AnonymousClass3MZ.A1M(A052, this, 25);
        C43421zm.A04(AnonymousClass3Ma.A0E(A052, 2131429715));
        ViewGroup viewGroup = (ViewGroup) view4.getParent();
        if (viewGroup != null) {
            viewGroup.addView(A0B2, 0);
        }
    }

    public void BEb(AnonymousClass1E7 r3) {
        C18070vi.A0d(r3, 0);
        C30101dO r1 = this.A03;
        if (r1 == null) {
            C18070vi.A11("xFamilyUserFlowLogger");
            throw null;
        }
        r1.A04("TAP_EXISTING_GROUP");
        super.BEb(r3);
    }

    public void CG6() {
        A11(this, true);
    }

    private final void A0y() {
        C30101dO r1 = this.A03;
        if (r1 == null) {
            C18070vi.A11("xFamilyUserFlowLogger");
            throw null;
        }
        r1.A04("REDIRECT_TO_FB");
        if (C24211Jh.A00(this, "com.facebook.katana") == -1 && C24211Jh.A00(this, "com.facebook.wakizashi") == -1) {
            Log.w("LinkExistingGroupActivity/redirectToFB FB app not found");
            C30101dO r12 = this.A03;
            if (r12 == null) {
                C18070vi.A11("xFamilyUserFlowLogger");
                throw null;
            } else {
                r12.A02("EXIT_GROUP_SELECTION");
                this.A05.A08(2131890384, 0);
            }
        } else {
            AnonymousClass1L9 r4 = this.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("fb://event/");
            String str = this.A0B;
            if (str == null) {
                C18070vi.A11("eventId");
                throw null;
            }
            A10.append(URLEncoder.encode(str, DefaultCrypto.UTF_8));
            A10.append("?wa_invite_uri=");
            A10.append(URLEncoder.encode(this.A0E, DefaultCrypto.UTF_8));
            A10.append("&wa_group_name=");
            String A0y = AnonymousClass000.A0y(URLEncoder.encode(this.A0F, DefaultCrypto.UTF_8), A10);
            C18070vi.A0X(A0y);
            C17900vP.A0f("LinkExistingGroupActivity/generateFBDeeplink generated: ", A0y, AnonymousClass000.A10());
            r4.CGU(this, Uri.parse(A0y), (AnonymousClass206) null);
            C30101dO r0 = this.A03;
            if (r0 == null) {
                C18070vi.A11("xFamilyUserFlowLogger");
                throw null;
            }
            r0.A00();
        }
        finishAndRemoveTask();
    }

    public static final void A0z(LinkExistingGroupActivity linkExistingGroupActivity) {
        C128166fY r3 = linkExistingGroupActivity.A02;
        if (r3 != null) {
            r3.A00.set(true);
            r3.A01.CGP(new C21429Ajw(r3, 19));
        }
        Intent A0A2 = C17880vN.A0A();
        A0A2.putExtra("is_success", true);
        A0A2.putExtra("selected_group_name", linkExistingGroupActivity.A0F);
        A0A2.putExtra("selected_group_link", linkExistingGroupActivity.A0E);
        String str = linkExistingGroupActivity.A0B;
        if (str == null) {
            C18070vi.A11("eventId");
            throw null;
        }
        A0A2.putExtra("event_id", str);
        linkExistingGroupActivity.setResult(-1, A0A2);
        linkExistingGroupActivity.A0y();
    }

    public void A2y() {
        if (!this.A0H) {
            this.A0H = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
            this.A04 = C000200d.A00(r2.A2H);
            this.A05 = C000200d.A00(r1.A1J);
            this.A00 = (C85894Pd) A0K.A3P.get();
            this.A06 = C000200d.A00(r2.A4h);
            this.A07 = C000200d.A00(r2.A4j);
            this.A08 = C000200d.A00(r2.A6N);
            this.A09 = C000200d.A00(r2.ABh);
            this.A0A = AnonymousClass3MW.A0s(r2);
            this.A0G = r1.A0A();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 11) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 != -1) {
                Log.i("LinkExistingGroupActivity/contact access permissions denied");
                C30101dO r1 = this.A03;
                if (r1 == null) {
                    C18070vi.A11("xFamilyUserFlowLogger");
                    throw null;
                }
                r1.A04("SEE_NO_CONTACT_ACCESS");
                finish();
            }
        } else if (i2 == -1 && intent != null) {
            AnonymousClass1EC A022 = AnonymousClass1EC.A01.A02(intent.getStringExtra("group_jid"));
            C17960vV.A07(A022);
            C18070vi.A0X(A022);
            C17900vP.A0Y(A022, "LinkExistingGroupActivity/group created ", AnonymousClass000.A10());
            AnonymousClass1E7 A0H2 = this.A06.A0H(A022);
            this.A0i.clear();
            super.BEb(A0H2);
        }
    }

    public static final void A11(LinkExistingGroupActivity linkExistingGroupActivity, boolean z) {
        C128166fY r0;
        C17900vP.A0n("LinkExistingGroupActivity/sendGetLink/recreate:", AnonymousClass000.A10(), z);
        AnonymousClass1EC r4 = linkExistingGroupActivity.A01;
        if (r4 != null) {
            if (z && (r0 = linkExistingGroupActivity.A02) != null) {
                r0.A01.A0K(new C146827Qt(r0), 500);
            }
            C85894Pd r02 = linkExistingGroupActivity.A00;
            if (r02 != null) {
                r02.A00(linkExistingGroupActivity, z).A06(r4);
            } else {
                C18070vi.A11("getInviteLinkProtocolHelperFactory");
                throw null;
            }
        } else {
            Log.e("LinkExistingGroupActivity/sendGetLink/inviteCode empty");
        }
    }

    public void A4z(AnonymousClass4SL r6, AnonymousClass1E7 r7) {
        boolean A15 = C18070vi.A15(r6, r7);
        TextEmojiLabel textEmojiLabel = r6.A03;
        textEmojiLabel.setSingleLine(A15);
        textEmojiLabel.setMaxLines(2);
        if (r7.A0F()) {
            textEmojiLabel.setVisibility(A15 ? 1 : 0);
            C24921Me r2 = this.A08;
            Jid A062 = r7.A06(AnonymousClass1E9.class);
            C18070vi.A0z(A062, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
            textEmojiLabel.A0S((String) r2.A07.get(A062), (List) null, A15, A15);
            r6.A01(r7.A0y);
            return;
        }
        super.A4z(r6, r7);
    }

    public void Bwi(int i, String str, boolean z) {
        String str2;
        String A1H;
        StringBuilder A10 = AnonymousClass000.A10();
        if (str != null) {
            A10.append("LinkExistingGroupActivity/onLinkReceived/gotcode/");
            A10.append(str);
            C17900vP.A0n(" recreate:", A10, z);
            AnonymousClass1EC r1 = this.A01;
            if (r1 != null) {
                AnonymousClass00H r0 = this.A06;
                if (r0 != null) {
                    ((AnonymousClass126) r0.get()).A1E.put(r1, str);
                }
            }
            this.A0D = str;
            if (str.length() == 0) {
                A1H = null;
            } else {
                A1H = AnonymousClass001.A1H("https://chat.whatsapp.com/", str, AnonymousClass000.A10());
            }
            this.A0E = A1H;
            A0z(this);
            return;
        }
        C17900vP.A0j("LinkExistingGroupActivity/onLinkReceived/failed/", A10, i);
        if (i == 436) {
            AnonymousClass1EC r12 = this.A01;
            if (r12 != null) {
                AnonymousClass00H r02 = this.A06;
                if (r02 != null) {
                    ((AnonymousClass126) r02.get()).A1E.remove(r12);
                    return;
                }
            } else {
                return;
            }
        } else {
            C128166fY r3 = this.A02;
            if (r3 != null) {
                r3.A00.set(true);
                r3.A01.CGP(new C21429Ajw(r3, 19));
            }
            AnonymousClass00H r03 = this.A07;
            if (r03 != null) {
                this.A05.A08(C84064Hs.A00(i, ((AnonymousClass1PU) r03.get()).A03(this.A01)), 0);
                String str3 = this.A0D;
                if (str3 == null || str3.length() == 0) {
                    A0y();
                    return;
                }
                return;
            }
            str2 = "groupChatUtils";
            C18070vi.A11(str2);
            throw null;
        }
        str2 = "groupChatManager";
        C18070vi.A11(str2);
        throw null;
    }

    public void onBackPressed() {
        A4q();
        super.onBackPressed();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r13.A0E, 3989) == false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onCreate(r14)
            java.util.Map r0 = r13.A0G
            if (r0 == 0) goto L_0x0149
            r2 = 1004342578(0x3bdd0d32, float:0.006745958)
            java.lang.Object r1 = X.AnonymousClass000.A0w(r0, r2)
            if (r1 == 0) goto L_0x0144
            X.1dO r1 = (X.C30101dO) r1
            r13.A03 = r1
            java.lang.String r5 = "xFamilyUserFlowLogger"
            r7 = 0
            if (r1 != 0) goto L_0x001d
            X.C18070vi.A11(r5)
            throw r7
        L_0x001d:
            java.lang.String r0 = "INIT_GROUP_SELECTION"
            r1.A05(r7, r0, r2)
            android.content.Intent r0 = r13.getIntent()
            if (r0 == 0) goto L_0x0047
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "event_id"
            java.lang.String r0 = r1.getStringExtra(r0)
            if (r0 == 0) goto L_0x0047
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0047
            X.0ve r2 = r13.A0E
            r1 = 3989(0xf95, float:5.59E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r1 = 1
            if (r0 != 0) goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            java.lang.String r2 = "EXIT_GROUP_SELECTION"
            if (r1 != 0) goto L_0x006e
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r1 = "is_success"
            r0 = 0
            android.content.Intent r1 = r3.putExtra(r1, r0)
            r0 = -1
            r13.setResult(r0, r1)
            java.lang.String r0 = "LinkExistingGroupActivity/onCreate invalid request"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1dO r0 = r13.A03
            if (r0 != 0) goto L_0x0068
            X.C18070vi.A11(r5)
            throw r7
        L_0x0068:
            r0.A02(r2)
            r13.finish()
        L_0x006e:
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "source_surface"
            java.lang.String r4 = r1.getStringExtra(r0)
            if (r4 == 0) goto L_0x00a9
            X.0ve r3 = r13.A0E
            r1 = 7926(0x1ef6, float:1.1107E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x00a9
            java.lang.Long r0 = X.AnonymousClass1YD.A04(r4)
            if (r0 == 0) goto L_0x00be
            long r3 = r0.longValue()
        L_0x0090:
            X.00H r0 = r13.A05
            if (r0 == 0) goto L_0x013e
            java.lang.Object r6 = r0.get()
            X.4Rg r6 = (X.C86344Rg) r6
            java.lang.String r10 = X.C17890vO.A0Q()
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            r11 = 66
            r12 = 1
            r8 = r7
            r6.A00(r7, r8, r9, r10, r11, r12)
        L_0x00a9:
            X.1CM r0 = r13.A07
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "LinkExistingGroupActivity/onCreate registration"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1dO r0 = r13.A03
            if (r0 != 0) goto L_0x00c1
            X.C18070vi.A11(r5)
            throw r7
        L_0x00be:
            r3 = -1
            goto L_0x0090
        L_0x00c1:
            r0.A02(r2)
            X.A5E r0 = X.A5E.A00()
            X.8Qb r1 = r0.A02()
            X.00H r0 = r13.A0A
            if (r0 == 0) goto L_0x013a
            r0.get()
            android.content.Intent r0 = X.AnonymousClass1LU.A0A(r13)
            r1.A05(r13, r0)
            r13.finish()
        L_0x00dd:
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r13)
            java.lang.String r0 = "tos_2016_opt_out_state"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0104
            X.0z4 r0 = r13.A0A
            boolean r0 = r0.A2V()
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "LinkExistingGroupActivity/onCreate opt out"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1dO r0 = r13.A03
            if (r0 != 0) goto L_0x00fe
            X.C18070vi.A11(r5)
            throw r7
        L_0x00fe:
            r0.A02(r2)
            r13.finish()
        L_0x0104:
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "event_id"
            java.lang.String r0 = r1.getStringExtra(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.A0B = r0
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "event_name"
            java.lang.String r0 = r1.getStringExtra(r0)
            r13.A0C = r0
            X.1KB r1 = r13.A05
            X.C18070vi.A0W(r1)
            X.6fY r0 = new X.6fY
            r0.<init>(r1)
            r13.A02 = r0
            X.1dO r1 = r13.A03
            if (r1 != 0) goto L_0x0134
            X.C18070vi.A11(r5)
            throw r7
        L_0x0134:
            java.lang.String r0 = "SEE_GROUP_SELECTION"
            r1.A04(r0)
            return
        L_0x013a:
            X.AnonymousClass3MW.A1F()
            throw r7
        L_0x013e:
            java.lang.String r0 = "deepLinkAnalyticManager"
            X.C18070vi.A11(r0)
            throw r7
        L_0x0144:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0149:
            java.lang.String r0 = "xFamilyUserFlowLoggers"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xfamily.groups.ui.LinkExistingGroupActivity.onCreate(android.os.Bundle):void");
    }

    public LinkExistingGroupActivity(int i) {
        this.A0H = false;
        A2L(new C90984ex(this, 1));
    }
}
