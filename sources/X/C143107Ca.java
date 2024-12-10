package X;

import android.app.Activity;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.flows.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7Ca  reason: invalid class name and case insensitive filesystem */
public class C143107Ca implements B7R {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C143107Ca(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A04 = str;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public final void C3F(String str) {
        AnonymousClass10I r2;
        Runnable r1;
        String str2 = str;
        if (this.A00 != 0) {
            A6L a6l = (A6L) this.A01;
            String str3 = this.A04;
            Activity activity = (Activity) this.A03;
            A8Q a8q = (A8Q) a6l.A0I.get();
            a8q.A08(3, (String) null, (String) null);
            String str4 = a8q.A03;
            UserJid A002 = C22941Dw.A00((Jid) this.A02);
            C17960vV.A07(A002);
            C187669gB r5 = new C187669gB(A002, str3, str2, str4, a8q.A0D.get(), (long) a8q.A0E.getAndIncrement());
            CatalogManager catalogManager = (CatalogManager) a6l.A0J.get();
            catalogManager.A09.add(new AnonymousClass7CS(activity, catalogManager, a6l));
            ((AnonymousClass1FR) activity).CNB(0, 2131890452);
            r2 = AnonymousClass3MX.A0x(a6l.A0j);
            r1 = new AnonymousClass7RN(catalogManager, r5, 23);
        } else {
            FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) this.A01;
            String str5 = this.A04;
            UserJid userJid = (UserJid) this.A02;
            AnonymousClass1FL r4 = (AnonymousClass1FL) this.A03;
            AnonymousClass00H r0 = flowsWebBottomSheetContainer.A0G;
            if (r0 != null) {
                ((A8Q) C18070vi.A0E(r0)).A08(3, (String) null, (String) null);
                AnonymousClass00H r02 = flowsWebBottomSheetContainer.A0G;
                if (r02 != null) {
                    String str6 = ((A8Q) r02.get()).A03;
                    AnonymousClass00H r03 = flowsWebBottomSheetContainer.A0G;
                    if (r03 != null) {
                        long andIncrement = (long) ((A8Q) r03.get()).A0E.getAndIncrement();
                        AnonymousClass00H r04 = flowsWebBottomSheetContainer.A0G;
                        if (r04 != null) {
                            C187669gB r52 = new C187669gB(userJid, str5, str2, str6, ((A8Q) r04.get()).A0D.get(), andIncrement);
                            AnonymousClass00H r05 = flowsWebBottomSheetContainer.A0H;
                            if (r05 != null) {
                                ((CatalogManager) r05.get()).A09.add(new AnonymousClass7CR(r4, flowsWebBottomSheetContainer, str5));
                                ((AnonymousClass1FR) r4).CNB(0, 2131890452);
                                r2 = flowsWebBottomSheetContainer.A0E;
                                if (r2 != null) {
                                    r1 = new C146797Qq(flowsWebBottomSheetContainer, r52, 13);
                                } else {
                                    AnonymousClass3MW.A1G();
                                    throw null;
                                }
                            } else {
                                C18070vi.A11("catalogManagerLazy");
                                throw null;
                            }
                        } else {
                            C18070vi.A11("catalogAnalyticManagerLazy");
                            throw null;
                        }
                    } else {
                        C18070vi.A11("catalogAnalyticManagerLazy");
                        throw null;
                    }
                } else {
                    C18070vi.A11("catalogAnalyticManagerLazy");
                    throw null;
                }
            } else {
                C18070vi.A11("catalogAnalyticManagerLazy");
                throw null;
            }
        }
        r2.CGN(r1);
    }
}
