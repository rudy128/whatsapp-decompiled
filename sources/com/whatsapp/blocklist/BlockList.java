package com.whatsapp.blocklist;

import X.A74;
import X.AGB;
import X.AOO;
import X.AOQ;
import X.AQB;
import X.AR8;
import X.AUH;
import X.AXB;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11E;
import X.AnonymousClass11P;
import X.AnonymousClass12L;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1ED;
import X.AnonymousClass1HF;
import X.AnonymousClass1J8;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QL;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass1VW;
import X.AnonymousClass3MK;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4DZ;
import X.AnonymousClass4aX;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BY;
import X.AnonymousClass8DA;
import X.AnonymousClass9PX;
import X.B7U;
import X.C000200d;
import X.C003401n;
import X.C108945cZ;
import X.C137106uv;
import X.C137116uw;
import X.C175638z2;
import X.C175978za;
import X.C17880vN;
import X.C17890vO;
import X.C17970vW;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C182549Uu;
import X.C184679bL;
import X.C196199uc;
import X.C196259ui;
import X.C20310AFs;
import X.C21445AkC;
import X.C21528Alb;
import X.C22941Dw;
import X.C22971Dz;
import X.C23581Gv;
import X.C24261Jm;
import X.C24671Lf;
import X.C24921Me;
import X.C27201Vd;
import X.C28741ap;
import X.C29591cX;
import X.C29621ca;
import X.C31061ex;
import X.C33971jg;
import X.C36401np;
import X.C37451pZ;
import X.C37551pj;
import X.C39441t5;
import X.C41461wR;
import X.C57732jY;
import X.C61552ps;
import X.C63662tU;
import X.C63932tv;
import X.C72043Kk;
import X.C72073Kn;
import X.C72453Mb;
import X.C72483Me;
import X.C72813Np;
import X.C74803cp;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class BlockList extends C74803cp {
    public C182549Uu A00;
    public C72043Kk A01;
    public AnonymousClass1VW A02;
    public AnonymousClass1M9 A03;
    public C24671Lf A04;
    public C24921Me A05;
    public C27201Vd A06;
    public AnonymousClass12L A07;
    public C196199uc A08;
    public AnonymousClass1QL A09;
    public C31061ex A0A;
    public AnonymousClass1QO A0B;
    public AnonymousClass1QS A0C;
    public C36401np A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public boolean A0N;
    public final C23581Gv A0O;
    public final C28741ap A0P;
    public final AnonymousClass3MK A0Q;
    public final Object A0R;
    public final List A0S;
    public final List A0T;
    public final Set A0U;
    public final C18100vl A0V;
    public final C18100vl A0W;

    public boolean onContextItemSelected(MenuItem menuItem) {
        String str;
        C196199uc r6;
        C18070vi.A0d(menuItem, 0);
        ContextMenu.ContextMenuInfo menuInfo = menuItem.getMenuInfo();
        C18070vi.A0z(menuInfo, "null cannot be cast to non-null type android.widget.AdapterView.AdapterContextMenuInfo");
        Object itemAtPosition = getListView().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuInfo).position);
        C18070vi.A0z(itemAtPosition, "null cannot be cast to non-null type com.whatsapp.blocklist.Blockable");
        B7U b7u = (B7U) itemAtPosition;
        if (menuItem.getItemId() != 0) {
            return super.onContextItemSelected(menuItem);
        }
        int BTX = b7u.BTX();
        if (BTX != 0) {
            if (BTX == 1 && (r6 = this.A08) != null) {
                C31061ex r9 = this.A0A;
                if (r9 != null) {
                    r6.A01(this, new AXB(this, 0), r9, ((AOQ) b7u).A00, false);
                } else {
                    str = "paymentsActionManager";
                }
            }
            return true;
        }
        AnonymousClass1E7 r2 = ((AOO) b7u).A00;
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            AnonymousClass3MW.A0V(r0).A0H(this, r2, "block_list", true);
            AnonymousClass00H r02 = this.A0H;
            if (r02 != null) {
                A74.A01((A74) r02.get(), AnonymousClass1E7.A00(r2), C17880vN.A0l(), (Integer) null, 2);
                return true;
            }
            str = "chatPSALogger";
        } else {
            str = "blockListManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        String str;
        String A0I2;
        String A0R2;
        boolean A17 = C18070vi.A17(contextMenu, view);
        C18070vi.A0d(contextMenuInfo, 2);
        Object itemAtPosition = getListView().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        C18070vi.A0z(itemAtPosition, "null cannot be cast to non-null type com.whatsapp.blocklist.Blockable");
        B7U b7u = (B7U) itemAtPosition;
        int BTX = b7u.BTX();
        if (BTX != 0) {
            if (BTX == A17) {
                A0I2 = ((AOQ) b7u).A00;
            }
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        }
        C24921Me r1 = this.A05;
        if (r1 != null) {
            A0I2 = r1.A0I(((AOO) b7u).A00);
        } else {
            str = "waContactNames";
            C18070vi.A11(str);
            throw null;
        }
        if (b7u instanceof AOO) {
            AnonymousClass1E7 r12 = ((AOO) b7u).A00;
            if (C22971Dz.A0S(r12.A0J)) {
                Object[] objArr = new Object[2];
                objArr[0] = A0I2;
                AnonymousClass00H r0 = this.A0K;
                if (r0 != null) {
                    C22941Dw r02 = UserJid.Companion;
                    UserJid A012 = C22941Dw.A01(r12.A0J);
                    C18070vi.A0z(A012, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                    A0R2 = C17880vN.A0q(this, ((C33971jg) r0.get()).A01((AnonymousClass1ED) A012), objArr, A17, 2131887194);
                    C18070vi.A0b(A0R2);
                    contextMenu.add(0, 0, 0, A0R2);
                    super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
                }
                str = "interopUiCache";
                C18070vi.A11(str);
                throw null;
            }
        }
        A0R2 = C17890vO.A0R(this, A0I2, A17 ? 1 : 0, 0, 2131887193);
        C18070vi.A0b(A0R2);
        contextMenu.add(0, 0, 0, A0R2);
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        menu.add(0, 2131432624, 0, 2131891991).setIcon(2131232178).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public static final void A0y(BlockList blockList) {
        AnonymousClass00H r0 = blockList.A0F;
        if (r0 != null) {
            Set A0B2 = AnonymousClass3MW.A0V(r0).A0B();
            synchronized (blockList.A0R) {
                Set set = blockList.A0U;
                set.clear();
                set.addAll(A0B2);
                C21445AkC.A00(blockList.A05, blockList, 16);
            }
            return;
        }
        C18070vi.A11("blockListManager");
        throw null;
    }

    public static final void A0z(BlockList blockList) {
        String str;
        C18070vi.A0X(AnonymousClass1HF.A06(blockList.A00, 2131428221));
        TextView A0E2 = AnonymousClass3Ma.A0E(blockList.A00, 2131428223);
        TextView A0E3 = AnonymousClass3Ma.A0E(blockList.A00, 2131428220);
        View A062 = AnonymousClass1HF.A06(blockList.A00, 2131428222);
        if (A062 instanceof ViewStub) {
            ViewStub viewStub = (ViewStub) A062;
            int i = 2131624288;
            if (AnonymousClass1J8.A05(blockList.A0E)) {
                i = 2131627594;
            }
            viewStub.setLayoutResource(i);
            A062 = viewStub.inflate();
        }
        C18070vi.A0a(A062);
        AnonymousClass00H r0 = blockList.A0F;
        if (r0 == null) {
            str = "blockListManager";
        } else if (AnonymousClass3MW.A0V(r0).A0N()) {
            A0E3.setVisibility(0);
            A062.setVisibility(0);
            Drawable A002 = C24261Jm.A00(blockList, 2131232174);
            if (A002 != null) {
                A0E2.setText(2131892911);
                String string = blockList.getString(2131887190);
                A0E3.setText(C72813Np.A02(A0E3.getPaint(), AnonymousClass4aX.A08(A002, AnonymousClass3MZ.A02(A0E3.getContext(), blockList, 2130968643, 2131099693)), string, "%s"));
                if (A062 instanceof WaTextView) {
                    AnonymousClass00H r02 = blockList.A0L;
                    if (r02 != null) {
                        TextView textView = (TextView) A062;
                        if (AnonymousClass9PX.A00((C41461wR) C18070vi.A0E(r02), blockList.A0U)) {
                            C36401np r3 = blockList.A0D;
                            if (r3 != null) {
                                textView.setText(r3.A05(blockList, new C21445AkC(blockList, 15), blockList.getString(2131887192), "third-party-settings"));
                                AnonymousClass3Ma.A1I(textView, blockList.A0E);
                                return;
                            }
                            str = "linkifier";
                        } else {
                            textView.setText(2131887191);
                            return;
                        }
                    }
                } else if (A062 instanceof WDSSectionFooter) {
                    AnonymousClass00H r03 = blockList.A0L;
                    if (r03 != null) {
                        WDSSectionFooter wDSSectionFooter = (WDSSectionFooter) A062;
                        if (AnonymousClass9PX.A00((C41461wR) C18070vi.A0E(r03), blockList.A0U)) {
                            wDSSectionFooter.setFooterTextWithLink(C18070vi.A0F(blockList, 2131887192), "third-party-settings", AnonymousClass4DZ.A03, new C39441t5(blockList.A0E), new C21445AkC(blockList, 17));
                            return;
                        } else {
                            wDSSectionFooter.setFooterText(2131887191);
                            return;
                        }
                    }
                } else {
                    return;
                }
                str = "interopUtility";
            } else {
                throw C17880vN.A0g();
            }
        } else {
            A0E3.setVisibility(8);
            int i2 = 2131892439;
            if (AnonymousClass11E.A02(blockList)) {
                i2 = 2131892440;
            }
            A0E2.setText(i2);
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A0N) {
            this.A0N = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r2 = r1.A00;
            C63932tv.A01(r1, r2, this);
            C63662tU.A00(r1, r2, this, r2.A5A);
            C137106uv.A01(this, C000200d.A00(A002.A63));
            this.A0E = C000200d.A00(A002.A0D);
            this.A00 = (C182549Uu) A002.A3R.get();
            this.A0F = C000200d.A00(r1.A0x);
            this.A0G = C000200d.A00(r1.A2A);
            this.A0H = C000200d.A00(r1.A2D);
            this.A02 = AnonymousClass3MZ.A0e(r1);
            this.A03 = AnonymousClass10E.A4z(r1);
            this.A04 = AnonymousClass3Ma.A0S(r1);
            this.A06 = AnonymousClass3MZ.A0i(r1);
            this.A0I = C000200d.A00(r1.A4u);
            this.A07 = AnonymousClass3MZ.A0u(r1);
            this.A0J = C000200d.A00(r1.A5T);
            this.A0K = C000200d.A00(r1.A5V);
            this.A0L = C000200d.A00(r2.A2r);
            this.A0D = AnonymousClass3MY.A0e(r2);
            this.A09 = AnonymousClass8BT.A0R(r1);
            this.A0A = AnonymousClass8BU.A0R(r1);
            this.A0B = AnonymousClass3Ma.A0q(r1);
            this.A0C = AnonymousClass3MZ.A0z(r1);
            this.A01 = AnonymousClass3MZ.A0T(r2);
            this.A05 = AnonymousClass3MZ.A0g(r1);
            this.A0M = AnonymousClass3MW.A0s(r1);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        Intent intent2 = intent;
        int i3 = i2;
        if (i == 10) {
            if (i3 == -1) {
                C22941Dw r0 = UserJid.Companion;
                if (intent != null) {
                    str2 = intent2.getStringExtra("contact");
                } else {
                    str2 = null;
                }
                UserJid A032 = C22941Dw.A03(str2);
                AnonymousClass1M9 r02 = this.A03;
                if (r02 != null) {
                    AnonymousClass1E7 A0H2 = r02.A0H(A032);
                    if (A0H2.A0C()) {
                        AnonymousClass00H r03 = this.A0M;
                        if (r03 != null) {
                            r03.get();
                            Context applicationContext = getApplicationContext();
                            AnonymousClass1BI r5 = A0H2.A0J;
                            C18070vi.A0z(r5, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                            C18030ve r2 = this.A0E;
                            C18070vi.A0W(r2);
                            startActivity(AnonymousClass1LU.A1E(applicationContext, (UserJid) r5, "biz_block_list", true, C18020vd.A05(C18040vf.A02, r2, 6185), false, false));
                            return;
                        }
                        str = "waIntents";
                    } else {
                        AnonymousClass00H r04 = this.A0E;
                        if (r04 != null) {
                            boolean A16 = C18070vi.A16("block_list", A032);
                            C61552ps.A00((C61552ps) r04.get(), A032, "block_list", A16 ? 1 : 0);
                            AnonymousClass00H r05 = this.A0F;
                            if (r05 != null) {
                                C37551pj.A04(this, (C72073Kn) null, AnonymousClass3MW.A0V(r05), A0H2, (Integer) null, (Integer) null, (String) null, (String) null, "block_list", A16, A16);
                                return;
                            }
                            str = "blockListManager";
                        }
                    }
                } else {
                    str = "contactManager";
                }
                C18070vi.A11(str);
                throw null;
            }
            AnonymousClass00H r06 = this.A0E;
            if (r06 != null) {
                C61552ps.A00((C61552ps) r06.get(), (UserJid) null, "block_list", 2);
                return;
            }
            str = "blockFunnelLogger";
            C18070vi.A11(str);
            throw null;
        }
        super.onActivityResult(i, i3, intent2);
    }

    public void onCreate(Bundle bundle) {
        String str;
        boolean z;
        C196199uc r8;
        super.onCreate(bundle);
        setTitle(2131887189);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            setContentView(2131624287);
            AnonymousClass1QO r0 = this.A0B;
            if (r0 != null) {
                if (r0.A03()) {
                    AnonymousClass1QL r02 = this.A09;
                    if (r02 == null) {
                        str = "paymentAccountSetup";
                    } else if (r02.A0F()) {
                        AnonymousClass1QS r03 = this.A0C;
                        if (r03 != null) {
                            C196199uc BPW = r03.A06().BPW();
                            this.A08 = BPW;
                            if (BPW != null) {
                                synchronized (BPW) {
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    A10.append("PAY: IndiaUpiBlockListManager shouldFetch lastFetched: ");
                                    C17890vO.A16(A10, BPW.A00);
                                    if (BPW.A05.A0D().A00() || (BPW.A00 != -1 && AnonymousClass11P.A01(BPW.A02) - BPW.A00 < 86400000)) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                }
                                if (z && (r8 = this.A08) != null) {
                                    C31061ex r7 = this.A0A;
                                    if (r7 != null) {
                                        AXB axb = new AXB(this, 1);
                                        Context context = r8.A03.A00;
                                        AnonymousClass1KB r4 = r8.A01;
                                        AnonymousClass1KB r17 = r4;
                                        Context context2 = context;
                                        C175638z2 r15 = new C175638z2(context2, r17, C17880vN.A0U(r8.A07), r8, r8.A04, AnonymousClass8BR.A0a(r8.A08), r7);
                                        C184679bL r9 = new C184679bL(r8, axb);
                                        Log.i("PAY: getBlockedVpas called");
                                        ArrayList A102 = C17880vN.A10(r15.A03.A00());
                                        for (int i = 0; i < A102.size(); i++) {
                                            A102.set(i, C17970vW.A05(AnonymousClass8BS.A0n(C108945cZ.A1H(A102, i))));
                                        }
                                        Collections.sort(A102);
                                        StringBuilder A103 = AnonymousClass000.A10();
                                        Iterator it = A102.iterator();
                                        while (it.hasNext()) {
                                            A103.append(C17880vN.A0v(it));
                                        }
                                        String A052 = C17970vW.A05(A103.toString());
                                        C196259ui r82 = r15.A00;
                                        if (r82 != null) {
                                            r82.A02("upi-get-blocked-vpas");
                                        }
                                        AnonymousClass1OZ r72 = r15.A02;
                                        String A0B2 = r72.A0B();
                                        List A0N2 = C18070vi.A0N("1", "2", C17880vN.A1Z(), 0, 1);
                                        C29591cX A0O2 = AnonymousClass8BY.A0O();
                                        AnonymousClass8BY.A16(A0O2, "w:pay");
                                        AnonymousClass8BY.A18(A0O2, A0B2, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                                        C29591cX A0R2 = AnonymousClass8BS.A0R();
                                        C29591cX.A01(A0R2, "action", "upi-get-blocked-vpas");
                                        if (A052 != null && AnonymousClass8BV.A1Y(A052, 0, true)) {
                                            C29591cX.A01(A0R2, "hash", A052);
                                        }
                                        A0R2.A08("2", "version", A0N2);
                                        C29621ca A002 = C29591cX.A00(A0R2, A0O2);
                                        Context context3 = r15.A00;
                                        C175638z2 r172 = r15;
                                        r72.A0I(new C175978za(context3, r15.A01, r9, r15.A04, r82, r172), A002, A0B2, 204, 0);
                                    } else {
                                        str = "paymentsActionManager";
                                    }
                                }
                            }
                        } else {
                            str = "paymentsManager";
                        }
                    }
                }
                A0z(this);
                A4b((AnonymousClass8DA) this.A0V.getValue());
                getListView().setEmptyView(findViewById(2131428218));
                getListView().setDivider((Drawable) null);
                getListView().setClipToPadding(false);
                registerForContextMenu(getListView());
                getListView().setOnItemClickListener(new C20310AFs(this, 0));
                C24671Lf r1 = this.A04;
                if (r1 != null) {
                    r1.registerObserver(this.A0O);
                    AnonymousClass00H r04 = this.A0G;
                    if (r04 != null) {
                        C17880vN.A0V(r04).registerObserver(this.A0P);
                        AnonymousClass00H r05 = this.A0I;
                        if (r05 != null) {
                            C17880vN.A0V(r05).registerObserver(this.A0Q);
                            AnonymousClass00H r06 = this.A0F;
                            if (r06 != null) {
                                AnonymousClass3MW.A0V(r06).A0L((C57732jY) null);
                                C21445AkC.A01(this.A05, this, 21);
                                return;
                            }
                            str = "blockListManager";
                        } else {
                            str = "groupParticipantsObservers";
                        }
                    } else {
                        str = "chatObservers";
                    }
                } else {
                    str = "contactObservers";
                }
            } else {
                str = "paymentsGatingManager";
            }
            C18070vi.A11(str);
            throw null;
        }
        throw C17880vN.A0g();
    }

    public BlockList(int i) {
        this.A0N = false;
        AGB.A00(this, 24);
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        ((C37451pZ) AnonymousClass3MX.A14(this.A0W)).A02();
        C24671Lf r1 = this.A04;
        if (r1 != null) {
            r1.unregisterObserver(this.A0O);
            AnonymousClass00H r0 = this.A0G;
            if (r0 != null) {
                C17880vN.A0V(r0).unregisterObserver(this.A0P);
                AnonymousClass00H r02 = this.A0I;
                if (r02 != null) {
                    C17880vN.A0V(r02).unregisterObserver(this.A0Q);
                    return;
                }
                str = "groupParticipantsObservers";
            } else {
                str = "chatObservers";
            }
        } else {
            str = "contactObservers";
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (C72453Mb.A0B(menuItem) == 2131432624) {
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = this.A0T.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI A0l = C72453Mb.A0l(it);
                if (A0l != null) {
                    A13.add(A0l.getRawString());
                } else {
                    throw C17880vN.A0g();
                }
            }
            AnonymousClass00H r0 = this.A0E;
            if (r0 != null) {
                C61552ps.A00((C61552ps) r0.get(), (UserJid) null, "block_list", 0);
                AnonymousClass00H r02 = this.A0M;
                if (r02 != null) {
                    r02.get();
                    Intent A0B2 = C72483Me.A0B(this, "com.whatsapp.contact.picker.ContactPicker", 1);
                    A0B2.putExtra("block_contact", true);
                    A0B2.putExtra("blocked_list", A13);
                    startActivityForResult(A0B2, 10);
                    return true;
                }
                str = "waIntents";
            } else {
                str = "blockFunnelLogger";
            }
            C18070vi.A11(str);
            throw null;
        }
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return true;
    }

    public BlockList() {
        this(0);
        this.A0W = C21528Alb.A00(this, 10);
        this.A0V = C21528Alb.A00(this, 11);
        this.A0R = C17880vN.A0p();
        this.A0T = AnonymousClass000.A13();
        this.A0S = AnonymousClass000.A13();
        this.A0U = C17880vN.A14();
        this.A0O = new AQB(this, 0);
        this.A0P = new AR8(this, 0);
        this.A0Q = new AUH(this);
    }
}
