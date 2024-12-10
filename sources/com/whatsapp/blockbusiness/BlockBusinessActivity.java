package com.whatsapp.blockbusiness;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass12L;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass205;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4GC;
import X.AnonymousClass4aU;
import X.C000200d;
import X.C003401n;
import X.C17880vN;
import X.C18070vi;
import X.C22941Dw;
import X.C34001jj;
import X.C42761yh;
import X.C61552ps;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C90994ey;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.whatsapp.jid.UserJid;

public final class BlockBusinessActivity extends AnonymousClass1FY {
    public AnonymousClass12L A00;
    public AnonymousClass00H A01;
    public UserJid A02;
    public String A03;
    public boolean A04;

    public BlockBusinessActivity() {
        this(0);
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            this.A01 = C000200d.A00(A0K.A0D);
            this.A00 = AnonymousClass3MZ.A0u(r2);
        }
    }

    public void onBackPressed() {
        String str;
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            C61552ps r3 = (C61552ps) r0.get();
            String str2 = this.A03;
            if (str2 == null) {
                str = "entryPoint";
            } else {
                UserJid userJid = this.A02;
                if (userJid == null) {
                    str = "userJid";
                } else {
                    C61552ps.A00(r3, userJid, str2, 2);
                    super.onBackPressed();
                    return;
                }
            }
        } else {
            str = "blockFunnelLogger";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        String A15;
        super.onCreate(bundle);
        setContentView(2131624283);
        String stringExtra = getIntent().getStringExtra("jid_extra");
        if (stringExtra != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("third_party_bot", false);
            C22941Dw r0 = UserJid.Companion;
            this.A02 = C22941Dw.A03(stringExtra);
            String stringExtra2 = getIntent().getStringExtra("entry_point_extra");
            if (stringExtra2 != null) {
                this.A03 = stringExtra2;
                AnonymousClass00H r02 = this.A01;
                if (r02 != null) {
                    C61552ps r4 = (C61552ps) r02.get();
                    String str2 = this.A03;
                    if (str2 != null) {
                        UserJid userJid = this.A02;
                        str = "userJid";
                        if (userJid != null) {
                            C61552ps.A00(r4, userJid, str2, 0);
                            UserJid userJid2 = this.A02;
                            if (userJid2 != null) {
                                AnonymousClass12L r03 = this.A00;
                                if (r03 != null) {
                                    if (C42761yh.A01(r03, userJid2)) {
                                        Context applicationContext = getApplicationContext();
                                        C18070vi.A0X(applicationContext);
                                        A15 = AnonymousClass3Ma.A10(applicationContext, AnonymousClass4GC.A00(applicationContext), AnonymousClass3MW.A1a(), 0, 2131898327);
                                    } else {
                                        int i = 2131887172;
                                        if (booleanExtra) {
                                            i = 2131887173;
                                        }
                                        A15 = AnonymousClass3MX.A15(this, i);
                                    }
                                    C003401n supportActionBar = getSupportActionBar();
                                    if (supportActionBar != null) {
                                        supportActionBar.A0W(true);
                                        supportActionBar.A0S(A15);
                                    }
                                    if (bundle == null) {
                                        Intent intent = getIntent();
                                        C34001jj A0H = AnonymousClass3Ma.A0H(this);
                                        String str3 = this.A03;
                                        if (str3 != null) {
                                            boolean booleanExtra2 = intent.getBooleanExtra("show_success_toast_extra", false);
                                            boolean booleanExtra3 = intent.getBooleanExtra("show_report_upsell", false);
                                            boolean booleanExtra4 = intent.getBooleanExtra("should_delete_chat_post_block", false);
                                            boolean booleanExtra5 = intent.getBooleanExtra("should_launch_home_activity_post_block", false);
                                            boolean booleanExtra6 = intent.getBooleanExtra("from_report_flow", false);
                                            AnonymousClass205 A022 = AnonymousClass4aU.A02(getIntent());
                                            Bundle A0D = C17880vN.A0D();
                                            A0D.putString("jid", stringExtra);
                                            A0D.putString("entry_point", str3);
                                            A0D.putBoolean("show_success_toast", booleanExtra2);
                                            A0D.putBoolean("show_report_upsell", booleanExtra3);
                                            A0D.putBoolean("should_delete_chat_post_block", booleanExtra4);
                                            A0D.putBoolean("should_launch_home_activity", booleanExtra5);
                                            A0D.putBoolean("from_report_flow", booleanExtra6);
                                            if (A022 != null) {
                                                AnonymousClass4aU.A0A(A0D, A022);
                                            }
                                            BlockReasonListFragment blockReasonListFragment = new BlockReasonListFragment();
                                            blockReasonListFragment.A1R(A0D);
                                            A0H.A09(blockReasonListFragment, 2131429504);
                                            A0H.A03();
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    str = "infraABProps";
                                }
                            }
                        }
                    }
                    C18070vi.A11("entryPoint");
                    throw null;
                }
                str = "blockFunnelLogger";
                C18070vi.A11(str);
                throw null;
            }
            throw AnonymousClass000.A0k("Required value was null.");
        }
        throw AnonymousClass000.A0k("Required value was null.");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (C72453Mb.A0B(menuItem) == 16908332) {
            AnonymousClass00H r0 = this.A01;
            if (r0 != null) {
                C61552ps r3 = (C61552ps) r0.get();
                String str2 = this.A03;
                if (str2 == null) {
                    str = "entryPoint";
                } else {
                    UserJid userJid = this.A02;
                    if (userJid == null) {
                        str = "userJid";
                    } else {
                        C61552ps.A00(r3, userJid, str2, 2);
                    }
                }
            } else {
                str = "blockFunnelLogger";
            }
            C18070vi.A11(str);
            throw null;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public BlockBusinessActivity(int i) {
        this.A04 = false;
        C90994ey.A00(this, 15);
    }
}
