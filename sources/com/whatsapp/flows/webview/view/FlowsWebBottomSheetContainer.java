package com.whatsapp.flows.webview.view;

import X.A0M;
import X.A25;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass01E;
import X.AnonymousClass02n;
import X.AnonymousClass10I;
import X.AnonymousClass11E;
import X.AnonymousClass122;
import X.AnonymousClass129;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass1OR;
import X.AnonymousClass1PM;
import X.AnonymousClass1RK;
import X.AnonymousClass1YF;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass6ZI;
import X.AnonymousClass75B;
import X.AnonymousClass75G;
import X.AnonymousClass7AT;
import X.AnonymousClass890;
import X.C003401n;
import X.C108955ca;
import X.C108985cd;
import X.C110745gz;
import X.C1423479c;
import X.C145937Ne;
import X.C150627kz;
import X.C158077zh;
import X.C158087zi;
import X.C158097zj;
import X.C158107zk;
import X.C158117zl;
import X.C172058si;
import X.C17890vO;
import X.C17900vP;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C19740yt;
import X.C20081A6h;
import X.C22941Dw;
import X.C30391dr;
import X.C30451dy;
import X.C34001jj;
import X.C37581pm;
import X.C72453Mb;
import X.C72463Mc;
import X.C89944dH;
import X.C98494rF;
import X.EEF;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView;
import com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wabloks.ui.PercentageBasedMaxHeightLinearLayout;
import com.whatsapp.wds.components.topbar.WDSToolbar;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class FlowsWebBottomSheetContainer extends Hilt_FlowsWebBottomSheetContainer implements AnonymousClass890 {
    public LinearLayout A00;
    public RelativeLayout A01;
    public Toolbar A02;
    public AnonymousClass1L9 A03;
    public AnonymousClass11E A04;
    public AnonymousClass1PM A05;
    public C18000vb A06;
    public AnonymousClass122 A07;
    public AnonymousClass1RK A08;
    public C18030ve A09;
    public FlowsInitialLoadingView A0A;
    public WaFlowsViewModel A0B;
    public UserJid A0C;
    public AnonymousClass129 A0D;
    public AnonymousClass10I A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public String A0P;
    public EEF A0Q;
    public boolean A0R = true;
    public boolean A0S;
    public final AnonymousClass02n A0T = CDw(new C1423479c(this, 3), new Object());

    public static final Long A00(String str, SimpleDateFormat simpleDateFormat) {
        if (!(str == null || str.length() == 0)) {
            try {
                Date parse = simpleDateFormat.parse(str);
                if (parse != null) {
                    return Long.valueOf(parse.getTime());
                }
            } catch (Exception unused) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("FlowsLogger/convertDateToTimestamp Date string does not match format ");
                C17890vO.A19(A10, simpleDateFormat.toPattern());
            }
        }
        return null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        String str2;
        Bundle extras;
        String string;
        FlowsInitialLoadingView flowsInitialLoadingView;
        Toolbar toolbar;
        C18070vi.A0d(layoutInflater, 0);
        View A0B2 = AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625336, false);
        A26().setOnKeyListener(new AnonymousClass75B(this, 1));
        this.A01 = (RelativeLayout) AnonymousClass1HF.A06(A0B2, 2131436275);
        this.A02 = (Toolbar) AnonymousClass1HF.A06(A0B2, 2131430922);
        AnonymousClass1FL A1B = A1B();
        C18070vi.A0z(A1B, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C003401n A0K2 = AnonymousClass3MY.A0K((AnonymousClass01E) A1B, this.A02);
        if (A0K2 != null) {
            A0K2.A0Y(false);
        }
        Toolbar toolbar2 = this.A02;
        if (toolbar2 != null) {
            C18000vb r2 = this.A06;
            if (r2 != null) {
                AnonymousClass3NL.A02(A14(), toolbar2, r2, 2131233243);
            } else {
                str = "whatsAppLocale";
                C18070vi.A11(str);
                throw null;
            }
        }
        Resources A092 = AnonymousClass3MZ.A09(this);
        if (!(A092 == null || (toolbar = this.A02) == null)) {
            C72463Mc.A0x(A14(), A092, toolbar, 2130971792, 2131102910);
        }
        Toolbar toolbar3 = this.A02;
        if (toolbar3 != null) {
            toolbar3.setNavigationOnClickListener(new C89944dH(this, 16));
        }
        Toolbar toolbar4 = this.A02;
        if ((toolbar4 instanceof WDSToolbar) && toolbar4 != null) {
            C72463Mc.A0v(A1n(), A14(), toolbar4, 2130971986, 2131103168);
        }
        this.A00 = (LinearLayout) AnonymousClass1HF.A06(A0B2, 2131430926);
        this.A0A = (FlowsInitialLoadingView) AnonymousClass1HF.A06(A0B2, 2131430925);
        C18030ve r1 = this.A09;
        if (r1 != null) {
            C18040vf r5 = C18040vf.A02;
            if (!C18020vd.A05(r5, r1, 7760) && (flowsInitialLoadingView = this.A0A) != null) {
                View view = flowsInitialLoadingView.A00;
                if (view == null) {
                    str = "loadingView";
                    C18070vi.A11(str);
                    throw null;
                }
                ((CircularProgressBar) view).A0C = C19740yt.A00(flowsInitialLoadingView.getContext(), 2131101961);
            }
            C72453Mb.A1C(this.A02);
            Toolbar toolbar5 = this.A02;
            if (toolbar5 != null) {
                toolbar5.setNavigationOnClickListener(new C89944dH(this, 15));
            }
            Bundle bundle2 = this.A06;
            if (bundle2 != null) {
                bundle2.getString("jest_component_test_url");
            }
            C98494rF A002 = C98494rF.A00();
            Bundle bundle3 = this.A06;
            if (bundle3 != null) {
                A002.element = C22941Dw.A02(bundle3.getString("chat_id"));
                str2 = bundle3.getString("flow_id");
            } else {
                str2 = null;
            }
            if (A002.element == null || str2 == null) {
                A02(this, A1H(2131890453), (String) null);
            } else {
                WaFlowsViewModel waFlowsViewModel = this.A0B;
                if (waFlowsViewModel == null) {
                    C18070vi.A11("waFlowsViewModel");
                    throw null;
                }
                AnonymousClass7AT.A01(A1G(), waFlowsViewModel.A08, new C158077zh(this), 29);
                Intent A0B3 = C108955ca.A0B(this);
                if (!(A0B3 == null || (extras = A0B3.getExtras()) == null)) {
                    C18030ve r12 = this.A09;
                    if (r12 != null) {
                        if (C18020vd.A05(r5, r12, 8418) && (string = extras.getString("flow_id")) != null) {
                            ((C20081A6h) A2K().get()).A0B(Integer.valueOf(string.hashCode()), "webview_metadata_prepare_start");
                        }
                        C37581pm A0H2 = AnonymousClass3MZ.A0H(this);
                        this.A0Q = C30451dy.A01(AnonymousClass00R.A00, AnonymousClass1OR.A00, new FlowsWebBottomSheetContainer$initialiseMetadataForWebView$3$2(extras, this, (C30391dr) null, A002), A0H2);
                    } else {
                        AnonymousClass3MW.A1A();
                        throw null;
                    }
                }
                Bundle bundle4 = this.A06;
                if (bundle4 != null) {
                    boolean z = bundle4.getBoolean("is_response_flow", false);
                    C18030ve r13 = this.A09;
                    if (r13 != null) {
                        if (C18020vd.A05(r5, r13, 8418)) {
                            ((C20081A6h) A2K().get()).A0B(Integer.valueOf(str2.hashCode()), "webview_fragment_create_start");
                        }
                        C18030ve r14 = this.A09;
                        if (r14 != null) {
                            boolean A052 = C18020vd.A05(r5, r14, 8552);
                            C18030ve r15 = this.A09;
                            if (r15 != null) {
                                int i = 6060;
                                if (A052) {
                                    i = 7153;
                                }
                                String A012 = C18020vd.A01(r5, r15, i);
                                C18070vi.A0b(A012);
                                C18030ve r16 = this.A09;
                                if (r16 != null) {
                                    if (!C18020vd.A05(r5, r16, 8552) && !z) {
                                        A012 = C17890vO.A0Z(str2, AnonymousClass000.A11(A012), '/');
                                    }
                                    C18070vi.A0d(A012, 0);
                                    FlowsWebViewFragment flowsWebViewFragment = new FlowsWebViewFragment();
                                    C108985cd.A15(flowsWebViewFragment, "url", A012);
                                    C34001jj A0Y = C72453Mb.A0Y(this);
                                    LinearLayout linearLayout = this.A00;
                                    if (linearLayout != null) {
                                        A0Y.A0D(flowsWebViewFragment, "WEB_FRAGMENT", Integer.valueOf(linearLayout.getId()).intValue());
                                    }
                                    A0Y.A01();
                                } else {
                                    AnonymousClass3MW.A1A();
                                    throw null;
                                }
                            } else {
                                AnonymousClass3MW.A1A();
                                throw null;
                            }
                        } else {
                            AnonymousClass3MW.A1A();
                            throw null;
                        }
                    } else {
                        AnonymousClass3MW.A1A();
                        throw null;
                    }
                }
            }
            Window window = A26().getWindow();
            if (window != null) {
                window.setSoftInputMode(16);
            }
            return A0B2;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        if (!(this.A0C == null || this.A0P == null)) {
            AnonymousClass3MX.A1Q(new FlowsWebBottomSheetContainer$onViewCreated$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
        }
        WaFlowsViewModel waFlowsViewModel = this.A0B;
        if (waFlowsViewModel == null) {
            C18070vi.A11("waFlowsViewModel");
            throw null;
        }
        AnonymousClass7AT.A01(this, waFlowsViewModel.A07, new C158087zi(this), 29);
        WaFlowsViewModel waFlowsViewModel2 = this.A0B;
        if (waFlowsViewModel2 == null) {
            C18070vi.A11("waFlowsViewModel");
            throw null;
        }
        AnonymousClass7AT.A01(this, waFlowsViewModel2.A06, new C158097zj(this), 29);
        WaFlowsViewModel waFlowsViewModel3 = this.A0B;
        if (waFlowsViewModel3 == null) {
            C18070vi.A11("waFlowsViewModel");
            throw null;
        }
        AnonymousClass7AT.A01(this, waFlowsViewModel3.A01, new C158107zk(this), 29);
        WaFlowsViewModel waFlowsViewModel4 = this.A0B;
        if (waFlowsViewModel4 == null) {
            C18070vi.A11("waFlowsViewModel");
            throw null;
        } else {
            AnonymousClass7AT.A01(this, waFlowsViewModel4.A02, new C158117zl(this), 29);
        }
    }

    public void A22(Menu menu, MenuInflater menuInflater) {
        boolean A17 = C18070vi.A17(menu, menuInflater);
        Bundle bundle = this.A06;
        if (bundle == null || !bundle.getBoolean("is_response_flow", false)) {
            int i = 2131899101;
            if (this.A0S) {
                i = 2131899401;
            }
            C108955ca.A1G(menu, 0, A17 ? 1 : 0, i);
            menu.add(0, 2, 0, A1H(2131895214)).setShowAsAction(0);
        }
    }

    public boolean A24(MenuItem menuItem) {
        int A012 = AnonymousClass3MY.A01(menuItem, 0);
        if (A012 != 1) {
            if (A012 == 2) {
                A01();
            }
            return false;
        }
        A03("extensions_help");
        return false;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        C20081A6h a6h = (C20081A6h) A2K().get();
        if (a6h != null) {
            a6h.A04.CGw();
        }
        super.onDismiss(dialogInterface);
        C108955ca.A1M(this);
    }

    private final void A01() {
        UserJid A042;
        Bundle bundle = this.A06;
        if (bundle != null && (A042 = UserJid.Companion.A04(bundle.getString("chat_id"))) != null) {
            AnonymousClass1RK r0 = this.A08;
            if (r0 != null) {
                r0.A04().A09(new C145937Ne(A042, this, 4));
            } else {
                C18070vi.A11("companionDeviceManager");
                throw null;
            }
        }
    }

    public static final void A02(FlowsWebBottomSheetContainer flowsWebBottomSheetContainer, String str, String str2) {
        String str3;
        String str4;
        String string;
        AnonymousClass11E r0 = flowsWebBottomSheetContainer.A04;
        if (r0 != null) {
            if (!r0.A09()) {
                str = flowsWebBottomSheetContainer.A1H(2131890447);
                str4 = "no_network_error";
            } else {
                str4 = str2;
            }
            Bundle bundle = flowsWebBottomSheetContainer.A06;
            if (!(bundle == null || (string = bundle.getString("flow_id")) == null)) {
                if (str4 != null) {
                    ((C172058si) flowsWebBottomSheetContainer.A2K().get()).A0E(string.hashCode(), str4, (String) null);
                }
                ((C172058si) flowsWebBottomSheetContainer.A2K().get()).A0F(string.hashCode(), 3);
            }
            if (str2 != null) {
                AnonymousClass00H r02 = flowsWebBottomSheetContainer.A0J;
                if (r02 != null) {
                    A25 a25 = (A25) r02.get();
                    AnonymousClass1FL A1B = flowsWebBottomSheetContainer.A1B();
                    AnonymousClass1PM r1 = flowsWebBottomSheetContainer.A05;
                    if (r1 != null) {
                        AnonymousClass00H r03 = flowsWebBottomSheetContainer.A0O;
                        if (r03 != null) {
                            a25.A01(A1B, r1, (A0M) C18070vi.A0E(r03), str2);
                        } else {
                            str3 = "wamFlowsStructuredMessageInteractionReporter";
                        }
                    } else {
                        str3 = "verifiedNameManager";
                    }
                } else {
                    str3 = "flowsDataUtil";
                }
            }
            FlowsInitialLoadingView flowsInitialLoadingView = flowsWebBottomSheetContainer.A0A;
            if (flowsInitialLoadingView != null) {
                if (str == null) {
                    str = AnonymousClass3MY.A0n(flowsWebBottomSheetContainer, 2131890448);
                }
                flowsInitialLoadingView.setErrorMessage(str);
            }
            FlowsInitialLoadingView flowsInitialLoadingView2 = flowsWebBottomSheetContainer.A0A;
            if (flowsInitialLoadingView2 != null) {
                flowsInitialLoadingView2.setVisibility(0);
            }
            RelativeLayout relativeLayout = flowsWebBottomSheetContainer.A01;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            C72453Mb.A1D(flowsWebBottomSheetContainer.A00);
            return;
        }
        str3 = "connectivityStateProvider";
        C18070vi.A11(str3);
        throw null;
    }

    private final void A03(String str) {
        String str2;
        if (this.A0S) {
            AnonymousClass00H r0 = this.A0I;
            if (r0 != null) {
                AnonymousClass3MW.A0a(r0).A01(A1D(), str);
                return;
            }
            str2 = "contextualHelpHandler";
        } else {
            String str3 = this.A0P;
            if (str3 != null) {
                AnonymousClass1L9 r3 = this.A03;
                if (r3 != null) {
                    Context A14 = A14();
                    AnonymousClass129 r02 = this.A0D;
                    if (r02 != null) {
                        r3.CGU(A14, r02.A03(str3), (AnonymousClass206) null);
                        return;
                    }
                    str2 = "faqLinkFactory";
                } else {
                    str2 = "activityUtils";
                }
            } else {
                return;
            }
        }
        C18070vi.A11(str2);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.B5z] */
    public void A1r() {
        String string;
        Bundle bundle = this.A06;
        if (!(bundle == null || (string = bundle.getString("observer_id")) == null)) {
            AnonymousClass00H r0 = this.A0M;
            if (r0 != null) {
                C108985cd.A0c(r0, string).A02(new Object());
            } else {
                C18070vi.A11("uiObserversFactory");
                throw null;
            }
        }
        super.A1r();
    }

    public void A1v() {
        C18030ve r2 = this.A09;
        if (r2 != null) {
            ((PercentageBasedMaxHeightLinearLayout) AnonymousClass1HF.A06(A17(), 2131430921)).A00 = C18020vd.A00(C18040vf.A02, r2, 3319);
            super.A1v();
            return;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public final AnonymousClass00H A2K() {
        AnonymousClass00H r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("flowsScreenNavigationLogger");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r1v24, types: [com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment, com.whatsapp.biz.product.view.fragment.Hilt_ReportProductDialogFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: type inference failed for: r1v113, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x026c, code lost:
        if (r3 != null) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0281, code lost:
        if (r3 != null) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0327, code lost:
        r0.A02((X.C1406772n) null, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x032a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03e1, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03e4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0452, code lost:
        A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0455, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x018c, code lost:
        if (r8 == null) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CAU(android.webkit.WebMessagePort r19, org.json.JSONObject r20) {
        /*
            r18 = this;
            java.lang.String r0 = "method"
            r2 = r20
            java.lang.String r3 = r2.optString(r0)
            java.lang.String r5 = "data"
            org.json.JSONObject r9 = r2.optJSONObject(r5)
            r13 = 0
            r0 = r18
            if (r3 == 0) goto L_0x001a
            int r1 = r3.hashCode()
            switch(r1) {
                case -1245310213: goto L_0x0456;
                case -1169841072: goto L_0x0448;
                case -697353750: goto L_0x0413;
                case -111710694: goto L_0x0407;
                case -17437989: goto L_0x03fc;
                case 434552709: goto L_0x03b5;
                case 1004141592: goto L_0x0337;
                case 1259564602: goto L_0x012b;
                case 1445449695: goto L_0x00d7;
                case 1458208596: goto L_0x00bb;
                case 1887645349: goto L_0x003e;
                case 1911526633: goto L_0x0029;
                default: goto L_0x001a;
            }
        L_0x001a:
            X.1pm r3 = X.AnonymousClass3MZ.A0H(r0)
            com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1 r1 = new com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer$onWebBridgeAPICallback$1
            r4 = r19
            r1.<init>(r4, r0, r13, r2)
            X.AnonymousClass3MX.A1Q(r1, r3)
        L_0x0028:
            return
        L_0x0029:
            java.lang.String r1 = "WAExtensionsSetDraggable"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            if (r9 == 0) goto L_0x003c
            java.lang.String r1 = "is_draggable"
            boolean r1 = r9.optBoolean(r1)
        L_0x0039:
            r0.A0R = r1
            return
        L_0x003c:
            r1 = 1
            goto L_0x0039
        L_0x003e:
            java.lang.String r1 = "WAFlowsMediaSelect"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            if (r9 == 0) goto L_0x00b9
            java.lang.String r1 = "inputType"
            java.lang.String r1 = r9.optString(r1)
        L_0x004e:
            java.lang.String r2 = "document"
            boolean r1 = X.C18070vi.A18(r1, r2)
            X.0ve r4 = r0.A09
            if (r4 == 0) goto L_0x046c
            r3 = 6826(0x1aaa, float:9.565E-42)
            if (r1 == 0) goto L_0x005e
            r3 = 8259(0x2043, float:1.1573E-41)
        L_0x005e:
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r3)
            if (r1 == 0) goto L_0x0028
            com.whatsapp.jid.UserJid r7 = r0.A0C
            if (r7 == 0) goto L_0x0028
            X.00H r1 = r0.A0K
            if (r1 == 0) goto L_0x0466
            java.lang.Object r6 = r1.get()
            X.6yg r6 = (X.C139346yg) r6
            X.1FL r5 = r0.A1B()
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.WaBaseActivity"
            X.C18070vi.A0z(r5, r1)
            X.1FY r5 = (X.AnonymousClass1FY) r5
            X.7zf r8 = new X.7zf
            r8.<init>(r0)
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            java.lang.String r1 = "gallery"
            if (r9 == 0) goto L_0x0095
            java.lang.String r0 = "inputType"
            java.lang.String r0 = r9.optString(r0, r1)
            if (r0 == 0) goto L_0x0095
            r1 = r0
        L_0x0095:
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0462
            X.17x r1 = r6.A01
            r0 = 30
            android.content.Intent r3 = X.AnonymousClass74O.A04(r5, r1, r0)
            if (r3 == 0) goto L_0x0462
            X.01M r2 = r5.A04
            X.02i r1 = new X.02i
            r1.<init>()
            X.79e r4 = new X.79e
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r0 = "flowsMediaPickerResultKey"
            X.05q r0 = r2.A04(r4, r1, r0)
            goto L_0x0327
        L_0x00b9:
            r1 = 0
            goto L_0x004e
        L_0x00bb:
            java.lang.String r1 = "WAFlowsMediaDelete"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            if (r9 == 0) goto L_0x0028
            java.lang.String r1 = "mediaId"
            java.lang.String r1 = r9.optString(r1)
            if (r1 == 0) goto L_0x0028
            com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel r0 = r0.A0B
            if (r0 != 0) goto L_0x0470
            java.lang.String r0 = "waFlowsViewModel"
            X.C18070vi.A11(r0)
            throw r13
        L_0x00d7:
            java.lang.String r1 = "WAFlowsMediaRetry"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            if (r9 == 0) goto L_0x00f7
            java.lang.String r1 = "mediaId"
            java.lang.String r3 = r9.optString(r1)
            java.lang.String r1 = "collectionId"
            java.lang.String r7 = r9.optString(r1)
        L_0x00ed:
            com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel r1 = r0.A0B
            if (r1 != 0) goto L_0x00fa
            java.lang.String r0 = "waFlowsViewModel"
            X.C18070vi.A11(r0)
            throw r13
        L_0x00f7:
            r3 = r13
            r7 = r13
            goto L_0x00ed
        L_0x00fa:
            java.util.HashMap r2 = r1.A0R
            boolean r1 = r2.containsKey(r3)
            if (r1 == 0) goto L_0x0129
            java.lang.Object r5 = r2.get(r3)
            X.6tg r5 = (X.C136356tg) r5
        L_0x0108:
            if (r9 == 0) goto L_0x0112
            java.lang.String r1 = "inputType"
            java.lang.String r9 = r9.optString(r1)
            if (r9 != 0) goto L_0x0114
        L_0x0112:
            java.lang.String r9 = "gallery"
        L_0x0114:
            if (r3 == 0) goto L_0x0028
            if (r7 == 0) goto L_0x0028
            if (r5 == 0) goto L_0x0028
            X.10I r1 = r0.A0E
            if (r1 == 0) goto L_0x0476
            X.7Q0 r4 = new X.7Q0
            r6 = r0
            r8 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r1.CGF(r4)
            return
        L_0x0129:
            r5 = 0
            goto L_0x0108
        L_0x012b:
            java.lang.String r1 = "WAFlowsShowNativeInputDialogComponent"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            org.json.JSONObject r3 = r2.optJSONObject(r5)
            if (r3 == 0) goto L_0x02fc
            java.lang.String r1 = "input_type"
            java.lang.String r3 = r3.optString(r1)
        L_0x013f:
            java.lang.String r1 = "DatePicker"
            boolean r1 = X.C18070vi.A18(r3, r1)
            if (r1 == 0) goto L_0x02ff
            org.json.JSONObject r1 = r2.optJSONObject(r5)
            if (r1 == 0) goto L_0x0224
            java.lang.String r4 = "params"
            org.json.JSONObject r3 = r1.optJSONObject(r4)
            if (r3 == 0) goto L_0x0224
            java.lang.String r1 = "use_formatted_date"
            boolean r1 = r3.optBoolean(r1)
            if (r1 == 0) goto L_0x0224
            org.json.JSONObject r3 = r2.optJSONObject(r5)
            r12 = 0
            if (r3 == 0) goto L_0x0220
            org.json.JSONObject r2 = r3.optJSONObject(r4)
            java.lang.String r1 = "input_name"
            java.lang.String r6 = r3.optString(r1)
        L_0x016e:
            java.lang.String r7 = ""
            if (r6 != 0) goto L_0x0173
            r6 = r7
        L_0x0173:
            if (r3 == 0) goto L_0x017e
            java.lang.String r1 = "input_type"
            java.lang.String r1 = r3.optString(r1)
            if (r1 == 0) goto L_0x017e
            r7 = r1
        L_0x017e:
            if (r2 == 0) goto L_0x021d
            java.lang.String r1 = "date_picker_mode"
            int r9 = r2.optInt(r1)
            java.lang.String r1 = "date_format"
            java.lang.String r8 = r2.optString(r1)
            if (r8 != 0) goto L_0x0209
        L_0x018e:
            java.lang.String r1 = "FlowsLogger/getStrDatePickerInputParams/bind date format is not set, therefore use yyyy-MM-dd by default"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            java.lang.String r8 = "yyyy-MM-dd"
            if (r2 != 0) goto L_0x0209
            r10 = r13
            r11 = r13
        L_0x0199:
            X.6th r5 = new X.6th
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            java.lang.String r1 = r5.A01
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            r3.<init>(r1)
            java.lang.String r2 = r5.A02
            if (r2 == 0) goto L_0x01bc
            int r1 = r2.length()
            if (r1 == 0) goto L_0x01bc
            java.util.Date r1 = r3.parse(r2)
            if (r1 == 0) goto L_0x01bc
            r4.setTime(r1)
        L_0x01bc:
            X.74m r11 = new X.74m
            r11.<init>(r5, r0, r3)
            int r2 = r5.A00
            r1 = 2
            r14 = 2132083323(0x7f15027b, float:1.9806785E38)
            if (r2 != r1) goto L_0x01cc
            r14 = 2132083322(0x7f15027a, float:1.9806783E38)
        L_0x01cc:
            android.content.Context r12 = r0.A14()
            r0 = 1
            int r15 = r4.get(r0)
            int r16 = r4.get(r1)
            r0 = 5
            int r17 = r4.get(r0)
            X.8Dv r10 = new X.8Dv
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = r5.A05
            java.lang.Long r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x01f4
            long r1 = r0.longValue()
            android.widget.DatePicker r0 = r10.A01
            r0.setMaxDate(r1)
        L_0x01f4:
            java.lang.String r0 = r5.A06
            java.lang.Long r0 = A00(r0, r3)
            if (r0 == 0) goto L_0x0205
            long r1 = r0.longValue()
            android.widget.DatePicker r0 = r10.A01
            r0.setMinDate(r1)
        L_0x0205:
            r10.show()
            return
        L_0x0209:
            java.lang.String r1 = "initial_date_in_str"
            java.lang.String r10 = r2.optString(r1)
            java.lang.String r1 = "max_date_in_str"
            java.lang.String r11 = r2.optString(r1)
            java.lang.String r1 = "min_date_in_str"
            java.lang.String r12 = r2.optString(r1)
            goto L_0x0199
        L_0x021d:
            r9 = 1
            goto L_0x018e
        L_0x0220:
            r2 = r13
            r6 = r13
            goto L_0x016e
        L_0x0224:
            org.json.JSONObject r2 = r2.optJSONObject(r5)
            r6 = 0
            if (r2 == 0) goto L_0x0256
            java.lang.String r1 = "params"
            org.json.JSONObject r3 = r2.optJSONObject(r1)
            java.lang.String r1 = "input_name"
            java.lang.String r7 = r2.optString(r1)
        L_0x0237:
            java.lang.String r8 = ""
            if (r7 != 0) goto L_0x023c
            r7 = r8
        L_0x023c:
            if (r2 == 0) goto L_0x0247
            java.lang.String r1 = "input_type"
            java.lang.String r1 = r2.optString(r1)
            if (r1 == 0) goto L_0x0247
            r8 = r1
        L_0x0247:
            if (r3 == 0) goto L_0x0254
            java.lang.String r1 = "date_picker_mode"
            int r9 = r3.optInt(r1)
        L_0x024f:
            java.lang.String r2 = "FlowsLogger/getDatePickerInputParams/bind Max date is not a valid date format"
            if (r3 == 0) goto L_0x026b
            goto L_0x0259
        L_0x0254:
            r9 = 1
            goto L_0x024f
        L_0x0256:
            r3 = r13
            r7 = r13
            goto L_0x0237
        L_0x0259:
            java.lang.String r1 = "initial_ts_in_millis"
            java.lang.String r1 = r3.optString(r1)     // Catch:{ NumberFormatException -> 0x0266 }
            if (r1 == 0) goto L_0x026b
            java.lang.Long r4 = X.C108965cb.A0m(r1)     // Catch:{ NumberFormatException -> 0x0266 }
            goto L_0x026e
        L_0x0266:
            com.whatsapp.util.Log.e((java.lang.String) r2)
            r4 = r13
            goto L_0x026e
        L_0x026b:
            r4 = r13
            if (r3 == 0) goto L_0x0280
        L_0x026e:
            java.lang.String r1 = "max_ts_in_millis"
            java.lang.String r1 = r3.optString(r1)     // Catch:{ NumberFormatException -> 0x027b }
            if (r1 == 0) goto L_0x0280
            java.lang.Long r5 = X.C108965cb.A0m(r1)     // Catch:{ NumberFormatException -> 0x027b }
            goto L_0x0283
        L_0x027b:
            com.whatsapp.util.Log.e((java.lang.String) r2)
            r5 = r13
            goto L_0x0283
        L_0x0280:
            r5 = r13
            if (r3 == 0) goto L_0x0299
        L_0x0283:
            java.lang.String r1 = "min_ts_in_millis"
            java.lang.String r1 = r3.optString(r1)     // Catch:{ NumberFormatException -> 0x0294 }
            if (r1 == 0) goto L_0x0299
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0294 }
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0294 }
            goto L_0x0299
        L_0x0294:
            java.lang.String r1 = "FlowsLogger/getDatePickerInputParams/bind Min date is not a valid date format"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x0299:
            X.6tL r1 = new X.6tL
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            java.lang.Long r2 = r1.A01
            if (r2 == 0) goto L_0x02b9
            long r3 = r2.longValue()
            r6 = 0
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x02b9
            java.util.Date r2 = new java.util.Date
            r2.<init>(r3)
            r5.setTime(r2)
        L_0x02b9:
            r4 = 1
            X.74l r11 = new X.74l
            r11.<init>(r0, r1, r4)
            int r3 = r1.A00
            r2 = 2
            r14 = 2132083323(0x7f15027b, float:1.9806785E38)
            if (r3 != r2) goto L_0x02ca
            r14 = 2132083322(0x7f15027a, float:1.9806783E38)
        L_0x02ca:
            android.content.Context r12 = r0.A14()
            int r15 = r5.get(r4)
            int r16 = r5.get(r2)
            r0 = 5
            int r17 = r5.get(r0)
            X.8Dv r10 = new X.8Dv
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Long r2 = r1.A02
            if (r2 == 0) goto L_0x02ed
            android.widget.DatePicker r0 = r10.A01
            long r2 = r2.longValue()
            r0.setMaxDate(r2)
        L_0x02ed:
            java.lang.Long r0 = r1.A03
            if (r0 == 0) goto L_0x0205
            android.widget.DatePicker r2 = r10.A01
            long r0 = r0.longValue()
            r2.setMinDate(r0)
            goto L_0x0205
        L_0x02fc:
            r3 = 0
            goto L_0x013f
        L_0x02ff:
            java.lang.String r1 = "CalendarPicker"
            boolean r1 = X.C18070vi.A18(r3, r1)
            if (r1 == 0) goto L_0x032b
            X.00H r1 = r0.A0N
            if (r1 == 0) goto L_0x047a
            android.content.Context r1 = X.C108955ca.A0A(r0, r1)
            java.lang.String r4 = r2.toString()
            android.content.Intent r3 = X.C17880vN.A0A()
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r1 = "com.whatsapp.flows.webview.nativeUI.FlowsCalendarPickerActivity"
            r3.setClassName(r2, r1)
            java.lang.String r1 = "input_json"
            r3.putExtra(r1, r4)
            X.02n r0 = r0.A0T
        L_0x0327:
            r0.A02(r13, r3)
            return
        L_0x032b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/handleInputDialog Input type dialog is not recognised - "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            goto L_0x03e1
        L_0x0337:
            java.lang.String r1 = "WAExtensionsConfigureNavBar"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            X.0ve r3 = r0.A09
            if (r3 == 0) goto L_0x0482
            r2 = 8418(0x20e2, float:1.1796E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r3, r2)
            r5 = 0
            if (r1 == 0) goto L_0x0386
            X.00H r1 = r0.A2K()
            java.lang.Object r3 = r1.get()
            X.A6h r3 = (X.C20081A6h) r3
            com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel r1 = r0.A0B
            java.lang.String r4 = "waFlowsViewModel"
            if (r1 == 0) goto L_0x047e
            int r1 = com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel.A00(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "webview_js_callback_end"
            r3.A0B(r2, r1)
            X.00H r1 = r0.A2K()
            java.lang.Object r3 = r1.get()
            X.A6h r3 = (X.C20081A6h) r3
            com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel r1 = r0.A0B
            if (r1 == 0) goto L_0x047e
            int r1 = com.whatsapp.flows.webview.viewmodel.WaFlowsViewModel.A00(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "native_screen_end"
            r3.A0B(r2, r1)
        L_0x0386:
            if (r9 == 0) goto L_0x038e
            java.lang.String r1 = "is_hidden"
            boolean r5 = r9.optBoolean(r1)
        L_0x038e:
            android.widget.RelativeLayout r2 = r0.A01
            r3 = 0
            if (r2 == 0) goto L_0x039c
            r1 = r5 ^ 1
            int r1 = X.C72453Mb.A07(r1)
            r2.setVisibility(r1)
        L_0x039c:
            com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView r2 = r0.A0A
            if (r2 == 0) goto L_0x03a9
            r1 = r5 ^ 1
            int r1 = X.C72453Mb.A07(r1)
            r2.setVisibility(r1)
        L_0x03a9:
            android.widget.LinearLayout r0 = r0.A00
            if (r0 == 0) goto L_0x0028
            if (r5 != 0) goto L_0x03b1
            r3 = 8
        L_0x03b1:
            r0.setVisibility(r3)
            return
        L_0x03b5:
            java.lang.String r1 = "WAExtensionsReportItem"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            if (r9 == 0) goto L_0x03c5
            java.lang.String r1 = "product_id"
            java.lang.String r13 = r9.optString(r1)
        L_0x03c5:
            android.os.Bundle r2 = r0.A06
            if (r2 == 0) goto L_0x03fa
            java.lang.String r1 = "chat_id"
            java.lang.String r1 = r2.getString(r1)
            if (r1 == 0) goto L_0x03fa
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A02(r1)
        L_0x03d5:
            if (r13 == 0) goto L_0x03f7
            boolean r1 = X.AnonymousClass1YF.A0T(r13)
            if (r1 != 0) goto L_0x03f7
            if (r4 != 0) goto L_0x03e5
            java.lang.String r0 = "[Flows][WAExtensionsReportItem] failed to parse chat jid from string"
        L_0x03e1:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x03e5:
            X.1FL r3 = r0.A1D()
            boolean r1 = r3 instanceof X.AnonymousClass1FR
            if (r1 != 0) goto L_0x03f0
            java.lang.String r0 = "[Flows][WAExtensionsReportItem] activity doesn't implement DialogInterface"
            goto L_0x03e1
        L_0x03f0:
            boolean r1 = r3 instanceof X.AnonymousClass01E
            if (r1 != 0) goto L_0x0486
            java.lang.String r0 = "[Flows][WAExtensionsReportItem] activity is not instance of AppCompatActivity"
            goto L_0x03e1
        L_0x03f7:
            java.lang.String r0 = "[Flows][WAExtensionsReportItem] no product id provided"
            goto L_0x03e1
        L_0x03fa:
            r4 = 0
            goto L_0x03d5
        L_0x03fc:
            java.lang.String r1 = "WAExtensionsLearnMore"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = "extensions_learn_more"
            goto L_0x0452
        L_0x0407:
            java.lang.String r1 = "WAExtensionsClose"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            X.C72463Mc.A1A(r0)
            return
        L_0x0413:
            java.lang.String r1 = "WAFlowsOpenURL"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            if (r9 == 0) goto L_0x0425
            java.lang.String r1 = "url"
            java.lang.String r2 = r9.optString(r1)
            if (r2 != 0) goto L_0x0427
        L_0x0425:
            java.lang.String r2 = ""
        L_0x0427:
            boolean r1 = android.webkit.URLUtil.isHttpsUrl(r2)
            if (r1 == 0) goto L_0x043c
            java.lang.String r3 = "android.intent.action.VIEW"
            android.net.Uri r2 = X.C26215Cuu.A01(r2)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3, r2)
            r0.A1k(r1)
            return
        L_0x043c:
            android.view.View r2 = r0.A0B
            if (r2 == 0) goto L_0x0028
            r1 = 2131898503(0x7f123087, float:1.9431926E38)
            r0 = -1
            X.C108955ca.A1H(r2, r1, r0)
            return
        L_0x0448:
            java.lang.String r1 = "WAExtensionsContextualHelp"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            java.lang.String r1 = "extensions_help"
        L_0x0452:
            r0.A03(r1)
            return
        L_0x0456:
            java.lang.String r1 = "WAExtensionsSpamReport"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x001a
            r0.A01()
            return
        L_0x0462:
            X.C139346yg.A00(r5, r6, r7, r8, r9)
            return
        L_0x0466:
            java.lang.String r0 = "flowsMediaPicker"
            X.C18070vi.A11(r0)
            throw r13
        L_0x046c:
            X.AnonymousClass3MW.A1A()
            throw r13
        L_0x0470:
            java.util.HashMap r0 = r0.A0R
            r0.remove(r1)
            return
        L_0x0476:
            X.AnonymousClass3MW.A1G()
            throw r13
        L_0x047a:
            X.AnonymousClass3MW.A1F()
            throw r13
        L_0x047e:
            X.C18070vi.A11(r4)
            throw r13
        L_0x0482:
            X.AnonymousClass3MW.A1A()
            throw r13
        L_0x0486:
            com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment r1 = new com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment
            r1.<init>()
            r7 = 0
            X.7Ca r2 = new X.7Ca
            r5 = r0
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r1.A00 = r2
            X.1GP r0 = r3.getSupportFragmentManager()
            X.C20098A7b.A02(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer.CAU(android.webkit.WebMessagePort, org.json.JSONObject):void");
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A0B = (WaFlowsViewModel) AnonymousClass3Ma.A0I(this).A00(WaFlowsViewModel.class);
        Bundle bundle2 = this.A06;
        UserJid userJid = null;
        if (bundle2 != null) {
            userJid = UserJid.Companion.A04(bundle2.getString("chat_id"));
        }
        this.A0C = userJid;
        C18030ve r1 = this.A09;
        if (r1 != null) {
            C18040vf r2 = C18040vf.A02;
            this.A0P = C18020vd.A01(r2, r1, 2069);
            C18030ve r12 = this.A09;
            if (r12 != null) {
                boolean A052 = C18020vd.A05(r2, r12, 4393);
                boolean z = false;
                if (A052) {
                    C18030ve r13 = this.A09;
                    if (r13 == null) {
                        AnonymousClass3MW.A1A();
                        throw null;
                    } else if (AnonymousClass1YF.A0Y(C108955ca.A0v(r13, 3063), "extensions_help", false)) {
                        z = true;
                    }
                }
                this.A0S = z;
                A1Z(true);
                return;
            }
            AnonymousClass3MW.A1A();
            throw null;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        C18070vi.A0z(A27, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        C110745gz r4 = (C110745gz) A27;
        AnonymousClass00H r0 = this.A0F;
        if (r0 != null) {
            r4.setOnShowListener(new AnonymousClass75G(A1D(), r4, (AnonymousClass6ZI) r0.get(), new C150627kz(this)));
            return r4;
        }
        C18070vi.A11("bottomSheetDragBehavior");
        throw null;
    }

    public void CAV(String str) {
        C17900vP.A0e("FlowsLogger/FlowsWebBottomSheetContainer/onWebViewFatalError -- ", str, AnonymousClass000.A10());
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null && linearLayout.getVisibility() != 0) {
            A02(this, (String) null, (String) null);
        }
    }
}
