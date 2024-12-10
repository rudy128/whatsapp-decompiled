package X;

import android.opengl.Matrix;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.whatsapp.WhatsAppFilterFactoryProvider;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class CZ1 {
    public final WhatsAppFilterFactoryProvider A00;
    public final D3R A01;
    public final ConcurrentHashMap A02 = AnonymousClass8BR.A17();
    public final float[] A03 = new float[16];
    public final float[] A04 = new float[16];

    public void A01(EAA eaa, float[] fArr, float[] fArr2) {
        float[] fArr3;
        float[] fArr4;
        float[] fArr5 = fArr2;
        C18070vi.A0d(fArr5, 2);
        D3R d3r = this.A01;
        D4C d4c = d3r.A02;
        int intValue = d4c.A07.intValue();
        EAA eaa2 = eaa;
        float[] fArr6 = fArr;
        if (intValue != 0) {
            if (intValue == 1) {
                fArr4 = fArr6;
            } else if (intValue != 2) {
                fArr4 = this.A04;
                Matrix.multiplyMM(fArr4, 0, fArr6, 0, d3r.A05, 0);
            } else {
                fArr4 = d3r.A05;
            }
            eaa2.setFloatArrayParameter("texture_transform", fArr4);
        }
        int intValue2 = d4c.A06.intValue();
        if (intValue2 != 0) {
            if (intValue2 == 1) {
                fArr3 = fArr5;
            } else if (intValue2 != 2) {
                fArr3 = this.A03;
                Matrix.multiplyMM(fArr3, 0, fArr5, 0, d3r.A04, 0);
            } else {
                fArr3 = d3r.A04;
            }
            eaa2.setFloatArrayParameter("content_transform", fArr3);
        }
        Iterator A0i = C17890vO.A0i(this.A02);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            Object key = A16.getKey();
            CZ1 cz1 = (CZ1) A16.getValue();
            FilterManagerImpl filterManagerImpl = (FilterManagerImpl) eaa2;
            EAA eaa3 = (EAA) filterManagerImpl.mNamedSubFilterMangerMap.get(key);
            if (eaa3 == null) {
                eaa3 = new FilterManagerImpl((C28419E0k) null, (C28418E0j) null, filterManagerImpl.mForceGlslEs3);
                filterManagerImpl.mNamedSubFilterMangerMap.put(key, eaa3);
            }
            cz1.A01(eaa3, fArr6, fArr5);
        }
    }

    public void A00(EAA eaa) {
        C26558D3y d3y = this.A01.A01;
        ConcurrentHashMap concurrentHashMap = d3y.A03;
        if (!concurrentHashMap.isEmpty()) {
            C28039DqE dqE = new C28039DqE(eaa, this);
            Iterator A0i = C17890vO.A0i(concurrentHashMap);
            while (A0i.hasNext()) {
                dqE.invoke(A0i.next());
            }
        }
        ConcurrentHashMap concurrentHashMap2 = d3y.A02;
        if (!concurrentHashMap2.isEmpty()) {
            C28040DqF dqF = new C28040DqF(eaa, this);
            Iterator A0i2 = C17890vO.A0i(concurrentHashMap2);
            while (A0i2.hasNext()) {
                dqF.invoke(A0i2.next());
            }
        }
        ConcurrentHashMap concurrentHashMap3 = d3y.A04;
        if (!concurrentHashMap3.isEmpty()) {
            C28041DqG dqG = new C28041DqG(eaa, this);
            Iterator A0i3 = C17890vO.A0i(concurrentHashMap3);
            while (A0i3.hasNext()) {
                dqG.invoke(A0i3.next());
            }
        }
        ConcurrentHashMap concurrentHashMap4 = d3y.A00;
        if (!concurrentHashMap4.isEmpty()) {
            C28042DqH dqH = new C28042DqH(eaa, this);
            Iterator A0i4 = C17890vO.A0i(concurrentHashMap4);
            while (A0i4.hasNext()) {
                dqH.invoke(A0i4.next());
            }
        }
        ConcurrentHashMap concurrentHashMap5 = d3y.A05;
        if (!concurrentHashMap5.isEmpty()) {
            C28043DqI dqI = new C28043DqI(eaa, this);
            Iterator A0i5 = C17890vO.A0i(concurrentHashMap5);
            while (A0i5.hasNext()) {
                dqI.invoke(A0i5.next());
            }
        }
        ConcurrentHashMap concurrentHashMap6 = d3y.A06;
        if (!concurrentHashMap6.isEmpty()) {
            C28044DqJ dqJ = new C28044DqJ(eaa, this);
            Iterator A0i6 = C17890vO.A0i(concurrentHashMap6);
            if (A0i6.hasNext()) {
                dqJ.invoke(A0i6.next());
                throw null;
            }
        }
        Iterator A0i7 = C17890vO.A0i(this.A02);
        while (A0i7.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i7);
            Object key = A16.getKey();
            CZ1 cz1 = (CZ1) A16.getValue();
            FilterManagerImpl filterManagerImpl = (FilterManagerImpl) eaa;
            EAA eaa2 = (EAA) filterManagerImpl.mNamedSubFilterMangerMap.get(key);
            if (eaa2 == null) {
                eaa2 = new FilterManagerImpl((C28419E0k) null, (C28418E0j) null, filterManagerImpl.mForceGlslEs3);
                filterManagerImpl.mNamedSubFilterMangerMap.put(key, eaa2);
            }
            cz1.A00(eaa2);
        }
    }

    public CZ1(WhatsAppFilterFactoryProvider whatsAppFilterFactoryProvider, D3R d3r) {
        this.A01 = d3r;
        this.A00 = whatsAppFilterFactoryProvider;
    }
}
