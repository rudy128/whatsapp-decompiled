package com.whatsapp.newsletter;

import X.A59;
import X.A6Q;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass112;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass18K;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1F9;
import X.AnonymousClass1K2;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1L4;
import X.AnonymousClass1LU;
import X.AnonymousClass1MC;
import X.AnonymousClass1Y5;
import X.AnonymousClass1c4;
import X.AnonymousClass2H8;
import X.AnonymousClass3CQ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3VG;
import X.AnonymousClass3VS;
import X.AnonymousClass3XK;
import X.AnonymousClass440;
import X.AnonymousClass4FQ;
import X.AnonymousClass4G4;
import X.AnonymousClass4JP;
import X.AnonymousClass4JQ;
import X.AnonymousClass4M9;
import X.AnonymousClass4ZR;
import X.AnonymousClass4a6;
import X.AnonymousClass4aS;
import X.AnonymousClass5IY;
import X.AnonymousClass5IZ;
import X.AnonymousClass745;
import X.AnonymousClass74D;
import X.AnonymousClass7KN;
import X.AnonymousClass8B4;
import X.AnonymousClass9IF;
import X.AnonymousClass9IV;
import X.AnonymousClass9IW;
import X.B8S;
import X.C102845Ia;
import X.C102855Ib;
import X.C102865Ic;
import X.C102875Id;
import X.C102885Ie;
import X.C102895If;
import X.C102905Ig;
import X.C102915Ih;
import X.C107095Yj;
import X.C107545aC;
import X.C107575aF;
import X.C107585aG;
import X.C107595aH;
import X.C107935ar;
import X.C108115b9;
import X.C1193267r;
import X.C131296kr;
import X.C131416l3;
import X.C135386s7;
import X.C139106yE;
import X.C17880vN;
import X.C17890vO;
import X.C179509Ig;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19830z4;
import X.C19880zA;
import X.C21356Ail;
import X.C23291Fl;
import X.C23391Fw;
import X.C23401Fx;
import X.C24671Lf;
import X.C24681Lg;
import X.C24921Me;
import X.C25181Nf;
import X.C26302CxJ;
import X.C27001Ui;
import X.C27201Vd;
import X.C29351c6;
import X.C29681ch;
import X.C30391dr;
import X.C32951i1;
import X.C34001jj;
import X.C35681md;
import X.C36331ni;
import X.C36401np;
import X.C37451pZ;
import X.C37581pm;
import X.C39351sv;
import X.C43251zV;
import X.C43531zx;
import X.C46162Dk;
import X.C64052u8;
import X.C72043Kk;
import X.C72453Mb;
import X.C72463Mc;
import X.C72483Me;
import X.C73073Ow;
import X.C73203Rj;
import X.C74763cR;
import X.C74793cj;
import X.C74803cp;
import X.C76693nw;
import X.C76713ny;
import X.C76823oU;
import X.C80413x6;
import X.C80433x8;
import X.C81743zj;
import X.C84374Jg;
import X.C84384Jh;
import X.C84394Ji;
import X.C84404Jj;
import X.C85864Pa;
import X.C85874Pb;
import X.C86164Qm;
import X.C86454Rr;
import X.C86924Tp;
import X.C87874Xk;
import X.C88034Yb;
import X.C90054dS;
import X.C90594eK;
import X.C90874em;
import X.C91494fm;
import X.C91604fx;
import X.C94164k9;
import X.C95414mC;
import X.C95444mF;
import X.C95864mv;
import X.C96864oX;
import X.C96924od;
import X.C96954og;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.fragment.app.Fragment;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.WaTextView;
import com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.iq.BaseNewslettersJob;
import com.whatsapp.newsletter.multiadmin.NewsletterSelectNewOwnerFragment;
import com.whatsapp.text.ReadMoreTextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class NewsletterInfoActivity extends C76713ny implements C23291Fl, C107935ar, C108115b9, AnonymousClass8B4, B8S, C107575aF, C107585aG, C107595aH {
    public long A00;
    public long A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public LinearLayout A08;
    public ListView A09;
    public SwitchCompat A0A;
    public C19880zA A0B;
    public C19880zA A0C;
    public C19880zA A0D;
    public C19880zA A0E;
    public C131296kr A0F;
    public AnonymousClass4JP A0G;
    public AnonymousClass4JQ A0H;
    public C84374Jg A0I;
    public C84384Jh A0J;
    public C84394Ji A0K;
    public C85864Pa A0L;
    public C84404Jj A0M;
    public C131416l3 A0N;
    public ListItemWithLeftIcon A0O;
    public WaTextView A0P;
    public WaTextView A0Q;
    public AnonymousClass4ZR A0R;
    public AnonymousClass1MC A0S;
    public C87874Xk A0T;
    public NewsletterInfoLayout A0U;
    public C24671Lf A0V;
    public C24921Me A0W;
    public C37451pZ A0X;
    public C27201Vd A0Y;
    public C32951i1 A0Z;
    public C25181Nf A0a;
    public C24681Lg A0b;
    public AnonymousClass1E7 A0c;
    public AnonymousClass18K A0d;
    public C81743zj A0e;
    public AnonymousClass3VS A0f;
    public C76823oU A0g;
    public C73073Ow A0h;
    public C86924Tp A0i;
    public AnonymousClass3VG A0j;
    public AnonymousClass3XK A0k;
    public AnonymousClass7KN A0l;
    public AnonymousClass440 A0m;
    public C18010vc A0n;
    public C27001Ui A0o;
    public C90594eK A0p;
    public ReadMoreTextView A0q;
    public AnonymousClass00H A0r;
    public AnonymousClass00H A0s;
    public AnonymousClass00H A0t;
    public AnonymousClass00H A0u;
    public AnonymousClass00H A0v;
    public AnonymousClass00H A0w;
    public AnonymousClass00H A0x;
    public AnonymousClass00H A0y;
    public AnonymousClass00H A0z;
    public AnonymousClass00H A10;
    public AnonymousClass00H A11;
    public AnonymousClass00H A12;
    public AnonymousClass00H A13;
    public AnonymousClass00H A14;
    public AnonymousClass00H A15;
    public AnonymousClass00H A16;
    public AnonymousClass00H A17;
    public AnonymousClass00H A18;
    public AnonymousClass00H A19;
    public boolean A1A;
    public long A1B;
    public ImageView A1C;
    public boolean A1D;
    public final C94164k9 A1E = new C94164k9(this, 20);
    public final C95414mC A1F = new C95414mC(this, 16);
    public final C95444mF A1G = new C95444mF(this, 18);
    public final C76693nw A1H = new C76693nw(this, 4);
    public final C18100vl A1I = AnonymousClass1DF.A01(new AnonymousClass5IY(this));
    public final C18100vl A1J = AnonymousClass1DF.A01(new AnonymousClass5IZ(this));
    public final C18100vl A1K = AnonymousClass1DF.A01(new C102845Ia(this));
    public final C18100vl A1L = AnonymousClass1DF.A01(new C102855Ib(this));
    public final C18100vl A1M = AnonymousClass1DF.A01(new C102865Ic(this));
    public final C18100vl A1N = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C102875Id(this));
    public final C18100vl A1O = AnonymousClass1DF.A01(new C102885Ie(this));
    public final C18100vl A1P = AnonymousClass1DF.A01(new C102895If(this));
    public final C18100vl A1Q = AnonymousClass1DF.A01(new C102905Ig(this));
    public final C18100vl A1R = AnonymousClass1DF.A01(new C102915Ih(this));

    public static final void A1H(NewsletterInfoActivity newsletterInfoActivity, int i, int i2) {
        newsletterInfoActivity.A13(1, Integer.valueOf(i2));
        AnonymousClass3MY.A1Q(newsletterInfoActivity);
        C29681ch A4m = newsletterInfoActivity.A4m();
        long j = newsletterInfoActivity.A01;
        Intent A0A2 = C17880vN.A0A();
        A0A2.setClassName(newsletterInfoActivity.getPackageName(), "com.whatsapp.newsletter.insights.NewsletterInsightsActivity");
        AnonymousClass3MY.A13(A0A2, A4m, "jid");
        A0A2.putExtra("page", i);
        A0A2.putExtra("session_id", j);
        newsletterInfoActivity.startActivity(A0A2);
    }

    public static final void A1I(NewsletterInfoActivity newsletterInfoActivity, C88034Yb r12) {
        NewsletterInfoActivity newsletterInfoActivity2 = newsletterInfoActivity;
        newsletterInfoActivity.CEx();
        int intValue = r12.A02.intValue();
        if (intValue == 3 || intValue == 2) {
            A18(newsletterInfoActivity);
        } else if (intValue == 1 || intValue == 0) {
            A1P(newsletterInfoActivity, false, false);
        } else if (intValue == 4 || intValue == 5) {
            C76823oU r0 = newsletterInfoActivity.A0g;
            if (r0 == null) {
                C18070vi.A11("newsletterInfoViewModel");
                throw null;
            }
            r0.A0V();
            newsletterInfoActivity2.CMx(2131892827, 2131892813, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (Object[]) null);
            return;
        }
        if (!r12.A04) {
            newsletterInfoActivity.BhQ(r12.A00);
            return;
        }
        C73203Rj A002 = C88034Yb.A00(newsletterInfoActivity, r12);
        A002.A0D(r12.A00);
        A002.A0g(newsletterInfoActivity, new C91494fm(r12, newsletterInfoActivity, 26), 2131897145);
        C73203Rj.A05(newsletterInfoActivity, A002, 11, 2131889490);
        AnonymousClass3MY.A1G(A002);
    }

    private final void A1Q(String str) {
        if (((C23391Fw) getLifecycle()).A02 != C23401Fx.DESTROYED) {
            View view = this.A00;
            C18070vi.A0X(view);
            List emptyList = Collections.emptyList();
            C18070vi.A0X(emptyList);
            AnonymousClass11C r5 = this.A08;
            C18070vi.A0W(r5);
            C90594eK r2 = new C90594eK(view, (AnonymousClass1F9) this, r5, str, emptyList, 2000, false);
            r2.A07(new C21356Ail(this, 13));
            r2.A03();
            this.A0p = r2;
        }
    }

    public final void A4q(UserJid userJid, String str) {
        C18070vi.A0d(userJid, 0);
        if (str != null) {
            AnonymousClass3MY.A1Q(this);
            C29681ch A4m = A4m();
            Intent A0A2 = C17880vN.A0A();
            A0A2.setClassName(getPackageName(), "com.whatsapp.newsletter.ui.transferownership.NewsletterTransferOwnershipActivity");
            AnonymousClass3MY.A12(A0A2, A4m, "jid");
            AnonymousClass3MY.A12(A0A2, userJid, "transfer_ownership_admin_jid");
            A0A2.putExtra("transfer_ownership_admin_short_name", str);
            startActivityForResult(A0A2, 55);
        }
    }

    public C90594eK BZQ(int i, int i2, boolean z) {
        String A0F2 = C18070vi.A0F(this, i);
        View view = this.A00;
        C18070vi.A0X(view);
        List emptyList = Collections.emptyList();
        C18070vi.A0X(emptyList);
        AnonymousClass11C r3 = this.A08;
        C18070vi.A0W(r3);
        return new C90594eK(view, (AnonymousClass1F9) this, r3, A0F2, emptyList, i2, z);
    }

    public void Bpy(AnonymousClass1E7 r1) {
    }

    public void Bru(UserJid userJid, boolean z) {
        C18070vi.A0d(userJid, 0);
        C46162Dk A0y2 = A0y(this);
        if (A0y2 != null) {
            this.A1D = z;
            AnonymousClass00H r0 = this.A0y;
            if (r0 != null) {
                C86164Qm r5 = (C86164Qm) r0.get();
                C29681ch A0M2 = A0y2.A0M();
                C96954og r3 = new C96954og(A0y2, userJid, this, z);
                C18070vi.A0d(A0M2, 0);
                C107095Yj r02 = r5.A00;
                if (r02 != null) {
                    r02.cancel();
                }
                r5.A01.A07(2131889494, 2131891463);
                r5.A00 = r5.A02.A00(A0M2, userJid, new C96864oX(userJid, r3, r5, 0));
                return;
            }
            C18070vi.A11("newsletterAdminInvitationHandler");
            throw null;
        }
    }

    public void By8(ArrayList arrayList) {
    }

    public void C48(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        C46162Dk A0y2 = A0y(this);
        if (A0y2 != null) {
            AnonymousClass00H r0 = this.A0y;
            if (r0 != null) {
                ((C86164Qm) r0.get()).A00(A0y2.A0M(), userJid, new C96924od(this));
            } else {
                C18070vi.A11("newsletterAdminInvitationHandler");
                throw null;
            }
        }
    }

    public void C53(C29681ch r8, String str, List list) {
        C18070vi.A0h(r8, list);
        C37581pm A0H2 = AnonymousClass3MZ.A0H(this);
        AnonymousClass3MX.A1Q(new NewsletterInfoActivity$onSend$1(r8, this, str, list, (C30391dr) null), A0H2);
    }

    public void C9M(AnonymousClass9IF r5, String str, List list) {
        boolean A172 = C18070vi.A17(list, r5);
        C46162Dk A0y2 = A0y(this);
        if (A0y2 != null) {
            int ordinal = r5.ordinal();
            if (ordinal != A172) {
                if (ordinal == 3) {
                    C48((UserJid) list.get(0));
                } else if (ordinal == 4) {
                    Bru((UserJid) list.get(0), this.A1D);
                }
            } else if (str != null) {
                C53(A0y2.A0M(), str, list);
            }
        }
    }

    public void CAD() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        long j;
        int i3;
        int i4;
        if (i2 == -1) {
            if (i == 50 || i == 51) {
                C76823oU r0 = this.A0g;
                if (r0 != null) {
                    r0.A0Z(true);
                }
            } else if (i != 1054) {
                switch (i) {
                    case 53:
                        C18000vb r8 = this.A00;
                        long j2 = 1;
                        if (intent != null) {
                            j = intent.getLongExtra("extra_invitees_count", 1);
                        } else {
                            j = 1;
                        }
                        Object[] objArr = new Object[1];
                        if (intent != null) {
                            j2 = intent.getLongExtra("extra_invitees_count", 1);
                        }
                        AnonymousClass3MX.A1S(objArr, 0, j2);
                        String A0K2 = r8.A0K(objArr, 2131755197, j);
                        C18070vi.A0X(A0K2);
                        A1J(this, A0K2, true);
                        break;
                    case 54:
                        if (intent != null) {
                            CPW(C72463Mc.A0r(intent, AnonymousClass1BI.class), 1);
                            break;
                        }
                        break;
                    case 55:
                        if (intent != null) {
                            Fragment A0O2 = getSupportFragmentManager().A0O(2131434873);
                            if ((A0O2 instanceof NewsletterSelectNewOwnerFragment) && !isFinishing()) {
                                C34001jj A0H2 = AnonymousClass3Ma.A0H(this);
                                A0H2.A07(A0O2);
                                A0H2.A02();
                            }
                            String stringExtra = intent.getStringExtra("transfer_ownership_admin_short_name");
                            if (intent.getBooleanExtra("transfer_ownership_successful", false)) {
                                boolean booleanExtra = intent.getBooleanExtra("transfer_ownership_admin_dismiss_requested", false);
                                boolean booleanExtra2 = intent.getBooleanExtra("transfer_ownership_admin_dismiss_successful", false);
                                if (!booleanExtra) {
                                    i4 = 2131892745;
                                } else if (booleanExtra2) {
                                    i4 = 2131892746;
                                } else {
                                    i3 = 2131892747;
                                }
                                String A0R2 = C17890vO.A0R(this, stringExtra, 1, 0, i4);
                                C18070vi.A0X(A0R2);
                                A1Q(A0R2);
                                break;
                            } else {
                                i3 = 2131892744;
                            }
                            BhQ(i3);
                            break;
                        }
                        break;
                    case 56:
                        A12();
                        break;
                }
            } else {
                C76823oU r02 = this.A0g;
                if (r02 != null) {
                    r02.A0V();
                }
            }
            C18070vi.A11("newsletterInfoViewModel");
            throw null;
        }
        super.onActivityResult(i, i2, intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C46162Dk A0y2;
        C18070vi.A0d(menu, 0);
        if (!A1R(A4l()) && (A0y2 = A0y(this)) != null && A0y2.A0P()) {
            menu.add(0, 1001, 0, getString(2131898930));
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        bundle.putLong("key_insights_session_id", this.A01);
        bundle.putLong("key_current_similar_newsletters_session_id", this.A00);
        bundle.putBoolean("key_has_logged_initial_similar_newsletters_impressions", this.A1A);
        super.onSaveInstanceState(bundle);
    }

    private final void A12() {
        C74793cj r1;
        int i;
        AnonymousClass00H r0 = this.A0r;
        if (r0 != null) {
            int ordinal = ((AnonymousClass4M9) r0.get()).A00.A0a(A4m()).A0C.ordinal();
            if (ordinal == 1) {
                C18100vl r12 = this.A1I;
                ((ListItemWithLeftIcon) r12.getValue()).setDescriptionVisibility(0);
                r1 = (C74793cj) r12.getValue();
                i = 2131886805;
            } else if (ordinal == 0) {
                C18100vl r13 = this.A1I;
                ((ListItemWithLeftIcon) r13.getValue()).setDescriptionVisibility(0);
                r1 = (C74793cj) r13.getValue();
                i = 2131886804;
            } else if (ordinal == 2) {
                ((ListItemWithLeftIcon) this.A1I.getValue()).setDescriptionVisibility(8);
                return;
            } else {
                return;
            }
            r1.setDescription(i);
            return;
        }
        C18070vi.A11("autoDeleteMediaManager");
        throw null;
    }

    public static final void A15(NewsletterInfoActivity newsletterInfoActivity) {
        NewsletterInfoActivity newsletterInfoActivity2 = newsletterInfoActivity;
        C46162Dk A0y2 = A0y(newsletterInfoActivity2);
        if (A0y2 != null) {
            newsletterInfoActivity2.CNA(2131891797);
            Integer num = AnonymousClass00R.A0C;
            AnonymousClass00H r0 = newsletterInfoActivity2.A15;
            if (r0 != null) {
                Integer A042 = ((A6Q) r0.get()).A04((Integer) null, 5);
                AnonymousClass440 r02 = newsletterInfoActivity2.A0m;
                if (r02 == null) {
                    C18070vi.A11("newsletterViewModel");
                    throw null;
                }
                r02.A03.A0D(newsletterInfoActivity2.A4m(), A042);
                ((AnonymousClass74D) C18070vi.A0E(newsletterInfoActivity2.A4o())).A0H(newsletterInfoActivity2.A4m(), AnonymousClass4aS.A00(newsletterInfoActivity2.getIntent()), num, newsletterInfoActivity2.A0z(), (String) null, AnonymousClass4aS.A01(newsletterInfoActivity2), (String) null, -1, -1);
                AnonymousClass1Y5.A00(newsletterInfoActivity2, newsletterInfoActivity2.A08, C17880vN.A0q(newsletterInfoActivity2, A0y2.A0T, AnonymousClass3MW.A1a(), 0, 2131890492));
                if (newsletterInfoActivity2.getIntent().getStringExtra("wamo_pc_id") != null && newsletterInfoActivity2.A0C == null) {
                    C18070vi.A11("wamoNewsletterLogger");
                    throw null;
                }
                return;
            }
            C18070vi.A11("newsletterPerfTracker");
            throw null;
        }
    }

    public static final void A16(NewsletterInfoActivity newsletterInfoActivity) {
        C19880zA r1 = newsletterInfoActivity.A0B;
        if (r1 == null) {
            C18070vi.A11("subscriptionAnalyticsManager");
            throw null;
        } else if (r1.A07()) {
            r1.A03();
            throw AnonymousClass000.A0s("logMetaVerifiedChannelAction");
        }
    }

    public static final void A1A(NewsletterInfoActivity newsletterInfoActivity) {
        String str;
        AnonymousClass1E7 r0 = newsletterInfoActivity.A0c;
        String str2 = "contact";
        if (r0 != null) {
            int i = 0;
            if (!r0.A0g) {
                newsletterInfoActivity.A05.A08(2131892961, 0);
                C27001Ui r4 = newsletterInfoActivity.A0o;
                if (r4 != null) {
                    C29681ch A4m = newsletterInfoActivity.A4m();
                    AnonymousClass1E7 r02 = newsletterInfoActivity.A0c;
                    if (r02 != null) {
                        r4.A03(A4m, "NewsletterInfoActivity.showProfilePhoto", r02.A08, 2, false);
                        return;
                    }
                } else {
                    str = "profilePhotoManager";
                }
            } else if (!newsletterInfoActivity.A0Y) {
                int statusBarColor = newsletterInfoActivity.getWindow().getStatusBarColor();
                if (AnonymousClass112.A04()) {
                    i = newsletterInfoActivity.getWindow().getNavigationBarColor();
                }
                AnonymousClass3MY.A1Q(newsletterInfoActivity);
                C29681ch A4m2 = newsletterInfoActivity.A4m();
                Intent A0A2 = C17880vN.A0A();
                A0A2.setClassName(newsletterInfoActivity.getPackageName(), "com.whatsapp.newsletter.ui.profilephoto.ViewNewsletterProfilePhoto");
                AnonymousClass3MY.A12(A0A2, A4m2, "jid");
                A0A2.putExtra("circular_transition", true);
                A0A2.putExtra("start_transition_alpha", 0.0f);
                A0A2.putExtra("start_transition_status_bar_color", statusBarColor);
                A0A2.putExtra("return_transition_status_bar_color", 0);
                A0A2.putExtra("start_transition_navigation_bar_color", i);
                A0A2.putExtra("return_transition_navigation_bar_color", 0);
                A0A2.putExtra("open_pic_selection_sheet", false);
                AnonymousClass4ZR r1 = newsletterInfoActivity.A0R;
                if (r1 == null) {
                    str2 = "transitionNames";
                } else {
                    String A022 = r1.A02(2131899529);
                    NewsletterInfoLayout newsletterInfoLayout = newsletterInfoActivity.A0U;
                    if (newsletterInfoLayout == null) {
                        str = "rootLayout";
                    } else {
                        newsletterInfoActivity.startActivityForResult(A0A2, 51, AnonymousClass745.A05(newsletterInfoActivity, C18070vi.A05(newsletterInfoLayout, 2131437028), A022));
                        return;
                    }
                }
            } else {
                return;
            }
            C18070vi.A11(str);
            throw null;
        }
        C18070vi.A11(str2);
        throw null;
    }

    public static final void A1B(NewsletterInfoActivity newsletterInfoActivity) {
        NewsletterInfoActivity newsletterInfoActivity2 = newsletterInfoActivity;
        C46162Dk A0y2 = A0y(newsletterInfoActivity2);
        if (A0y2 != null) {
            newsletterInfoActivity2.CNA(2131891797);
            Integer num = AnonymousClass00R.A0C;
            AnonymousClass00H r0 = newsletterInfoActivity2.A15;
            if (r0 != null) {
                Integer A052 = ((A6Q) r0.get()).A05((Integer) null, 5);
                AnonymousClass440 r1 = newsletterInfoActivity2.A0m;
                if (r1 == null) {
                    C18070vi.A11("newsletterViewModel");
                    throw null;
                }
                r1.A0T(newsletterInfoActivity2.A4m(), A052);
                ((AnonymousClass74D) C18070vi.A0E(newsletterInfoActivity2.A4o())).A0I(newsletterInfoActivity2.A4m(), AnonymousClass4aS.A00(newsletterInfoActivity2.getIntent()), num, newsletterInfoActivity2.A0z(), (String) null, AnonymousClass4aS.A01(newsletterInfoActivity2), (String) null, -1, -1);
                AnonymousClass1Y5.A00(newsletterInfoActivity2, newsletterInfoActivity2.A08, C17880vN.A0q(newsletterInfoActivity2, A0y2.A0T, AnonymousClass3MW.A1a(), 0, 2131886293));
                if (newsletterInfoActivity2.getIntent().getStringExtra("wamo_pc_id") != null && newsletterInfoActivity2.A0C == null) {
                    C18070vi.A11("wamoNewsletterLogger");
                    throw null;
                }
                return;
            }
            C18070vi.A11("newsletterPerfTracker");
            throw null;
        }
    }

    public static final void A1K(NewsletterInfoActivity newsletterInfoActivity, boolean z) {
        AnonymousClass440 r0 = newsletterInfoActivity.A0m;
        if (r0 != null) {
            List<C135386s7> A102 = AnonymousClass3MW.A10(r0.A01);
            if (A102 != null) {
                AnonymousClass440 r02 = newsletterInfoActivity.A0m;
                if (r02 != null) {
                    List<C135386s7> A103 = AnonymousClass3MW.A10(r02.A00);
                    if (A103 != null) {
                        boolean z2 = !z;
                        AnonymousClass74D A0o2 = C72453Mb.A0o(newsletterInfoActivity);
                        long j = newsletterInfoActivity.A00;
                        C29681ch A4m = newsletterInfoActivity.A4m();
                        ArrayList A0E2 = C29351c6.A0E(A102);
                        for (C135386s7 r03 : A102) {
                            A0E2.add(r03.A02);
                        }
                        ArrayList A0E3 = C29351c6.A0E(A103);
                        for (C135386s7 r04 : A103) {
                            A0E3.add(r04.A02);
                        }
                        A0o2.A0J(A4m, AnonymousClass00R.A0G, A0E2, A0E3, z2 ? 1 : 0, j);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        C18070vi.A11("newsletterViewModel");
        throw null;
    }

    private final boolean A1R(C46162Dk r2) {
        AnonymousClass00H r0 = this.A16;
        if (r0 != null) {
            return ((C86454Rr) r0.get()).A00(r2);
        }
        C18070vi.A11("newsletterSuspensionUtils");
        throw null;
    }

    public void A3K() {
        AnonymousClass3MX.A0u(this.A0V).A02(C29681ch.A03.A01(C72453Mb.A0u(this)), 28);
    }

    public final C46162Dk A4l() {
        AnonymousClass440 r0 = this.A0m;
        if (r0 != null) {
            return r0.A0U();
        }
        C18070vi.A11("newsletterViewModel");
        throw null;
    }

    public C29681ch A4m() {
        AnonymousClass1E7 r1 = this.A0c;
        if (r1 == null) {
            C18070vi.A11("contact");
            throw null;
        }
        C29681ch r0 = (C29681ch) r1.A06(C29681ch.class);
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0n("Invalid Newsletter Jid");
    }

    public final C73073Ow A4n() {
        String str;
        C84404Jj r0 = this.A0M;
        if (r0 != null) {
            LayoutInflater layoutInflater = getLayoutInflater();
            C18070vi.A0X(layoutInflater);
            C37451pZ r8 = this.A0X;
            if (r8 == null) {
                str = "contactPhotoLoader";
            } else {
                AnonymousClass1K2 r2 = r0.A00;
                AnonymousClass10E r1 = r2.A01;
                C18000vb A6Q = AnonymousClass10E.A6Q(r1);
                C24921Me A0g2 = AnonymousClass3MZ.A0g(r1);
                C72043Kk A0T2 = AnonymousClass3MZ.A0T(r1.A00);
                return new C73073Ow(layoutInflater, (C85874Pb) r2.A00.A57.get(), AnonymousClass10E.A17(r1), A0T2, A0g2, r8, A6Q, (AnonymousClass1c4) r1.A7C.get(), this);
            }
        } else {
            str = "newsletterMembersAdapterFactory";
        }
        C18070vi.A11(str);
        throw null;
    }

    public final AnonymousClass00H A4o() {
        AnonymousClass00H r0 = this.A12;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("newsletterLogging");
        throw null;
    }

    public final AnonymousClass00H A4p() {
        AnonymousClass00H r0 = this.A19;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public String BSb() {
        return "newsletter_info_activity";
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bw9(com.whatsapp.jid.UserJid r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x004a
            X.2Dk r3 = A0y(r4)
            if (r3 == 0) goto L_0x0063
            X.3oU r0 = r4.A0g
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "newsletterInfoViewModel"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0013:
            X.1DT r0 = r0.A05
            java.lang.Object r0 = r0.A06()
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0035
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x0025:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0037
            X.1BI r0 = X.C72453Mb.A0l(r1)
            if (r0 == 0) goto L_0x0025
            r2.add(r0)
            goto L_0x0025
        L_0x0035:
            X.0wS r2 = X.C18460wS.A00
        L_0x0037:
            X.AnonymousClass3MY.A1Q(r4)
            X.1ch r1 = r3.A0M()
            java.lang.String r0 = r3.A0T
            android.content.Intent r1 = X.AnonymousClass1LU.A18(r4, r1, r0, r2)
            r0 = 53
            r4.startActivityForResult(r1, r0)
            return
        L_0x004a:
            X.1GP r3 = r4.getSupportFragmentManager()
            X.1ch r2 = r4.A4m()
            r0 = 1
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            r1 = 0
            r0[r1] = r5
            java.util.ArrayList r0 = X.AnonymousClass1ZU.A05(r0)
            com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminMessageFragment r0 = X.AnonymousClass4H8.A00(r2, r0, r1)
            X.C20098A7b.A02(r0, r3)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.Bw9(com.whatsapp.jid.UserJid):void");
    }

    public void finishAfterTransition() {
        View view = this.A05;
        if (view == null) {
            C18070vi.A11("headerView");
            throw null;
        }
        view.setTransitionName((String) null);
        TransitionSet transitionSet = new TransitionSet();
        Slide slide = new Slide(48);
        View view2 = this.A05;
        if (view2 == null) {
            C18070vi.A11("headerView");
            throw null;
        }
        slide.addTarget(view2);
        transitionSet.addTransition(slide);
        Slide slide2 = new Slide(80);
        ListView listView = this.A09;
        if (listView == null) {
            C18070vi.A11("newsletterListView");
            throw null;
        }
        C74803cp.A0d(this, slide2, transitionSet, listView);
        NewsletterInfoLayout newsletterInfoLayout = this.A0U;
        if (newsletterInfoLayout == null) {
            C18070vi.A11("rootLayout");
            throw null;
        }
        newsletterInfoLayout.setStatusData((C139106yE) null);
        super.finishAfterTransition();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0309, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4.A0E, 9641) == false) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x036a, code lost:
        if (X.C18020vd.A05(r10, r4.A0E, 10328) != false) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0415, code lost:
        r10 = r2.getLong("key_insights_session_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0436, code lost:
        if (r1 != null) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0510, code lost:
        r10 = r2.getLong("key_current_similar_newsletters_session_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0531, code lost:
        if (r1 != null) goto L_0x0533;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x062d, code lost:
        if (r2 == null) goto L_0x062f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x053b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r24) {
        /*
            r23 = this;
            r4 = r23
            r2 = r24
            super.onCreate(r2)
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.A1B = r0
            X.25J r1 = X.C29681ch.A03
            java.lang.String r0 = X.C72453Mb.A0u(r4)
            X.1ch r6 = r1.A01(r0)
            if (r6 != 0) goto L_0x001d
            r4.finish()
        L_0x001c:
            return
        L_0x001d:
            r4.A2Y()
            r0 = 2131892878(0x7f121a8e, float:1.9420517E38)
            r4.setTitle(r0)
            X.1MC r1 = r4.A0S
            if (r1 == 0) goto L_0x06d6
            r0 = 2
            r1.A01 = r0
            X.1Vd r1 = r4.A0Y
            if (r1 == 0) goto L_0x06cf
            java.lang.String r0 = "newsletter-info-activity"
            X.1pZ r0 = r1.A06(r4, r0)
            r4.A0X = r0
            X.1Nf r0 = r4.A0a
            if (r0 == 0) goto L_0x06c8
            X.1E7 r0 = r0.A01(r6)
            X.C17960vV.A07(r0)
            r4.A0c = r0
            X.4JP r1 = r4.A0G
            if (r1 == 0) goto L_0x01a3
            X.1ch r0 = r4.A4m()
            X.440 r0 = X.AnonymousClass4HB.A00(r1, r4, r0)
            r4.A0m = r0
            java.lang.String r14 = "newsletterViewModel"
            if (r0 == 0) goto L_0x0090
            X.1DT r1 = r0.A01
            X.5TV r0 = new X.5TV
            r0.<init>(r4)
            r5 = 0
            X.C91634g0.A00(r4, r1, r0, r5)
            X.440 r0 = r4.A0m
            if (r0 == 0) goto L_0x0090
            X.1DT r1 = r0.A00
            X.5TW r0 = new X.5TW
            r0.<init>(r4)
            X.C91634g0.A00(r4, r1, r0, r5)
            X.440 r0 = r4.A0m
            if (r0 == 0) goto L_0x0090
            X.4mD r1 = r0.A02
            X.1ch r0 = r0.A05
            X.4Tp r0 = r1.A02(r0)
            r4.A0i = r0
            X.4JQ r7 = r4.A0H
            if (r7 == 0) goto L_0x019f
            X.1ch r3 = r4.A4m()
            X.C17960vV.A07(r3)
            X.1E7 r1 = r4.A0c
            if (r1 != 0) goto L_0x0095
            java.lang.String r14 = "contact"
        L_0x0090:
            X.C18070vi.A11(r14)
        L_0x0093:
            r0 = 0
            throw r0
        L_0x0095:
            r0 = 6
            X.1It r1 = X.C91784gF.A00(r4, r7, r1, r3, r0)
            java.lang.Class<X.3oU> r0 = X.C76823oU.class
            X.1J2 r0 = r1.A00(r0)
            X.3oU r0 = (X.C76823oU) r0
            r4.A0g = r0
            java.lang.String r13 = "newsletterInfoViewModel"
            if (r0 == 0) goto L_0x019a
            r4.A4i(r0)
            X.3oU r0 = r4.A0g
            if (r0 == 0) goto L_0x019a
            X.1DT r1 = r0.A08
            X.5TR r0 = new X.5TR
            r0.<init>(r4)
            X.C91634g0.A00(r4, r1, r0, r5)
            X.3oU r0 = r4.A0g
            if (r0 == 0) goto L_0x019a
            X.1DS r1 = r0.A04
            X.5TS r0 = new X.5TS
            r0.<init>(r4)
            X.C91634g0.A00(r4, r1, r0, r5)
            X.3oU r0 = r4.A0g
            if (r0 == 0) goto L_0x019a
            X.1DS r1 = r0.A03
            X.5TT r0 = new X.5TT
            r0.<init>(r4)
            X.C91634g0.A00(r4, r1, r0, r5)
            X.440 r0 = r4.A0m
            if (r0 == 0) goto L_0x0090
            X.1DS r1 = r0.A00
            X.5TU r0 = new X.5TU
            r0.<init>(r4)
            X.C91634g0.A00(r4, r1, r0, r5)
            X.4Ji r3 = r4.A0K
            if (r3 == 0) goto L_0x06c1
            X.1ch r1 = r4.A4m()
            X.C17960vV.A07(r1)
            r0 = 14
            X.1It r1 = X.C91774gE.A00(r4, r3, r1, r0)
            java.lang.Class<X.3VG> r0 = X.AnonymousClass3VG.class
            X.1J2 r0 = r1.A00(r0)
            X.3VG r0 = (X.AnonymousClass3VG) r0
            r4.A0j = r0
            X.3zj r1 = new X.3zj
            r1.<init>()
            r4.A0e = r1
            r7 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r1.A03 = r0
            android.view.LayoutInflater r1 = r4.getLayoutInflater()
            r0 = 2131626196(0x7f0e08d4, float:1.8879621E38)
            r3 = 0
            android.view.View r0 = r1.inflate(r0, r3, r5)
            r4.setContentView((android.view.View) r0)
            android.view.View r1 = r4.A00
            r0 = 2131429510(0x7f0b0886, float:1.8480695E38)
            android.view.View r1 = r1.findViewById(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout"
            X.C18070vi.A0z(r1, r0)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r1 = (com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout) r1
            r4.A0U = r1
            androidx.appcompat.widget.Toolbar r8 = X.AnonymousClass3Ma.A0G(r4)
            if (r8 == 0) goto L_0x014c
            java.lang.String r0 = ""
            r8.setTitle((java.lang.CharSequence) r0)
            r8.A0L()
            X.01n r0 = X.AnonymousClass3MY.A0K(r4, r8)
            if (r0 == 0) goto L_0x0144
            r0.A0W(r7)
        L_0x0144:
            X.0vb r1 = r4.A00
            r0 = 2131231712(0x7f0803e0, float:1.8079513E38)
            X.AnonymousClass3NL.A02(r4, r8, r1, r0)
        L_0x014c:
            android.widget.ListView r0 = r4.getListView()
            X.C18070vi.A0X(r0)
            r4.A09 = r0
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r1 = r4.A0U
            java.lang.String r15 = "rootLayout"
            if (r1 == 0) goto L_0x06bd
            r0 = 2131626199(0x7f0e08d7, float:1.8879627E38)
            r1.A0E(r0)
            r0 = 2131431358(0x7f0b0fbe, float:1.8484443E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r4, r0)
            r4.A05 = r0
            r0 = 2131427684(0x7f0b0164, float:1.8476991E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r4, r0)
            r4.A06 = r0
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0U
            if (r0 == 0) goto L_0x06bd
            r0.A0A()
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r1 = r4.A0U
            if (r1 == 0) goto L_0x06bd
            int r0 = X.AnonymousClass3MZ.A00(r4)
            r1.setColor(r0)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0U
            if (r0 == 0) goto L_0x06bd
            android.view.LayoutInflater r8 = X.C74803cp.A03(r4, r0)
            r1 = 2131626198(0x7f0e08d6, float:1.8879625E38)
            android.widget.ListView r0 = r4.A09
            java.lang.String r12 = "newsletterListView"
            if (r0 != 0) goto L_0x01a7
            X.C18070vi.A11(r12)
            throw r3
        L_0x019a:
            X.C18070vi.A11(r13)
            goto L_0x0093
        L_0x019f:
            java.lang.String r14 = "newsletterInfoViewModelFactory"
            goto L_0x0090
        L_0x01a3:
            java.lang.String r14 = "newsletterViewModelFactory"
            goto L_0x0090
        L_0x01a7:
            android.view.View r8 = X.AnonymousClass3MX.A0B(r8, r0, r1, r5)
            r4.A03 = r8
            android.widget.ListView r1 = r4.A09
            if (r1 != 0) goto L_0x01b5
            X.C18070vi.A11(r12)
            throw r3
        L_0x01b5:
            android.widget.FrameLayout r0 = X.AnonymousClass3Ma.A0B(r8)
            r0.addView(r8)
            r9 = 2
            r0.setImportantForAccessibility(r9)
            r1.addFooterView(r0, r3, r5)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r4)
            r4.A08 = r0
            android.graphics.Point r0 = X.C72483Me.A0D(r4)
            int r1 = r0.y
            android.widget.LinearLayout r0 = r4.A08
            java.lang.String r8 = "footerPadding"
            if (r0 != 0) goto L_0x01da
            X.C18070vi.A11(r8)
            throw r3
        L_0x01da:
            r0.setPadding(r5, r5, r5, r1)
            android.widget.ListView r1 = r4.A09
            if (r1 != 0) goto L_0x01e5
            X.C18070vi.A11(r12)
            throw r3
        L_0x01e5:
            android.widget.LinearLayout r0 = r4.A08
            if (r0 != 0) goto L_0x01ed
            X.C18070vi.A11(r8)
            throw r3
        L_0x01ed:
            r1.addFooterView(r0, r3, r5)
            android.widget.LinearLayout r0 = r4.A08
            if (r0 != 0) goto L_0x01f8
            X.C18070vi.A11(r8)
            throw r3
        L_0x01f8:
            r0.setImportantForAccessibility(r9)
            r0 = 2131433831(0x7f0b1967, float:1.8489459E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r4, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r4.A1C = r0
            X.4ZR r0 = new X.4ZR
            r0.<init>(r4)
            r4.A0R = r0
            X.3oU r0 = r4.A0g
            if (r0 != 0) goto L_0x0215
            X.C18070vi.A11(r13)
            throw r3
        L_0x0215:
            r0.A0Z(r7)
            boolean r0 = A1S(r4)
            if (r0 == 0) goto L_0x027a
            X.2Dk r8 = A0y(r4)
            if (r8 == 0) goto L_0x027a
            X.4Jh r11 = r4.A0J
            if (r11 == 0) goto L_0x06b7
            X.1ch r18 = r4.A4m()
            X.C17960vV.A07(r18)
            long r0 = r8.A0G
            X.3oU r10 = r4.A0g
            if (r10 == 0) goto L_0x06b9
            X.4g7 r9 = new X.4g7
            r19 = r10
            r20 = r7
            r21 = r0
            r16 = r9
            r17 = r11
            r16.<init>(r17, r18, r19, r20, r21)
            X.1It r1 = new X.1It
            r1.<init>(r9, r4)
            java.lang.Class<X.3VS> r0 = X.AnonymousClass3VS.class
            X.1J2 r1 = r1.A00(r0)
            X.3VS r1 = (X.AnonymousClass3VS) r1
            X.1Fv r0 = r4.getLifecycle()
            r0.A05(r1)
            r4.A0f = r1
            if (r1 == 0) goto L_0x0266
            X.1DS r1 = r1.A02
            X.5TO r0 = new X.5TO
            r0.<init>(r4)
            X.C91634g0.A00(r4, r1, r0, r5)
        L_0x0266:
            boolean r0 = r8.A0P()
            if (r0 == 0) goto L_0x027a
            X.3VS r0 = r4.A0f
            if (r0 == 0) goto L_0x027a
            X.1DT r1 = r0.A03
            X.5TP r0 = new X.5TP
            r0.<init>(r4)
            X.C91634g0.A00(r4, r1, r0, r5)
        L_0x027a:
            X.3Ow r1 = r4.A4n()
            r4.A0h = r1
            android.widget.ListView r0 = r4.A09
            if (r0 != 0) goto L_0x0288
            X.C18070vi.A11(r12)
            throw r3
        L_0x0288:
            r0.setAdapter(r1)
            r1 = 2131437028(0x7f0b25e4, float:1.8495943E38)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0U
            if (r0 != 0) goto L_0x0296
            X.C18070vi.A11(r15)
            throw r3
        L_0x0296:
            android.widget.ImageView r1 = X.AnonymousClass3Ma.A0C(r0, r1)
            r0 = 2131231057(0x7f080151, float:1.8078184E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass03S.A01(r4, r0)
            r1.setImageDrawable(r0)
            r0 = 2131431243(0x7f0b0f4b, float:1.848421E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r4, r0)
            com.whatsapp.text.ReadMoreTextView r1 = (com.whatsapp.text.ReadMoreTextView) r1
            r4.A0q = r1
            if (r1 != 0) goto L_0x02b7
            java.lang.String r0 = "descriptionTextView"
            X.C18070vi.A11(r0)
            throw r3
        L_0x02b7:
            r0 = 3
            r1.setLinesLimit(r0)
            X.C72473Md.A1C(r1)
            r0 = 2131429932(0x7f0b0a2c, float:1.848155E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r4, r0)
            r4.A02 = r0
            r0 = 2131431351(0x7f0b0fb7, float:1.8484429E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r4, r0)
            r4.A04 = r0
            r0 = 2131433142(0x7f0b16b6, float:1.8488061E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r4, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r4.A0Q = r0
            r0 = 2131429717(0x7f0b0955, float:1.8481115E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r4, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r4.A0P = r0
            A1F(r4)
            X.2Dk r9 = r4.A4l()
            if (r9 == 0) goto L_0x030b
            boolean r0 = r4.A1R(r9)
            if (r0 != 0) goto L_0x030b
            boolean r0 = r9.A0A
            if (r0 != 0) goto L_0x030b
            boolean r0 = r9.A0P()
            if (r0 != 0) goto L_0x0316
            X.0ve r8 = r4.A0E
            r1 = 9641(0x25a9, float:1.351E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 != 0) goto L_0x0316
        L_0x030b:
            r4.A2v(r7)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r7 = r4.A0U
            if (r7 != 0) goto L_0x0451
            X.C18070vi.A11(r15)
            throw r3
        L_0x0316:
            X.0ve r1 = r4.A0E
            r0 = 8960(0x2300, float:1.2556E-41)
            X.0vf r10 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r10, r1, r0)
            if (r0 != 0) goto L_0x036c
            java.util.Set r11 = r9.A09
            X.0ve r1 = r4.A0E
            r0 = 10325(0x2855, float:1.4468E-41)
            boolean r0 = X.C18020vd.A05(r10, r1, r0)
            if (r0 == 0) goto L_0x035a
            X.00H r0 = r4.A13
            if (r0 == 0) goto L_0x06b1
            java.lang.Object r0 = r0.get()
            X.1md r0 = (X.C35681md) r0
            X.1ch r12 = r4.A4m()
            X.1mc r0 = r0.A0C
            X.10F r0 = r0.A00
            X.10E r0 = r0.A00
            X.10I r9 = X.AnonymousClass10E.AL1(r0)
            X.1PY r8 = X.AnonymousClass3Ma.A0l(r0)
            X.00S r0 = r0.A7S
            java.lang.Object r1 = r0.get()
            X.5Y9 r1 = (X.AnonymousClass5Y9) r1
            X.43e r0 = new X.43e
            r0.<init>(r8, r12, r1, r9)
            r0.A01()
        L_0x035a:
            X.2Qo r0 = X.C49462Qo.A02
            boolean r0 = r11.contains(r0)
            if (r0 == 0) goto L_0x030b
            X.0ve r1 = r4.A0E
            r0 = 10328(0x2858, float:1.4473E-41)
            boolean r0 = X.C18020vd.A05(r10, r1, r0)
            if (r0 == 0) goto L_0x030b
        L_0x036c:
            X.2Dk r0 = A0y(r4)
            if (r0 == 0) goto L_0x030b
            X.3VG r0 = r4.A0j
            java.lang.String r8 = "newsletterInsightsViewModel"
            if (r0 == 0) goto L_0x06ad
            X.1DT r1 = r0.A01
            X.5TL r0 = new X.5TL
            r0.<init>(r4)
            X.C91634g0.A00(r4, r1, r0, r5)
            X.3VG r0 = r4.A0j
            if (r0 == 0) goto L_0x06ad
            X.1DS r1 = r0.A00
            X.5TM r0 = new X.5TM
            r0.<init>(r4)
            X.C91634g0.A00(r4, r1, r0, r5)
            X.3VG r1 = r4.A0j
            if (r1 == 0) goto L_0x06ad
            X.0vl r0 = r4.A1M
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            r1.A0V(r0, r5)
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0U
            if (r0 != 0) goto L_0x03a7
            X.C18070vi.A11(r15)
            throw r3
        L_0x03a7:
            android.view.View r1 = r0.A0F
            r0 = 2131433034(0x7f0b164a, float:1.8487842E38)
            android.view.View r10 = X.C72463Mc.A0M(r1, r0)
            X.C18070vi.A0X(r10)
            r0 = 2131431660(0x7f0b10ec, float:1.8485055E38)
            android.view.View r11 = r10.findViewById(r0)
            com.whatsapp.SectionHeaderView r11 = (com.whatsapp.SectionHeaderView) r11
            android.content.res.Resources r9 = r11.getResources()
            r8 = 2131755273(0x7f100109, float:1.914142E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r0 = 30
            X.C17880vN.A1T(r1, r0, r5)
            java.lang.String r0 = r9.getQuantityString(r8, r0, r1)
            r11.setHeaderText((java.lang.String) r0)
            r11.setInfoIconVisibility(r5)
            X.4dS r0 = new X.4dS
            r0.<init>(r4)
            r11.setInfoIconClickListener(r0)
            r0 = 2131435059(0x7f0b1e33, float:1.849195E38)
            android.view.View r1 = r10.findViewById(r0)
            r0 = 42
            X.C90054dS.A00(r1, r4, r0)
            r0 = 2131429091(0x7f0b06e3, float:1.8479845E38)
            android.widget.ImageView r9 = X.AnonymousClass3MW.A0H(r10, r0)
            X.0vb r8 = r4.A00
            android.content.Context r1 = r9.getContext()
            r0 = 2131233242(0x7f0809da, float:1.8082616E38)
            X.AnonymousClass3NL.A01(r1, r9, r8, r0)
            r0 = 2131431659(0x7f0b10eb, float:1.8485053E38)
            android.view.View r1 = r10.findViewById(r0)
            r0 = 43
            X.C90054dS.A00(r1, r4, r0)
            r0 = 2131431661(0x7f0b10ed, float:1.8485058E38)
            android.view.View r1 = r10.findViewById(r0)
            r0 = 44
            X.C90054dS.A00(r1, r4, r0)
            if (r24 == 0) goto L_0x0445
            java.lang.String r0 = "key_insights_session_id"
            long r10 = r2.getLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            if (r1 == 0) goto L_0x0445
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0438
            X.00H r0 = r4.A4o()
            r0.get()
            long r0 = X.AnonymousClass74D.A01()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            if (r1 == 0) goto L_0x0445
        L_0x0438:
            long r0 = r1.longValue()
        L_0x043c:
            r4.A01 = r0
            if (r24 != 0) goto L_0x030b
            r4.A13(r5, r3)
            goto L_0x030b
        L_0x0445:
            X.00H r0 = r4.A4o()
            r0.get()
            long r0 = X.AnonymousClass74D.A01()
            goto L_0x043c
        L_0x0451:
            r1 = 45
            X.4dS r0 = new X.4dS
            r0.<init>(r4, r1)
            r7.A0A = r0
            X.2Dk r1 = A0y(r4)
            if (r1 == 0) goto L_0x0543
            boolean r0 = r1.A0P()
            if (r0 != 0) goto L_0x0543
            boolean r0 = r4.A1R(r1)
            if (r0 != 0) goto L_0x0543
            X.0ve r7 = r4.A0E
            r1 = 7473(0x1d31, float:1.0472E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r1)
            if (r0 == 0) goto L_0x0543
            com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout r0 = r4.A0U
            if (r0 == 0) goto L_0x0499
            android.view.View r1 = r0.A0F
            r0 = 2131433037(0x7f0b164d, float:1.8487848E38)
            android.view.View r1 = X.C72463Mc.A0M(r1, r0)
            X.C18070vi.A0X(r1)
            r0 = 2131433038(0x7f0b164e, float:1.848785E38)
            androidx.recyclerview.widget.RecyclerView r9 = X.AnonymousClass3MX.A0Q(r1, r0)
            X.6l3 r8 = r4.A0N
            if (r8 == 0) goto L_0x04ff
            X.1pZ r1 = r4.A0X
            if (r1 != 0) goto L_0x049d
            java.lang.String r15 = "contactPhotoLoader"
        L_0x0499:
            X.C18070vi.A11(r15)
            throw r3
        L_0x049d:
            X.C18070vi.A0b(r9)
            X.4oh r0 = new X.4oh
            r0.<init>(r4)
            r7 = 0
            X.7KN r0 = r8.A00(r9, r1, r0, r5)
            r4.A0l = r0
            r0.A00()
            X.7KN r9 = r4.A0l
            if (r9 == 0) goto L_0x04f9
            androidx.recyclerview.widget.RecyclerView r8 = r9.A01
            X.7Af r1 = r9.A03
            java.util.ArrayList r0 = r8.A12
            r0.add(r1)
            android.content.res.Resources r11 = r8.getResources()
            android.util.DisplayMetrics r0 = r11.getDisplayMetrics()
            int r1 = r0.widthPixels
            android.util.DisplayMetrics r0 = r11.getDisplayMetrics()
            int r0 = r0.heightPixels
            int r10 = java.lang.Math.max(r1, r0)
            boolean r1 = r9.A06
            r0 = 2131168449(0x7f070cc1, float:1.79512E38)
            if (r1 == 0) goto L_0x04da
            r0 = 2131168447(0x7f070cbf, float:1.7951196E38)
        L_0x04da:
            int r8 = r11.getDimensionPixelSize(r0)
            r0 = 2131168779(0x7f070e0b, float:1.795187E38)
            int r0 = r11.getDimensionPixelSize(r0)
            int r0 = r0 * 2
            int r8 = r8 + r0
            float r1 = (float) r10
            float r0 = (float) r8
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            float r8 = (float) r0
            int r1 = (int) r8
            X.5l0 r0 = r9.A04
            r0.A00 = r1
            r0.notifyDataSetChanged()
        L_0x04f9:
            X.440 r8 = r4.A0m
            if (r8 != 0) goto L_0x0502
            r15 = r14
            goto L_0x0499
        L_0x04ff:
            java.lang.String r15 = "newsletterListViewHolderFactory"
            goto L_0x0499
        L_0x0502:
            X.1OX r1 = X.C41561wd.A00(r8)
            com.whatsapp.newsletter.viewmodel.NewsletterViewModel$fetchSimilarNewsletters$1 r0 = new com.whatsapp.newsletter.viewmodel.NewsletterViewModel$fetchSimilarNewsletters$1
            r0.<init>(r8, r3)
            X.AnonymousClass3MX.A1Q(r0, r1)
            if (r24 == 0) goto L_0x0619
            java.lang.String r0 = "key_current_similar_newsletters_session_id"
            long r10 = r2.getLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r10)
            if (r1 == 0) goto L_0x0619
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0533
            X.00H r0 = r4.A4o()
            r0.get()
            long r0 = X.AnonymousClass74D.A01()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            if (r1 == 0) goto L_0x0619
        L_0x0533:
            long r0 = r1.longValue()
        L_0x0537:
            r4.A00 = r0
            if (r24 == 0) goto L_0x0541
            java.lang.String r0 = "key_has_logged_initial_similar_newsletters_impressions"
            boolean r7 = r2.getBoolean(r0, r5)
        L_0x0541:
            r4.A1A = r7
        L_0x0543:
            A19(r4)
            X.2Dk r7 = A0y(r4)
            if (r7 == 0) goto L_0x056f
            X.0ve r2 = r4.A0E
            r1 = 5621(0x15f5, float:7.877E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            boolean r0 = r7.A0P()
            if (r0 == 0) goto L_0x056f
            if (r1 == 0) goto L_0x056f
            X.00H r0 = r4.A13
            if (r0 == 0) goto L_0x06a7
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1md r1 = (X.C35681md) r1
            X.1ch r0 = r4.A4m()
            r1.A07(r0)
        L_0x056f:
            A1P(r4, r5, r5)
            X.2Dk r7 = A0y(r4)
            if (r7 == 0) goto L_0x05b4
            X.0vl r8 = r4.A1I
            android.view.View r9 = X.AnonymousClass3MW.A0A(r8)
            X.00H r0 = r4.A10
            if (r0 == 0) goto L_0x06a1
            X.0ve r2 = X.AnonymousClass3MY.A0W(r0)
            r1 = 8141(0x1fcd, float:1.1408E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r2 = 0
            if (r0 == 0) goto L_0x0616
            X.9Ig r1 = r7.A02
            X.9Ig r0 = X.C179509Ig.SUBSCRIBED
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 == 0) goto L_0x0616
        L_0x059b:
            r9.setVisibility(r2)
            android.view.View r0 = X.AnonymousClass3MW.A0A(r8)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x05b4
            r4.A12()
            android.view.View r1 = X.AnonymousClass3MW.A0A(r8)
            r0 = 36
            X.AnonymousClass3MZ.A1O(r1, r4, r7, r0)
        L_0x05b4:
            X.00H r0 = r4.A0s
            if (r0 == 0) goto L_0x0698
            X.10T r1 = X.C17880vN.A0V(r0)
            X.4mC r0 = r4.A1F
            r1.registerObserver(r0)
            X.00H r0 = r4.A0t
            if (r0 == 0) goto L_0x0695
            X.10T r1 = X.C17880vN.A0V(r0)
            X.3nw r0 = r4.A1H
            r1.registerObserver(r0)
            X.1NN r1 = r4.A0I
            X.4mF r0 = r4.A1G
            r1.registerObserver(r0)
            X.1Lf r1 = r4.A0V
            if (r1 == 0) goto L_0x069b
            X.4k9 r0 = r4.A1E
            r1.registerObserver(r0)
            X.1Lg r1 = r4.A0b
            if (r1 == 0) goto L_0x0692
            X.0vl r0 = r4.A1N
            java.lang.Object r0 = r0.getValue()
            r1.registerObserver(r0)
            X.440 r0 = r4.A0m
            if (r0 == 0) goto L_0x069d
            X.1Dg r1 = X.C95424mD.A00(r0)
            X.5TK r0 = new X.5TK
            r0.<init>(r4)
            X.C91634g0.A00(r4, r1, r0, r5)
            A1E(r4)
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "circular_transition"
            boolean r0 = r1.getBooleanExtra(r0, r5)
            java.lang.String r7 = "transitionNames"
            if (r0 == 0) goto L_0x0626
            android.view.View r2 = r4.A05
            if (r2 != 0) goto L_0x0675
            java.lang.String r0 = "headerView"
            X.C18070vi.A11(r0)
            throw r3
        L_0x0616:
            r2 = 8
            goto L_0x059b
        L_0x0619:
            X.00H r0 = r4.A4o()
            r0.get()
            long r0 = X.AnonymousClass74D.A01()
            goto L_0x0537
        L_0x0626:
            r0 = 2131433831(0x7f0b1967, float:1.8489459E38)
            android.view.View r2 = r4.findViewById(r0)
            if (r2 != 0) goto L_0x0675
        L_0x062f:
            X.3oU r0 = r4.A0g
            if (r0 == 0) goto L_0x068e
            r0.A0V()
            X.3oU r0 = r4.A0g
            if (r0 == 0) goto L_0x068e
            X.1DS r1 = r0.A02
            X.5TQ r0 = new X.5TQ
            r0.<init>(r4)
            X.C91634g0.A00(r4, r1, r0, r5)
            X.1i1 r1 = r4.A0Z
            if (r1 == 0) goto L_0x0688
            X.2R2 r0 = X.AnonymousClass2R2.A0u
            r1.A0A(r0, r6)
            r4.A2v(r5)
            A1G(r4)
            X.2Dk r0 = A0y(r4)
            if (r0 == 0) goto L_0x066b
            boolean r2 = r0.A0A
            r0 = 2131429911(0x7f0b0a17, float:1.8481508E38)
            android.view.View r1 = r4.findViewById(r0)
            if (r1 == 0) goto L_0x066b
            int r0 = X.C72453Mb.A07(r2)
            r1.setVisibility(r0)
        L_0x066b:
            X.0zA r0 = r4.A0E
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "wamoSubIntegrationInterface"
            X.C18070vi.A11(r0)
            throw r3
        L_0x0675:
            X.4ZR r1 = r4.A0R
            if (r1 != 0) goto L_0x067d
            X.C18070vi.A11(r7)
            throw r3
        L_0x067d:
            r0 = 2131899529(0x7f123489, float:1.9434007E38)
            java.lang.String r0 = r1.A02(r0)
            r2.setTransitionName(r0)
            goto L_0x062f
        L_0x0688:
            java.lang.String r0 = "chatMessageCounts"
            X.C18070vi.A11(r0)
            throw r3
        L_0x068e:
            X.C18070vi.A11(r13)
            throw r3
        L_0x0692:
            java.lang.String r14 = "messageObservers"
            goto L_0x069d
        L_0x0695:
            java.lang.String r14 = "chatStateObservers"
            goto L_0x069d
        L_0x0698:
            java.lang.String r14 = "chatObservers"
            goto L_0x069d
        L_0x069b:
            java.lang.String r14 = "contactObservers"
        L_0x069d:
            X.C18070vi.A11(r14)
            throw r3
        L_0x06a1:
            java.lang.String r0 = "newsletterConfig"
            X.C18070vi.A11(r0)
            throw r3
        L_0x06a7:
            java.lang.String r0 = "newsletterManager"
            X.C18070vi.A11(r0)
            throw r3
        L_0x06ad:
            X.C18070vi.A11(r8)
            throw r3
        L_0x06b1:
            java.lang.String r0 = "newsletterManager"
            X.C18070vi.A11(r0)
            throw r3
        L_0x06b7:
            java.lang.String r13 = "newsletterInfoMembersListViewModelFactory"
        L_0x06b9:
            X.C18070vi.A11(r13)
            throw r3
        L_0x06bd:
            X.C18070vi.A11(r15)
            throw r3
        L_0x06c1:
            java.lang.String r0 = "newsletterInsightsViewModelFactory"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x06c8:
            java.lang.String r0 = "conversationContactManager"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x06cf:
            java.lang.String r0 = "contactPhotos"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x06d6:
            java.lang.String r0 = "chatActionLogger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        String str;
        int i2 = i;
        if (i2 != 52) {
            return super.onCreateDialog(i2);
        }
        C46162Dk A0y2 = A0y(this);
        if (A0y2 == null) {
            return null;
        }
        AnonymousClass11P r35 = this.A05;
        C18030ve r16 = this.A0E;
        AnonymousClass1KB r15 = this.A05;
        AnonymousClass1L4 r14 = this.A09;
        AnonymousClass190 r13 = this.A03;
        AnonymousClass1KW r12 = this.A0D;
        AnonymousClass00H r0 = this.A18;
        if (r0 != null) {
            C1193267r r7 = (C1193267r) r0.get();
            AnonymousClass11C r11 = this.A08;
            C18000vb r10 = this.A00;
            AnonymousClass00H r02 = this.A0v;
            if (r02 != null) {
                EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) r02.get();
                C19830z4 r5 = this.A0A;
                C18010vc r4 = this.A0n;
                if (r4 != null) {
                    AnonymousClass00H r03 = this.A0w;
                    if (r03 != null) {
                        AnonymousClass1L2 r2 = this.A0C;
                        String str2 = A0y2.A0Q;
                        C18030ve r25 = r16;
                        AnonymousClass1L2 r20 = r2;
                        A59 a59 = (A59) r03.get();
                        C1193267r r22 = r7;
                        C19830z4 r17 = r5;
                        C18000vb r18 = r10;
                        C95864mv r19 = new C95864mv(this, 3);
                        AnonymousClass1KB r142 = r15;
                        AnonymousClass11C r152 = r11;
                        AnonymousClass11P r162 = r35;
                        C74763cR r112 = new C74763cR(this, r13, r142, r152, r162, r17, r18, r19, r20, a59, r22, r12, emojiSearchProvider, r25, r4, r14, str2, 52, 2131889635, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, 2131892562, 0, 147457);
                        r112.A06 = true;
                        return r112;
                    }
                    str = "expressionUserJourneyLogger";
                } else {
                    str = "sharedPreferencesFactory";
                }
            } else {
                str = "emojiSearchProvider";
            }
        } else {
            str = "recentEmojis";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onDestroy() {
        String str;
        AnonymousClass3VS r0;
        BaseNewslettersJob baseNewslettersJob;
        String str2;
        C81743zj r1 = this.A0e;
        if (r1 != null) {
            AnonymousClass18K r02 = this.A0d;
            if (r02 != null) {
                r02.CC7(r1);
            } else {
                str = "wamRuntime";
                C18070vi.A11(str);
                throw null;
            }
        }
        AnonymousClass00H r03 = this.A0s;
        if (r03 != null) {
            C17880vN.A0V(r03).unregisterObserver(this.A1F);
            AnonymousClass00H r04 = this.A0t;
            if (r04 != null) {
                C17880vN.A0V(r04).unregisterObserver(this.A1H);
                this.A0I.unregisterObserver(this.A1G);
                C24671Lf r12 = this.A0V;
                if (r12 != null) {
                    r12.unregisterObserver(this.A1E);
                    C24681Lg r13 = this.A0b;
                    if (r13 != null) {
                        AnonymousClass3MY.A1R(r13, this.A1N);
                        C37451pZ r05 = this.A0X;
                        if (r05 == null) {
                            str2 = "contactPhotoLoader";
                        } else {
                            r05.A02();
                            ImageView imageView = this.A1C;
                            if (imageView == null) {
                                str2 = "photoView";
                            } else {
                                imageView.setImageDrawable((Drawable) null);
                                if (!(!A1S(this) || (r0 = this.A0f) == null || (baseNewslettersJob = r0.A00) == null)) {
                                    baseNewslettersJob.cancel();
                                }
                                AnonymousClass00H r06 = this.A0y;
                                if (r06 != null) {
                                    C86164Qm r2 = (C86164Qm) r06.get();
                                    C107095Yj r07 = r2.A00;
                                    if (r07 != null) {
                                        r07.cancel();
                                    }
                                    AnonymousClass3Ma.A1J(r2.A01, r2, 33);
                                    super.onDestroy();
                                    return;
                                }
                                C18070vi.A11("newsletterAdminInvitationHandler");
                                throw null;
                            }
                        }
                        C18070vi.A11(str2);
                        throw null;
                    }
                    str = "messageObservers";
                } else {
                    str = "contactObservers";
                }
            } else {
                str = "chatStateObservers";
            }
        } else {
            str = "chatObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final C46162Dk A0y(NewsletterInfoActivity newsletterInfoActivity) {
        if (newsletterInfoActivity.A4l() == null && !newsletterInfoActivity.isFinishing()) {
            AnonymousClass3Ma.A1J(newsletterInfoActivity.A05, newsletterInfoActivity, 14);
        }
        return newsletterInfoActivity.A4l();
    }

    private final Long A0z() {
        Serializable serializableExtra = getIntent().getSerializableExtra("similar_newsletters_session_id");
        if (serializableExtra instanceof Long) {
            return (Long) serializableExtra;
        }
        return null;
    }

    public static final String A10(NewsletterInfoActivity newsletterInfoActivity) {
        String str;
        int i;
        C46162Dk A0y2 = A0y(newsletterInfoActivity);
        String str2 = "";
        if (A0y2 == null) {
            return str2;
        }
        String str3 = A0y2.A0R;
        if (str3 != null) {
            str2 = str3;
        }
        if (str.length() > 0) {
            i = 2131892897;
        } else {
            str = A0y2.A0S;
            if (str == null) {
                str = "impossible-code";
            }
            i = 2131892898;
        }
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = A0y2.A0T;
        return AnonymousClass3Ma.A10(newsletterInfoActivity, str, A1b, 1, i);
    }

    private final void A11() {
        if (isTaskRoot()) {
            Intent A062 = AnonymousClass3MY.A06(this, (AnonymousClass1LU) A4p().get(), A4m());
            C18070vi.A0X(A062);
            finishAndRemoveTask();
            startActivity(A062);
        }
    }

    private final void A13(int i, Integer num) {
        Integer num2 = num;
        ((AnonymousClass74D) C18070vi.A0E(A4o())).A0E(A4m(), (Integer) null, num2, 0, i, this.A01);
    }

    public static final void A14(NewsletterInfoActivity newsletterInfoActivity) {
        C46162Dk A0y2 = A0y(newsletterInfoActivity);
        if (A0y2 != null) {
            C73203Rj A002 = AnonymousClass4a6.A00(newsletterInfoActivity);
            A002.A0S(C17880vN.A0q(newsletterInfoActivity, A0y2.A0T, AnonymousClass3MW.A1a(), 0, 2131897309));
            C73203Rj.A05(newsletterInfoActivity, A002, 10, 2131898766);
            A002.A0g(newsletterInfoActivity, new C91604fx(newsletterInfoActivity, 48), 2131897305);
            AnonymousClass3MY.A1G(A002);
        }
    }

    public static final void A17(NewsletterInfoActivity newsletterInfoActivity) {
        newsletterInfoActivity.CNA(2131891797);
        AnonymousClass440 r0 = newsletterInfoActivity.A0m;
        if (r0 == null) {
            C18070vi.A11("newsletterViewModel");
            throw null;
        }
        r0.A03.A09(newsletterInfoActivity.A4m());
        C72453Mb.A0o(newsletterInfoActivity).A0F(newsletterInfoActivity.A4m(), AnonymousClass4aS.A00(newsletterInfoActivity.getIntent()), AnonymousClass00R.A0C, newsletterInfoActivity.A0z(), AnonymousClass4aS.A01(newsletterInfoActivity));
    }

    public static final void A18(NewsletterInfoActivity newsletterInfoActivity) {
        C46162Dk A0y2 = A0y(newsletterInfoActivity);
        if (A0y2 != null) {
            A1L(newsletterInfoActivity, AnonymousClass000.A1Z(A0y2.A02, C179509Ig.SUBSCRIBED));
            if (AnonymousClass000.A1Z(A0y2.A02, C179509Ig.GUEST) && newsletterInfoActivity.A1R(A0y2)) {
                C72453Mb.A1D(newsletterInfoActivity.findViewById(2131436499));
            }
            C87874Xk r1 = newsletterInfoActivity.A0T;
            if (r1 != null) {
                AnonymousClass1E7 r0 = newsletterInfoActivity.A0c;
                if (r0 == null) {
                    C18070vi.A11("contact");
                    throw null;
                } else {
                    r1.A02(r0);
                }
            }
        }
    }

    public static final void A19(NewsletterInfoActivity newsletterInfoActivity) {
        C46162Dk A0y2 = A0y(newsletterInfoActivity);
        if (A0y2 != null && !A0y2.A0P()) {
            C19880zA r1 = newsletterInfoActivity.A0E;
            if (r1 == null) {
                C18070vi.A11("wamoSubIntegrationInterface");
                throw null;
            } else if (r1.A07()) {
                r1.A03();
                newsletterInfoActivity.A1R.getValue();
                throw AnonymousClass000.A0s("maybeShowWamoSubChannelInfoManagement");
            }
        }
    }

    public static final void A1C(NewsletterInfoActivity newsletterInfoActivity) {
        newsletterInfoActivity.CNA(2131891797);
        AnonymousClass440 r0 = newsletterInfoActivity.A0m;
        if (r0 == null) {
            C18070vi.A11("newsletterViewModel");
            throw null;
        }
        r0.A03.A0A(newsletterInfoActivity.A4m());
        C72453Mb.A0o(newsletterInfoActivity).A0G(newsletterInfoActivity.A4m(), AnonymousClass4aS.A00(newsletterInfoActivity.getIntent()), AnonymousClass00R.A0C, newsletterInfoActivity.A0z(), AnonymousClass4aS.A01(newsletterInfoActivity));
    }

    public static final void A1D(NewsletterInfoActivity newsletterInfoActivity) {
        C46162Dk A0y2 = A0y(newsletterInfoActivity);
        if (A0y2 != null) {
            ((TextView) newsletterInfoActivity.A1J.getValue()).setText(C72483Me.A0W(newsletterInfoActivity.getResources(), (int) A0y2.A0G, 2131755282));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r4.A0A != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A1E(com.whatsapp.newsletter.NewsletterInfoActivity r7) {
        /*
            X.2Dk r4 = A0y(r7)
            if (r4 == 0) goto L_0x0020
            boolean r0 = r7.A1R(r4)
            if (r0 == 0) goto L_0x0021
            X.9Ig r1 = r4.A02
            X.9Ig r0 = X.C179509Ig.GUEST
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 == 0) goto L_0x0021
            r0 = 2131436499(0x7f0b23d3, float:1.849487E38)
            android.view.View r0 = r7.findViewById(r0)
            X.C72453Mb.A1D(r0)
        L_0x0020:
            return
        L_0x0021:
            boolean r1 = r7.A1R(r4)
            r0 = 2131434533(0x7f0b1c25, float:1.8490883E38)
            android.view.View r3 = X.AnonymousClass3MY.A0C(r7, r0)
            r2 = 0
            if (r1 != 0) goto L_0x0034
            boolean r1 = r4.A0A
            r0 = 1
            if (r1 == 0) goto L_0x0037
        L_0x0034:
            r0 = 0
            r2 = 8
        L_0x0037:
            r3.setVisibility(r2)
            if (r0 == 0) goto L_0x004b
            r0 = 2131434533(0x7f0b1c25, float:1.8490883E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r7, r0)
            r0 = 14
            X.AnonymousClass3Ma.A1D(r1, r7, r0)
            X.AnonymousClass3MW.A1Q(r1)
        L_0x004b:
            X.9Ig r1 = r4.A02
            X.9Ig r0 = X.C179509Ig.SUBSCRIBED
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            A1L(r7, r0)
            X.2Dk r3 = A0y(r7)
            if (r3 == 0) goto L_0x0094
            r0 = 2131433012(0x7f0b1634, float:1.8487798E38)
            android.view.View r2 = X.AnonymousClass3MY.A0C(r7, r0)
            boolean r0 = A1S(r7)
            r1 = 8
            int r0 = X.C72453Mb.A07(r0)
            r2.setVisibility(r0)
            r0 = 2131430063(0x7f0b0aaf, float:1.8481816E38)
            android.view.View r2 = X.AnonymousClass3MY.A0C(r7, r0)
            boolean r0 = r3.A0O()
            if (r0 == 0) goto L_0x007e
            r1 = 0
        L_0x007e:
            r2.setVisibility(r1)
            boolean r0 = r3.A0O()
            if (r0 == 0) goto L_0x0094
            r1 = 1
            r0 = 0
            A1M(r7, r1, r0)
            r0 = 16
            X.AnonymousClass3Ma.A1D(r2, r7, r0)
            X.AnonymousClass3MW.A1Q(r2)
        L_0x0094:
            X.2Dk r6 = A0y(r7)
            if (r6 == 0) goto L_0x00eb
            boolean r5 = r6.A0Q()
            r0 = 2131429894(0x7f0b0a06, float:1.8481474E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r7, r0)
            r4 = 0
            int r0 = X.C72453Mb.A07(r5)
            r1.setVisibility(r0)
            java.lang.String r3 = "Button"
            if (r5 == 0) goto L_0x00cc
            r0 = 17
            X.AnonymousClass3Ma.A1D(r1, r7, r0)
            X.AnonymousClass1Y5.A07(r1, r3)
            X.3oU r2 = r7.A0g
            if (r2 != 0) goto L_0x00c4
            java.lang.String r0 = "newsletterInfoViewModel"
        L_0x00bf:
            X.C18070vi.A11(r0)
        L_0x00c2:
            r0 = 0
            throw r0
        L_0x00c4:
            X.1ch r1 = r6.A0M()
            r0 = 1
            r2.A0Y(r1, r0, r4, r4)
        L_0x00cc:
            X.0vl r0 = r7.A1Q
            X.1bI r2 = X.AnonymousClass3MX.A0v(r0)
            if (r5 != 0) goto L_0x00d6
            r4 = 8
        L_0x00d6:
            r2.A04(r4)
            if (r5 == 0) goto L_0x00eb
            android.view.View r1 = r2.A02()
            r0 = 18
            X.AnonymousClass3Ma.A1D(r1, r7, r0)
            android.view.View r0 = r2.A02()
            X.AnonymousClass1Y5.A07(r0, r3)
        L_0x00eb:
            X.2Dk r0 = A0y(r7)
            if (r0 == 0) goto L_0x015e
            boolean r0 = r0.A0Q()
            java.lang.String r5 = "newsletterInfoViewModel"
            if (r0 == 0) goto L_0x0153
            X.3XK r0 = r7.A0k
            if (r0 != 0) goto L_0x0145
            X.4Pa r4 = r7.A0L
            if (r4 == 0) goto L_0x0113
            android.view.LayoutInflater r3 = r7.getLayoutInflater()
            X.C18070vi.A0X(r3)
            X.1pZ r1 = r7.A0X
            r2 = 0
            if (r1 != 0) goto L_0x0116
            java.lang.String r0 = "contactPhotoLoader"
            X.C18070vi.A11(r0)
            throw r2
        L_0x0113:
            java.lang.String r0 = "newsletterInvitedAdminsListAdapterFactory"
            goto L_0x00bf
        L_0x0116:
            r0 = 0
            X.3XK r0 = r4.A00(r3, r1, r7, r0)
            r7.A0k = r0
            r0 = 2131427686(0x7f0b0166, float:1.8476995E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r7, r0)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.3XK r0 = r7.A0k
            r1.setAdapter(r0)
            com.whatsapp.newsletter.NewsletterInfoActivity$initInvitedAdminListLayout$layoutManager$1 r0 = new com.whatsapp.newsletter.NewsletterInfoActivity$initInvitedAdminListLayout$layoutManager$1
            r0.<init>(r7)
            r1.setLayoutManager(r0)
            r1.setItemAnimator(r2)
            X.3oU r0 = r7.A0g
            if (r0 == 0) goto L_0x01c7
            X.1DT r2 = r0.A05
            X.5TN r1 = new X.5TN
            r1.<init>(r7)
            r0 = 0
            X.C91634g0.A00(r7, r2, r1, r0)
        L_0x0145:
            X.3oU r3 = r7.A0g
            if (r3 == 0) goto L_0x01c7
            X.1ch r2 = r7.A4m()
            r1 = 1
            r0 = 0
            r3.A0Y(r2, r0, r1, r0)
            goto L_0x015e
        L_0x0153:
            X.3oU r0 = r7.A0g
            if (r0 == 0) goto L_0x01c7
            X.1DT r1 = r0.A05
            X.1Om r0 = X.C25511Om.A00
            r1.A0E(r0)
        L_0x015e:
            boolean r2 = A1S(r7)
            r0 = 2131433013(0x7f0b1635, float:1.84878E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r7, r0)
            int r0 = X.C72453Mb.A07(r2)
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x0020
            X.2Dk r0 = A0y(r7)
            if (r0 == 0) goto L_0x0191
            boolean r2 = r0.A0Q()
            r0 = 2131431790(0x7f0b116e, float:1.848532E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r7, r0)
            int r0 = X.C72453Mb.A07(r2)
            r1.setVisibility(r0)
            if (r2 == 0) goto L_0x0191
            r0 = 31
            X.C90054dS.A00(r1, r7, r0)
        L_0x0191:
            r0 = 2131433043(0x7f0b1653, float:1.848786E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r7, r0)
            r0 = 32
            X.C90054dS.A00(r1, r7, r0)
            X.2Dk r0 = r7.A4l()
            if (r0 == 0) goto L_0x01b7
            boolean r1 = r0.A0Q()
            r0 = 1
            if (r1 != r0) goto L_0x01b7
            r0 = 2131431815(0x7f0b1187, float:1.848537E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0I(r7, r0)
            r0 = 2131892812(0x7f121a4c, float:1.9420383E38)
            r1.setText(r0)
        L_0x01b7:
            r0 = 2131433015(0x7f0b1637, float:1.8487804E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r7, r0)
            r0 = 37
            X.C90054dS.A00(r1, r7, r0)
            A1D(r7)
            return
        L_0x01c7:
            X.C18070vi.A11(r5)
            goto L_0x00c2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.A1E(com.whatsapp.newsletter.NewsletterInfoActivity):void");
    }

    public static final void A1F(NewsletterInfoActivity newsletterInfoActivity) {
        String str;
        C46162Dk A0y2 = A0y(newsletterInfoActivity);
        if (A0y2 != null) {
            String str2 = A0y2.A0Q;
            if (str2 == null) {
                str2 = "";
            }
            int dimensionPixelSize = newsletterInfoActivity.getResources().getDimensionPixelSize(2131168774);
            boolean A1R2 = newsletterInfoActivity.A1R(A0y2);
            View view = newsletterInfoActivity.A02;
            if (view != null) {
                view.setVisibility(C72453Mb.A07(A1R2 ^ true ? 1 : 0));
                String str3 = "noDescription";
                String str4 = "hasDescription";
                if (str2.length() <= 0 || A1R2) {
                    boolean A0P2 = A0y2.A0P();
                    View view2 = newsletterInfoActivity.A04;
                    if (A0P2) {
                        if (view2 != null) {
                            view2.setVisibility(8);
                            WaTextView waTextView = newsletterInfoActivity.A0Q;
                            if (waTextView != null) {
                                waTextView.setVisibility(0);
                            }
                            C18070vi.A11(str3);
                            throw null;
                        }
                        C18070vi.A11(str4);
                        throw null;
                    }
                    if (view2 != null) {
                        view2.setVisibility(8);
                        WaTextView waTextView2 = newsletterInfoActivity.A0Q;
                        if (waTextView2 != null) {
                            waTextView2.setVisibility(8);
                            dimensionPixelSize = 0;
                        }
                        C18070vi.A11(str3);
                        throw null;
                    }
                    C18070vi.A11(str4);
                    throw null;
                }
                View view3 = newsletterInfoActivity.A04;
                if (view3 != null) {
                    view3.setVisibility(0);
                    WaTextView waTextView3 = newsletterInfoActivity.A0Q;
                    if (waTextView3 != null) {
                        waTextView3.setVisibility(8);
                        AnonymousClass11C r5 = newsletterInfoActivity.A08;
                        C18010vc r3 = newsletterInfoActivity.A0n;
                        if (r3 != null) {
                            ReadMoreTextView readMoreTextView = newsletterInfoActivity.A0q;
                            str3 = "descriptionTextView";
                            if (readMoreTextView != null) {
                                SpannableStringBuilder A092 = AnonymousClass3MW.A09(C26302CxJ.A0C(r5, r3, C43251zV.A03(newsletterInfoActivity, readMoreTextView.getPaint(), newsletterInfoActivity.A0D, str2)));
                                AnonymousClass00H r0 = newsletterInfoActivity.A0x;
                                if (r0 != null) {
                                    C36401np r1 = (C36401np) r0.get();
                                    ReadMoreTextView readMoreTextView2 = newsletterInfoActivity.A0q;
                                    if (readMoreTextView2 != null) {
                                        r1.A08(readMoreTextView2.getContext(), A092);
                                        ReadMoreTextView readMoreTextView3 = newsletterInfoActivity.A0q;
                                        if (readMoreTextView3 != null) {
                                            readMoreTextView3.A0S(A092, (List) null, 0, false);
                                        }
                                    }
                                } else {
                                    str = "linkifier";
                                }
                            }
                        } else {
                            str = "sharedPreferencesFactory";
                        }
                        C18070vi.A11(str);
                        throw null;
                    }
                    C18070vi.A11(str3);
                    throw null;
                }
                C18070vi.A11(str4);
                throw null;
                if (A0y2.A0P() && !A1R2) {
                    View view4 = newsletterInfoActivity.A02;
                    if (view4 != null) {
                        C90054dS.A00(view4, newsletterInfoActivity, 46);
                    }
                }
                long A093 = newsletterInfoActivity.A05.A09(A0y2.A0E);
                WaTextView waTextView4 = newsletterInfoActivity.A0P;
                str4 = "creationInfoView";
                if (waTextView4 != null) {
                    waTextView4.setText(C64052u8.A0E(newsletterInfoActivity.A00, new Object[0], 2131892548, 2131892549, 2131892547, A093, false));
                    WaTextView waTextView5 = newsletterInfoActivity.A0P;
                    if (waTextView5 != null) {
                        C43531zx.A03(waTextView5, new C39351sv(0, dimensionPixelSize, 0, 0));
                        return;
                    }
                }
                C18070vi.A11(str4);
                throw null;
            }
            C18070vi.A11("descriptionCard");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r5 != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r5 != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r5 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0070, code lost:
        if (r4 == false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A1G(com.whatsapp.newsletter.NewsletterInfoActivity r6) {
        /*
            X.2Dk r2 = A0y(r6)
            if (r2 == 0) goto L_0x0020
            boolean r5 = r6.A1R(r2)
            boolean r4 = r2.A0P()
            r3 = 8
            if (r5 == 0) goto L_0x0021
            if (r4 != 0) goto L_0x0021
            r0 = 2131429417(0x7f0b0829, float:1.8480506E38)
            android.view.View r0 = r6.findViewById(r0)
            if (r0 == 0) goto L_0x0020
            r0.setVisibility(r3)
        L_0x0020:
            return
        L_0x0021:
            r0 = 2131433068(0x7f0b166c, float:1.8487911E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x0034
            if (r4 != 0) goto L_0x002f
            r0 = 0
            if (r5 == 0) goto L_0x0031
        L_0x002f:
            r0 = 8
        L_0x0031:
            r1.setVisibility(r0)
        L_0x0034:
            r0 = 2131433069(0x7f0b166d, float:1.8487913E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x0042
            r0 = 0
            if (r5 == 0) goto L_0x0044
        L_0x0042:
            r0 = 8
        L_0x0044:
            r1.setVisibility(r0)
            r0 = 33
            X.C90054dS.A00(r1, r6, r0)
        L_0x004c:
            r0 = 2131433067(0x7f0b166b, float:1.848791E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x0064
            if (r4 != 0) goto L_0x005a
            r0 = 0
            if (r5 == 0) goto L_0x005c
        L_0x005a:
            r0 = 8
        L_0x005c:
            r1.setVisibility(r0)
            r0 = 34
            X.C90054dS.A00(r1, r6, r0)
        L_0x0064:
            r0 = 2131433084(0x7f0b167c, float:1.8487944E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x007c
            if (r5 != 0) goto L_0x0072
            r0 = 0
            if (r4 != 0) goto L_0x0074
        L_0x0072:
            r0 = 8
        L_0x0074:
            r1.setVisibility(r0)
            r0 = 35
            X.C90054dS.A00(r1, r6, r0)
        L_0x007c:
            r0 = 2131432986(0x7f0b161a, float:1.8487745E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x0095
            boolean r0 = r2.A0P()
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            r0 = 36
            X.C90054dS.A00(r1, r6, r0)
        L_0x0095:
            r0 = 2131437006(0x7f0b25ce, float:1.8495898E38)
            android.view.View r1 = r6.findViewById(r0)
            if (r1 == 0) goto L_0x0020
            r1.setVisibility(r3)
            r0 = 35
            X.AnonymousClass3MZ.A1O(r1, r6, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.NewsletterInfoActivity.A1G(com.whatsapp.newsletter.NewsletterInfoActivity):void");
    }

    public static final void A1J(NewsletterInfoActivity newsletterInfoActivity, String str, boolean z) {
        if (((C23391Fw) newsletterInfoActivity.getLifecycle()).A02 != C23401Fx.DESTROYED) {
            if (z) {
                C76823oU r3 = newsletterInfoActivity.A0g;
                if (r3 == null) {
                    C18070vi.A11("newsletterInfoViewModel");
                    throw null;
                }
                r3.A0Y(newsletterInfoActivity.A4m(), false, true, false);
            }
            newsletterInfoActivity.A1Q(str);
        }
    }

    public static final void A1L(NewsletterInfoActivity newsletterInfoActivity, boolean z) {
        View A0C2 = AnonymousClass3MY.A0C(newsletterInfoActivity, 2131436500);
        int i = 0;
        if (!z) {
            i = 8;
        } else if (newsletterInfoActivity.A0E == null) {
            C18070vi.A11("wamoSubIntegrationInterface");
            throw null;
        }
        A0C2.setVisibility(i);
        AnonymousClass3Ma.A1D(A0C2, newsletterInfoActivity, 15);
        AnonymousClass3MW.A1Q(A0C2);
    }

    public static final void A1M(NewsletterInfoActivity newsletterInfoActivity, boolean z, boolean z2) {
        int i;
        C46162Dk A0y2 = A0y(newsletterInfoActivity);
        if (A0y2 != null && A1S(newsletterInfoActivity)) {
            TextView A0L2 = AnonymousClass3MX.A0L(newsletterInfoActivity, 2131433014);
            if (!A0y2.A0P() || (!z && !z2)) {
                if (A0L2 != null) {
                    i = 2131892626;
                } else {
                    return;
                }
            } else if (A0L2 != null) {
                i = 2131892631;
            } else {
                return;
            }
            A0L2.setText(i);
        }
    }

    public static final void A1P(NewsletterInfoActivity newsletterInfoActivity, boolean z, boolean z2) {
        View findViewById;
        boolean z3;
        int i;
        C46162Dk A0y2;
        C46162Dk A0y3 = A0y(newsletterInfoActivity);
        if (A0y3 == null) {
            return;
        }
        if ((!A0y3.A0Q() || z) && (findViewById = newsletterInfoActivity.findViewById(2131427547)) != null) {
            int i2 = 0;
            if (newsletterInfoActivity.A1R(A0y3) || A0y3.A0A) {
                z3 = true;
                i = 8;
            } else {
                z3 = false;
                if (AnonymousClass000.A1Z(A0y3.A02, C179509Ig.SUBSCRIBED) || A0y3.A0O() || z2) {
                    i = 0;
                }
                i = 8;
            }
            findViewById.setVisibility(i);
            if (z3) {
                return;
            }
            if (!A0y3.A0Q() || z2) {
                View A052 = C18070vi.A05(newsletterInfoActivity.A00, 2131432883);
                if (!AnonymousClass000.A1Z(A0y3.A02, C179509Ig.SUBSCRIBED) && !A0y3.A0O() && !z2) {
                    i2 = 8;
                }
                A052.setVisibility(i2);
                ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) A052;
                TextView A0E2 = AnonymousClass3Ma.A0E(listItemWithLeftIcon, 2131432096);
                newsletterInfoActivity.A0A = (SwitchCompat) listItemWithLeftIcon.findViewById(2131432885);
                AnonymousClass1Y5.A02(A052, 2131886185);
                if (newsletterInfoActivity.A0A == null) {
                    newsletterInfoActivity.A0A = AnonymousClass4G4.A00(newsletterInfoActivity, listItemWithLeftIcon);
                }
                C72463Mc.A0y(newsletterInfoActivity, A0E2, 2130970343, 2131101314);
                SwitchCompat switchCompat = newsletterInfoActivity.A0A;
                if (switchCompat != null && (A0y2 = A0y(newsletterInfoActivity)) != null) {
                    AnonymousClass3MY.A0w(newsletterInfoActivity, switchCompat, 2131886229);
                    switchCompat.setChecked(A0y2.A0B);
                    switchCompat.setEnabled(!A0y2.A0A);
                    C90874em.A00(switchCompat, newsletterInfoActivity, 18);
                }
            }
        }
    }

    public static final boolean A1S(NewsletterInfoActivity newsletterInfoActivity) {
        C46162Dk A4l = newsletterInfoActivity.A4l();
        if (A4l == null || !A4l.A0P() || newsletterInfoActivity.A1R(newsletterInfoActivity.A4l())) {
            return false;
        }
        return true;
    }

    public void A4e() {
        super.A4e();
        C76823oU r0 = this.A0g;
        if (r0 == null) {
            C18070vi.A11("newsletterInfoViewModel");
            throw null;
        }
        C80433x8 r1 = r0.A0A;
        C80413x6 r02 = r1.A00;
        if (r02 != null) {
            r02.A00.A01();
        }
        r1.A00 = null;
    }

    public final void A4r(boolean z) {
        CharSequence charSequence;
        C46162Dk A0y2 = A0y(this);
        if (A0y2 != null) {
            C72453Mb.A0o(this).A0A(15, false);
            NewsletterInfoLayout newsletterInfoLayout = this.A0U;
            if (newsletterInfoLayout == null) {
                C18070vi.A11("rootLayout");
                throw null;
            }
            newsletterInfoLayout.setImportantForAccessibility(4);
            C34001jj A0H2 = AnonymousClass3Ma.A0H(this);
            TextView A0L2 = AnonymousClass3MX.A0L(this, 2131433014);
            if (A0L2 != null) {
                charSequence = A0L2.getText();
            } else {
                charSequence = null;
            }
            String valueOf = String.valueOf(charSequence);
            boolean A1R2 = AnonymousClass000.A1R((A0y2.A0G > 5000 ? 1 : (A0y2.A0G == 5000 ? 0 : -1)));
            NewsletterInfoMembersSearchFragment newsletterInfoMembersSearchFragment = new NewsletterInfoMembersSearchFragment();
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putString("footer_text", valueOf);
            A0D2.putBoolean("enter_ime", z);
            A0D2.putBoolean("is_over_max", A1R2);
            A0D2.putBoolean("enter_animated", true);
            A0D2.putBoolean("exit_animated", true);
            newsletterInfoMembersSearchFragment.A1R(A0D2);
            A0H2.A09(newsletterInfoMembersSearchFragment, 2131434873);
            A0H2.A0H((String) null);
            A0H2.A01();
        }
    }

    public C23401Fx BPx() {
        return ((C23391Fw) getLifecycle()).A02;
    }

    public void onBackPressed() {
        Fragment A0O2 = getSupportFragmentManager().A0O(2131434873);
        if (A0O2 instanceof C107545aC) {
            ((C107545aC) A0O2).BKr();
            return;
        }
        A11();
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Integer num;
        Intent A0A2;
        C46162Dk A4l;
        int A0B2 = C72453Mb.A0B(menuItem);
        if (A0B2 == 1001) {
            C46162Dk A4l2 = A4l();
            if (A4l2 == null || !A4l2.A0P()) {
                AnonymousClass3Ma.A1J(this.A05, this, 12);
                return true;
            }
            C72453Mb.A0o(this).A0M(false);
            AnonymousClass00H r0 = this.A15;
            if (r0 != null) {
                A6Q a6q = (A6Q) r0.get();
                C18030ve r1 = a6q.A01;
                C18040vf r2 = C18040vf.A02;
                if (C18020vd.A05(r2, r1, 11284)) {
                    num = A6Q.A01(a6q, 1);
                } else {
                    num = null;
                }
                if (!C18020vd.A05(r2, this.A0E, 6618) || (A4l = A4l()) == null || !AnonymousClass000.A1Z(A4l.A05, AnonymousClass9IW.VERIFIED)) {
                    AnonymousClass3MY.A1Q(this);
                    C29681ch A4m = A4m();
                    A0A2 = C17880vN.A0A();
                    A0A2.setClassName(getPackageName(), "com.whatsapp.newsletter.ui.NewsletterEditActivity");
                    AnonymousClass3MY.A12(A0A2, A4m, "jid");
                } else {
                    AnonymousClass3MY.A1Q(this);
                    C29681ch A4m2 = A4m();
                    A0A2 = AnonymousClass3MZ.A07(A4m2, 1);
                    A0A2.setClassName(getPackageName(), "com.whatsapp.newsletter.ui.mv.NewsletterEditMVActivity");
                    AnonymousClass3MY.A12(A0A2, A4m2, "jid");
                    A0A2.putExtra("mv_referral_surface", 5);
                }
                A0A2.putExtra("log_instance_key", num);
                startActivityForResult(A0A2, 50);
                return true;
            }
            C18070vi.A11("newsletterPerfTracker");
            throw null;
        } else if (A0B2 != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass4FQ.A00(this);
            A11();
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        AnonymousClass00H r0 = this.A13;
        if (r0 != null) {
            ((C35681md) C18070vi.A0E(r0)).A05(A4m());
            C76823oU r02 = this.A0g;
            if (r02 == null) {
                C18070vi.A11("newsletterInfoViewModel");
                throw null;
            }
            boolean z = false;
            r02.A0Z(false);
            AnonymousClass3VS r1 = this.A0f;
            if (r1 != null) {
                r1.A0T(AnonymousClass9IV.SHORT);
            }
            if (this.A0l != null) {
                if (AnonymousClass3MW.A0A(this.A1P).getVisibility() == 0) {
                    z = true;
                }
                A1K(this, z);
                return;
            }
            return;
        }
        C18070vi.A11("newsletterManager");
        throw null;
    }

    public void onStart() {
        super.onStart();
        if (this.A1B > 0) {
            AnonymousClass74D A0o2 = C72453Mb.A0o(this);
            C29681ch A4m = A4m();
            long uptimeMillis = SystemClock.uptimeMillis() - this.A1B;
            C36331ni r6 = A0o2.A06;
            r6.A0C.CGF(new AnonymousClass3CQ((AnonymousClass2H8) null, A4m, r6, 17, 0, 0, uptimeMillis));
            this.A1B = 0;
        }
    }

    public void CAC() {
        A1A(this);
    }
}
