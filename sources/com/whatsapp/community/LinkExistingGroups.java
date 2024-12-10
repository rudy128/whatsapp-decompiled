package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11E;
import X.AnonymousClass126;
import X.AnonymousClass12M;
import X.AnonymousClass18O;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1E9;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1NN;
import X.AnonymousClass1Y5;
import X.AnonymousClass1YL;
import X.AnonymousClass1ZT;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3gf;
import X.AnonymousClass3rC;
import X.AnonymousClass4QE;
import X.AnonymousClass4SL;
import X.AnonymousClass4VI;
import X.C000200d;
import X.C003401n;
import X.C101905Ek;
import X.C107965au;
import X.C108265bP;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C19880zA;
import X.C19890zB;
import X.C22971Dz;
import X.C24921Me;
import X.C25011Mn;
import X.C27354DcQ;
import X.C36401np;
import X.C42941yz;
import X.C53792d6;
import X.C59802mu;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C83784Gq;
import X.C83804Gs;
import X.C91004ez;
import X.C96274na;
import X.C98764rg;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

public final class LinkExistingGroups extends AnonymousClass3gf implements C108265bP, C107965au {
    public View A00;
    public C19880zA A01;
    public AnonymousClass1CJ A02;
    public AnonymousClass1NN A03;
    public AnonymousClass1MZ A04;
    public AnonymousClass126 A05;
    public AnonymousClass12M A06;
    public AnonymousClass1EC A07;
    public C25011Mn A08;
    public C36401np A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public SortedSet A0E;
    public boolean A0F;
    public AnonymousClass1EC A0G;
    public ArrayList A0H;
    public boolean A0I;
    public final C18100vl A0J;

    public LinkExistingGroups() {
        this(0);
        this.A0J = AnonymousClass1DF.A01(new C101905Ek(this));
        this.A0H = AnonymousClass000.A13();
    }

    public void A4z(AnonymousClass4SL r8, AnonymousClass1E7 r9) {
        SortedSet<C59802mu> sortedSet;
        int A17 = C18070vi.A17(r8, r9);
        TextEmojiLabel textEmojiLabel = r8.A03;
        textEmojiLabel.setSingleLine(false);
        textEmojiLabel.setMaxLines(2);
        C53792d6 r4 = r9.A0L;
        if (r4 == null || !r9.A0F()) {
            super.A4z(r8, r9);
            return;
        }
        int i = r4.A00;
        String str = null;
        if (i == 0) {
            Jid A062 = r9.A06(AnonymousClass1EC.class);
            if (A062 != null && C72453Mb.A1a(this.A0J) && (sortedSet = this.A0E) != null && (!(sortedSet instanceof Collection) || !sortedSet.isEmpty())) {
                for (C59802mu r0 : sortedSet) {
                    if (C18070vi.A18(r0.A02, A062)) {
                        r8.A00(C18070vi.A0F(this, 2131891157), false, A17);
                        return;
                    }
                }
            }
            textEmojiLabel.setVisibility(0);
            Jid A063 = r9.A06(AnonymousClass1E9.class);
            if (A063 != null) {
                str = (String) this.A08.A07.get(A063);
            }
            textEmojiLabel.A0S(str, (List) null, 0, false);
            r8.A01(r9.A0y);
            View view = r8.A01;
            AnonymousClass3MW.A1Q(view);
            AnonymousClass1Y5.A02(view, 2131886211);
        } else if (i == 2 || i == 6) {
            AnonymousClass1EC r42 = r4.A01;
            if (r42 != null) {
                str = C17880vN.A0q(this, AnonymousClass3MY.A0q(this.A08, this.A06.A0H(r42)), new Object[A17], 0, 2131891639);
            }
            r8.A00(str, false, A17);
        }
    }

    public void A58(List list) {
        C18070vi.A0d(list, 0);
        if (list.isEmpty()) {
            setResult(-10);
            finish();
            return;
        }
        super.A58(list);
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    C53792d6 r0 = C17880vN.A0O(it).A0L;
                    if (r0 != null && r0.A00 == 0) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.A0F = z;
        if (!z) {
            WaTextView A0T = AnonymousClass3MW.A0T(A4l(), 2131430029);
            C36401np r4 = this.A09;
            if (r4 != null) {
                A0T.setText(r4.A06(A0T.getContext(), new C98764rg((Object) this, 1), getString(2131889083), "create_new_group", AnonymousClass1YL.A00(A0T.getContext(), 2130968627, 2131099690)));
                AnonymousClass1Y5.A0C(A0T, A0T.getSystemServices(), A0T.getAbProps());
                return;
            }
            AnonymousClass3MW.A1E();
            throw null;
        }
    }

    public void A59(List list) {
        C18070vi.A0d(list, 0);
        C27354DcQ A012 = AnonymousClass1ZT.A01();
        A012.add(0, new AnonymousClass3rC(C18070vi.A0F(this, 2131891627), false));
        A012.addAll(list);
        super.A59(AnonymousClass1ZT.A02(A012));
    }

    public void BEb(AnonymousClass1E7 r3) {
        C18070vi.A0d(r3, 0);
        if (C83804Gs.A00(r3)) {
            Jid A062 = r3.A06(AnonymousClass1EC.class);
            A062.getClass();
            this.A0G = (AnonymousClass1EC) A062;
            C83784Gq.A00(this, 1, 2131886480);
            return;
        }
        this.A0G = null;
        super.BEb(r3);
    }

    public void Bmf(String str) {
    }

    public void Bnj() {
    }

    public /* synthetic */ void Bnk(int i) {
    }

    public static final List A0y(LinkExistingGroups linkExistingGroups) {
        List unmodifiableList = Collections.unmodifiableList(linkExistingGroups.A0i);
        C18070vi.A0X(unmodifiableList);
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = unmodifiableList.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            C42941yz r0 = AnonymousClass1EC.A01;
            AnonymousClass1EC A002 = C42941yz.A00(A0O.A0J);
            if (A002 != null) {
                A13.add(A002);
            }
        }
        return A13;
    }

    public void A2y() {
        if (!this.A0I) {
            this.A0I = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass1FB.A0K(r1, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r1, r2, this, r2.A5A);
            C74803cp.A0t(A0K, r1, r2, this, A0K.A63);
            C74803cp.A0s(A0K, r1, r2, this);
            this.A02 = AnonymousClass3Ma.A0d(r1);
            this.A0A = C000200d.A00(r1.A2L);
            this.A03 = AnonymousClass3Ma.A0e(r1);
            this.A05 = AnonymousClass3MY.A0X(r1);
            this.A0B = C000200d.A00(r2.A2U);
            this.A04 = AnonymousClass3MY.A0V(r1);
            this.A06 = AnonymousClass3Ma.A0h(r1);
            this.A09 = AnonymousClass3MY.A0e(r2);
            this.A0C = C000200d.A00(r1.A6F);
            this.A08 = AnonymousClass3MZ.A0y(r1);
            this.A01 = C19890zB.A00;
            this.A0D = AnonymousClass3MW.A0s(r1);
        }
    }

    public void BsU(int i, String str) {
        String str2;
        AnonymousClass1EC r15 = this.A0G;
        if (r15 != null) {
            AnonymousClass1KB r4 = this.A05;
            C18070vi.A0W(r4);
            C25011Mn r0 = this.A08;
            if (r0 != null) {
                AnonymousClass18O r5 = this.A06;
                C18070vi.A0W(r5);
                C18000vb r9 = this.A0F;
                C18070vi.A0W(r9);
                C24921Me r8 = this.A08;
                C18070vi.A0W(r8);
                AnonymousClass1M9 r7 = this.A06;
                C18070vi.A0W(r7);
                AnonymousClass126 r12 = this.A05;
                if (r12 != null) {
                    AnonymousClass12M r14 = this.A06;
                    if (r14 != null) {
                        AnonymousClass11E r6 = this.A07;
                        C18070vi.A0W(r6);
                        AnonymousClass1NN r10 = this.A03;
                        if (r10 != null) {
                            AnonymousClass00H r1 = this.A0B;
                            if (r1 != null) {
                                AnonymousClass4QE r13 = (AnonymousClass4QE) C18070vi.A0E(r1);
                                AnonymousClass1MZ r11 = this.A04;
                                if (r11 != null) {
                                    AnonymousClass4VI r16 = new AnonymousClass4VI((View) null, this, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0);
                                    r16.A00 = new C96274na(this, r15);
                                    r16.A00(str);
                                    return;
                                }
                                str2 = "groupParticipantsManager";
                            } else {
                                str2 = "groupNameChangeUiHelper";
                            }
                        } else {
                            str2 = "conversationObservers";
                        }
                    } else {
                        str2 = "groupXmppMethods";
                    }
                } else {
                    str2 = "groupChatManager";
                }
            } else {
                str2 = "sendMethods";
            }
            C18070vi.A11(str2);
            throw null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> arrayList;
        Bundle extras;
        if (i != 150) {
            if (i != 1007) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 == -1) {
                if (intent == null || (extras = intent.getExtras()) == null || (arrayList = extras.getStringArrayList("result_groups_to_be_hidden")) == null) {
                    arrayList = AnonymousClass000.A13();
                }
                this.A0H = arrayList;
                Bpb();
            }
        } else if (i2 != -1) {
            Log.i("LinkExistingGroups/permissions denied");
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        this.A07 = AnonymousClass1EC.A01.A02(getIntent().getStringExtra("parent_group_jid"));
        super.onCreate(bundle);
        if (bundle == null && !C72463Mc.A1W(this.A0L)) {
            C72453Mb.A15(this, 2131894311, 2131894310);
        }
        if (C72453Mb.A1a(this.A0J)) {
            C98764rg.A00(this.A05, this, 0);
        }
    }

    public void A4u(int i) {
        int i2;
        long j;
        Object[] A1b;
        if (getSupportActionBar() == null) {
            Log.e("LinkExistingGroups/updateTitle/getSupportActionBar is null");
            return;
        }
        int A4f = A4f();
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C18000vb r4 = this.A0F;
            if (A4f == Integer.MAX_VALUE) {
                i2 = 2131755254;
                j = (long) i;
                A1b = new Object[1];
                C17880vN.A1T(A1b, i, 0);
            } else {
                i2 = 2131755261;
                j = (long) i;
                A1b = AnonymousClass3MW.A1b();
                C17880vN.A1T(A1b, i, 0);
                C17880vN.A1T(A1b, A4f, 1);
            }
            supportActionBar.A0R(r4.A0K(A1b, i2, j));
        }
    }

    public void Bpb() {
        Intent A0A2 = C17880vN.A0A();
        A0A2.putStringArrayListExtra("selected_jids", C22971Dz.A0B(A0y(this)));
        A0A2.putStringArrayListExtra("hidden_groups_jids", this.A0H);
        A0A2.putExtra("is_suggest_mode", C72453Mb.A1a(this.A0J));
        C72453Mb.A16(this, A0A2);
    }

    public LinkExistingGroups(int i) {
        this.A0I = false;
        C91004ez.A00(this, 2);
    }
}
