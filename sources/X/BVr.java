package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.whatsapp.WhatsAppFilterFactoryProvider;
import java.util.HashMap;

public final class BVr extends DGQ implements C28561E7n, EDP {
    public D3R A00;
    public C26856DGn A01;
    public AnonymousClass9WT A02;
    public final Context A03;
    public final C18100vl A04 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C27487DgG(this));
    public final WhatsAppFilterFactoryProvider A05;

    public synchronized boolean BsM(C25599Cie cie, long j) {
        boolean z;
        AnonymousClass9WT r1;
        C18070vi.A0d(cie, 0);
        try {
            z = ((BVs) this.A04.getValue()).BsM(cie, j);
            if (z && (r1 = this.A02) != null) {
                BCO bco = r1.A00;
                if (bco != null) {
                    bco.C38();
                }
                r1.A00 = null;
                this.A02 = null;
            }
        } catch (RuntimeException e) {
            AnonymousClass9WT r2 = this.A02;
            if (r2 != null) {
                BCO bco2 = r2.A00;
                if (bco2 != null) {
                    bco2.Btl(new C75543hh(e));
                }
                r2.A00 = null;
                this.A02 = null;
            }
            z = false;
        }
        return z;
    }

    public void C84(C25998CqE cqE) {
        C18070vi.A0d(cqE, 0);
        ((BVs) this.A04.getValue()).C84(cqE);
    }

    public String BY8() {
        return "WhatsAppIgluRenderer";
    }

    public void C3B(C28560E7m e7m) {
        Object filterManagerImpl;
        CZ1 cz1;
        float f;
        if (e7m instanceof C26851DGi) {
            C26851DGi dGi = (C26851DGi) e7m;
            D3R d3r = dGi.A00;
            if (d3r != null) {
                String str = d3r.A03;
                this.A02 = dGi.A01;
                if (!C18070vi.A18(this.A00, d3r)) {
                    C18100vl r6 = this.A04;
                    Pair pair = (Pair) ((BVs) r6.getValue()).A05.get(str);
                    if (pair == null || (cz1 = (CZ1) pair.second) == null) {
                        CZ1 cz12 = new CZ1(this.A05, d3r);
                        HashMap hashMap = ((BVs) r6.getValue()).A05;
                        Pair pair2 = (Pair) hashMap.get(str);
                        if (pair2 != null) {
                            filterManagerImpl = pair2.first;
                        } else {
                            FilterManagerImpl filterManagerImpl2 = FilterManagerImpl.$redex_init_class;
                            filterManagerImpl = new FilterManagerImpl((C28419E0k) null, (C28418E0j) null, AnonymousClass000.A0h());
                        }
                        hashMap.put(str, C108945cZ.A0N(filterManagerImpl, cz12));
                        BVs bVs = (BVs) r6.getValue();
                        Pair pair3 = (Pair) bVs.A05.get(str);
                        if (!(pair3 == null || pair3.second == null)) {
                            bVs.A00 = str;
                        }
                        this.A00 = d3r;
                        return;
                    }
                    BVs bVs2 = (BVs) r6.getValue();
                    Pair pair4 = (Pair) bVs2.A05.get(str);
                    if (!(pair4 == null || pair4.second == null)) {
                        bVs2.A00 = str;
                    }
                    D3R d3r2 = cz1.A01;
                    C18070vi.A0z(d3r2, "null cannot be cast to non-null type com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel");
                    Number A1D = C108945cZ.A1D("strength", d3r.A01.A03);
                    if (A1D != null) {
                        f = A1D.floatValue();
                    } else {
                        f = 1.0f;
                    }
                    C8N.A00(d3r2, f);
                    this.A00 = d3r2;
                    return;
                }
                return;
            }
            this.A00 = null;
            this.A02 = null;
        }
    }

    public void C83(int i, int i2) {
        this.A04.getValue();
    }

    public void C85() {
        ((BVs) this.A04.getValue()).C85();
    }

    public void CHu(CVG cvg) {
        this.A04.getValue();
    }

    public void CKM(C26856DGn dGn) {
        if (!C18070vi.A18(this.A01, dGn)) {
            C26856DGn dGn2 = this.A01;
            if (dGn2 != null) {
                dGn2.A01(this, C0O.A05);
            }
            if (dGn != null) {
                dGn.A00(this, C0O.A05);
            }
            this.A01 = dGn;
        }
    }

    public boolean isEnabled() {
        return AnonymousClass000.A1W(this.A00);
    }

    public BVr(Context context, WhatsAppFilterFactoryProvider whatsAppFilterFactoryProvider) {
        this.A03 = context;
        this.A05 = whatsAppFilterFactoryProvider;
    }
}
