package X;

import android.opengl.Matrix;
import android.util.Pair;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.basic.NativeConfigFactory;
import com.facebook.onecamera.components.mediagraph.iglu.nativegraph.IgluFilterNativeGraph;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public final class BVs extends DGQ implements C28561E7n, EDP {
    public String A00 = CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID;
    public boolean A01;
    public boolean A02;
    public C26856DGn A03;
    public final IgluFilterNativeGraph A04 = new IgluFilterNativeGraph();
    public final HashMap A05;
    public final float[] A06 = new float[16];
    public final CJL A07;
    public final CJM A08;

    public BVs(CJM cjm) {
        this.A08 = cjm;
        HashMap A11 = C17880vN.A11();
        this.A05 = A11;
        FilterManagerImpl filterManagerImpl = FilterManagerImpl.$redex_init_class;
        A11.put(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, C108945cZ.A0N(new FilterManagerImpl((C28419E0k) null, (C28418E0j) null, false), (Object) null));
        this.A07 = new CJL();
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor, java.lang.Object] */
    public boolean BsM(C25599Cie cie, long j) {
        Pair pair;
        Integer num;
        C18070vi.A0d(cie, 0);
        if (this.A01 && (pair = (Pair) this.A05.get(this.A00)) != null) {
            CZ1 cz1 = (CZ1) pair.second;
            EAA eaa = (EAA) pair.first;
            if (!(cz1 == null || eaa == null)) {
                Iterator it = this.A07.A00.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw AnonymousClass000.A0s("updateCurrentTimeMs");
                }
                float[] fArr = this.A06;
                Matrix.multiplyMM(fArr, 0, cie.A04, 0, cie.A05, 0);
                float[] fArr2 = fArr;
                Matrix.multiplyMM(fArr, 0, fArr2, 0, cie.A03, 0);
                fArr[12] = 0.0f;
                fArr[13] = 0.0f;
                CZB czb = cie.A01;
                if (czb != null) {
                    D3R d3r = cz1.A01;
                    FilterManagerImpl filterManagerImpl = (FilterManagerImpl) eaa;
                    if (filterManagerImpl.mCachedModel != d3r) {
                        filterManagerImpl.mCachedModel = d3r;
                        eaa.createFilter(cz1.A00.createFilterFactory(d3r.A03));
                    }
                    ConcurrentHashMap concurrentHashMap = cz1.A02;
                    C26558D3y d3y = d3r.A01;
                    Iterator A0i = C17890vO.A0i(concurrentHashMap);
                    while (A0i.hasNext()) {
                        String A0x = C17880vN.A0x(AnonymousClass000.A16(A0i));
                        C18070vi.A0d(A0x, 0);
                        if (d3y.A01.get(A0x) == null) {
                            eaa.unsetFilterInput(A0x);
                            concurrentHashMap.remove(A0x);
                        }
                    }
                    ConcurrentHashMap concurrentHashMap2 = d3y.A01;
                    if (!concurrentHashMap2.isEmpty()) {
                        C28068Dqi dqi = new C28068Dqi(eaa, cz1, concurrentHashMap);
                        Iterator A0i2 = C17890vO.A0i(concurrentHashMap2);
                        while (A0i2.hasNext()) {
                            dqi.invoke(A0i2.next());
                        }
                    }
                    cz1.A00(eaa);
                    cz1.A01(eaa, fArr2, cie.A02);
                    IgluFilterNativeGraph igluFilterNativeGraph = this.A04;
                    igluFilterNativeGraph.updateFilter(eaa.getFilterWeakPtr());
                    int i = czb.A00;
                    int i2 = czb.A01;
                    CRH crh = czb.A02;
                    int i3 = crh.A01;
                    int i4 = crh.A00;
                    boolean A1T = AnonymousClass000.A1T(i2, 36197);
                    C8L c8l = IgluIODescriptor.Companion;
                    if (A1T) {
                        num = AnonymousClass00R.A01;
                    } else {
                        num = AnonymousClass00R.A00;
                    }
                    int intValue = num.intValue();
                    ? obj = new Object();
                    obj.mHybridData = IgluIODescriptor.initHybrid(i, i2, i3, i4, intValue, 7);
                    igluFilterNativeGraph.setInputTexture(obj);
                    igluFilterNativeGraph.useCurrentOutputFramebuffer(14);
                    igluFilterNativeGraph.render("IgluFilterRenderer");
                    return true;
                }
                throw AnonymousClass000.A0n("MutableVideoFrame not initialized, missing rgbTexture");
            }
        }
        return false;
    }

    public void C83(int i, int i2) {
    }

    public void C84(C25998CqE cqE) {
        this.A02 = false;
        IgluConfigHolder create = NativeConfigFactory.create(this.A08.A00, true);
        C18070vi.A0X(create);
        this.A04.attach(create);
        create.release();
        this.A01 = true;
    }

    public void C85() {
        synchronized (this) {
            if (!this.A02) {
                this.A02 = true;
                this.A01 = false;
                Iterator A0j = C17890vO.A0j(this.A05);
                while (A0j.hasNext()) {
                    EAA eaa = (EAA) ((Pair) A0j.next()).first;
                    if (eaa != null) {
                        eaa.release();
                    }
                }
                this.A04.detach();
            }
        }
    }

    public void CHu(CVG cvg) {
    }

    public boolean isEnabled() {
        return true;
    }

    public String BY8() {
        return "IgluFilterRenderer";
    }

    public void CKM(C26856DGn dGn) {
        C26856DGn dGn2 = this.A03;
        if (dGn != dGn2) {
            if (dGn2 != null) {
                dGn2.A01(this, C0O.A0F);
            }
            if (dGn != null) {
                dGn.A00(this, C0O.A0F);
            }
            this.A03 = dGn;
        }
    }

    public void C3B(C28560E7m e7m) {
        if (e7m.Bap() == C0O.A0F) {
            throw AnonymousClass000.A0s("getUpdater");
        }
    }
}
