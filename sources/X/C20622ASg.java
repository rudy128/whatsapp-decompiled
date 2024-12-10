package X;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.ASg  reason: case insensitive filesystem */
public class C20622ASg implements B83, B85, C436820m {
    public AnonymousClass00H A00;

    public void BDb(C19998A2m a2m, AnonymousClass206 r5) {
        C17960vV.A0G(r5 instanceof AnonymousClass21L, AnonymousClass001.A1E(r5, "FMessageInteractiveProtocolSerializer: message type is not supported ", AnonymousClass000.A10()));
        C20285AEt aEt = ((AnonymousClass21L) r5).A00;
        if (aEt != null) {
            C20083A6j.A02(a2m, r5, aEt, this.A00);
        }
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        AnonymousClass21L r5;
        int i;
        AER aer;
        C164858aB r1;
        EE9 ee9;
        EE9<C164868aC> ee92;
        C20077A6d a6d2 = a6d;
        C166418cr r6 = a6d2.A08;
        if (!AnonymousClass000.A1O(r6.bitField0_ & 134217728)) {
            return null;
        }
        AnonymousClass205 r3 = a6d2.A0A;
        long j = a6d2.A03;
        C166358cl r9 = r6.listMessage_;
        if (r9 == null) {
            r9 = C166358cl.DEFAULT_INSTANCE;
        }
        C17960vV.A07(r9);
        if ((r9.bitField0_ & 8) != 0) {
            C179759Ju A0R = r9.A0R();
            C179759Ju r4 = C179759Ju.SINGLE_SELECT;
            if (A0R == r4) {
                r5 = new AnonymousClass21P(r3, j);
                i = 1;
            } else if (A0R == C179759Ju.PRODUCT_LIST) {
                r5 = new AnonymousClass21N(r3, j);
                i = 2;
            }
            if (!TextUtils.isEmpty(r9.description_) && (r9.bitField0_ & 8) != 0 && (!TextUtils.isEmpty(r9.buttonText_) || r9.A0R() != r4)) {
                C179759Ju A0R2 = r9.A0R();
                if (A0R2 == r4) {
                    EE9 ee93 = r9.sections_;
                    if (!(ee93 == null || ee93.size() == 0)) {
                        int i2 = 0;
                        while (i2 < ee93.size()) {
                            AnonymousClass8Z7 r12 = (AnonymousClass8Z7) ee93.get(i2);
                            if (!((i2 != 0 && TextUtils.isEmpty(r12.title_)) || (ee92 = r12.rows_) == null || ee92.size() == 0)) {
                                for (C164868aC r0 : ee92) {
                                    if (TextUtils.isEmpty(r0.title_)) {
                                    }
                                }
                                i2++;
                            }
                        }
                    }
                } else if (A0R2 == C179759Ju.PRODUCT_LIST && !(((r1 = r9.productListInfo_) == null && (r1 = C164858aB.DEFAULT_INSTANCE) == null) || (ee9 = r1.productSections_) == null || ee9.size() == 0)) {
                    loop2:
                    for (AnonymousClass8Z6 r13 : r1.productSections_) {
                        EE9 ee94 = r13.products_;
                        if (ee94 != null && ee94.size() != 0) {
                            Iterator it = r13.products_.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (TextUtils.isEmpty(((C164038Xh) it.next()).productId_)) {
                                        break loop2;
                                    }
                                }
                            }
                        }
                    }
                }
                AEE aee = new AEE((C20275AEi) null, r9.title_, (String) null, (byte[]) null);
                String str = r9.description_;
                String str2 = r9.footerText_;
                String str3 = r9.buttonText_;
                EE9<AnonymousClass8Z7> ee95 = r9.sections_;
                ArrayList A13 = AnonymousClass000.A13();
                if (ee95 != null) {
                    for (AnonymousClass8Z7 r02 : ee95) {
                        String str4 = r02.title_;
                        EE9<C164868aC> ee96 = r02.rows_;
                        ArrayList A132 = AnonymousClass000.A13();
                        for (C164868aC r03 : ee96) {
                            String str5 = r03.rowId_;
                            String str6 = r03.title_;
                            String str7 = r03.description_;
                            C18070vi.A0j(str5, str6);
                            A132.add(new AEF(str5, (String) null, str6, str7));
                        }
                        C18070vi.A0d(str4, 1);
                        A13.add(new AE4(str4, (String) null, A132));
                    }
                }
                C164858aB r10 = r9.productListInfo_;
                if (r10 == null) {
                    r10 = C164858aB.DEFAULT_INSTANCE;
                }
                if (r10 == null) {
                    aer = null;
                } else {
                    AnonymousClass8Z5 r04 = r10.headerImage_;
                    if (r04 == null) {
                        r04 = AnonymousClass8Z5.DEFAULT_INSTANCE;
                    }
                    byte[] A06 = r04.jpegThumbnail_.A06();
                    AnonymousClass8Z5 r05 = r10.headerImage_;
                    if (r05 == null) {
                        r05 = AnonymousClass8Z5.DEFAULT_INSTANCE;
                    }
                    AE3 ae3 = new AE3(A06, r05.productId_, false);
                    String str8 = r10.businessOwnerJid_;
                    try {
                        EE9<AnonymousClass8Z6> ee97 = r10.productSections_;
                        ArrayList A133 = AnonymousClass000.A13();
                        if (ee97 != null) {
                            for (AnonymousClass8Z6 r06 : ee97) {
                                String str9 = r06.title_;
                                EE9<C164038Xh> ee98 = r06.products_;
                                ArrayList A134 = AnonymousClass000.A13();
                                if (ee98 != null) {
                                    for (C164038Xh r07 : ee98) {
                                        A134.add(new C20243ADb(r07.productId_));
                                    }
                                }
                                A133.add(new C20254ADm(str9, A134));
                            }
                        }
                        aer = new AER(AnonymousClass8BR.A0X(str8), ae3, A133);
                    } catch (AnonymousClass11T e) {
                        C17900vP.A0h("FMessageListProtobuf/parseE2EProductListInfo/Invalid jid: ", str8, AnonymousClass000.A10(), e);
                        aer = null;
                    }
                }
                r5.CIS(new C20285AEt((View.OnClickListener) null, (C20279AEn) null, (AEY) null, (C20242ADa) null, aee, (C20277AEk) null, aer, (ADF) null, (ADG) null, str, str2, str3, (String) null, (String) null, A13, i));
                return r5;
            }
            C17900vP.A0Z(r3, "FMessageListProtobuf/parseFMessageList/invalid message; message.key=", AnonymousClass000.A10());
            throw AnonymousClass8BR.A0o(26);
        }
        return new AnonymousClass23U(r3, r6.A0M(), 2, a6d2.A00, j);
    }

    public C20622ASg(AnonymousClass00H r1) {
        this.A00 = r1;
    }
}
