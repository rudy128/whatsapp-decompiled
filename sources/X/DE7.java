package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public final class DE7 implements EAL {
    public boolean A00;
    public final /* synthetic */ C22807BPv A01;

    public void Bxp(Exception exc) {
        C22807BPv bPv = this.A01;
        EDJ edj = bPv.A04;
        if (edj != null) {
            C22807BPv.A01(bPv, new BUP(exc));
            if (!this.A00) {
                this.A00 = true;
                edj.CNY("MediaGraphControllerImpl:onMediaGraphRenderError", exc, true);
            }
        }
        E49 e49 = bPv.A02;
        if (e49 != null) {
            e49.Bxl(new BUP(exc));
        }
    }

    public DE7(C22807BPv bPv) {
        this.A01 = bPv;
    }

    public void Bxk(C26376Cyc cyc) {
        C22807BPv bPv = this.A01;
        EDJ edj = bPv.A04;
        if (edj != null) {
            HashMap A11 = C17880vN.A11();
            LinkedHashMap linkedHashMap = C22807BPv.A0B;
            synchronized (linkedHashMap) {
                String obj = bPv.toString();
                String BXd = edj.BXd();
                if (AnonymousClass8BS.A00(BXd) <= 0) {
                    BXd = "unknown";
                }
                linkedHashMap.put(obj, BXd);
                A11.put("active_media_pipelines", linkedHashMap.values().toString());
            }
            edj.BiS("media_pipeline_start", "MediaGraphControllerImpl", A11, BE6.A0O(cyc));
        }
    }

    public void Bxm(C26376Cyc cyc) {
        C22807BPv bPv = this.A01;
        bPv.A00 = 0;
        EDJ edj = bPv.A04;
        if (edj != null) {
            edj.BiS("media_pipeline_pause", "MediaGraphControllerImpl", (Map) null, BE6.A0O(cyc));
        }
        C26372CyY cyY = bPv.A06.A04.A07;
        C18070vi.A0X(cyY);
        Handler handler = cyY.A01;
        if (handler != null) {
            handler.removeMessages(1, bPv);
            handler.sendEmptyMessage(3);
        }
    }

    public void Bxn() {
        C22807BPv bPv = this.A01;
        CountDownLatch countDownLatch = bPv.A0A;
        bPv.A0A = null;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        C28592E9h e9h = bPv.A00;
        C26159CtX.A01(e9h);
        C18070vi.A0X(e9h);
        EDI edi = (EDI) e9h.BP8(EDI.A00);
        String str = (String) e9h.BPA(EBD.A0H);
        if (str != null) {
            edi.CDF(str);
        }
        if (C72463Mc.A1Y(e9h.BPA(EBD.A0K))) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("OC-");
            edi.CDF(C17880vN.A0t(A10, e9h.hashCode()));
        }
    }

    public void Bxo(C26376Cyc cyc) {
        C22807BPv bPv = this.A01;
        EDJ edj = bPv.A04;
        if (edj != null) {
            HashMap A11 = C17880vN.A11();
            LinkedHashMap linkedHashMap = C22807BPv.A0B;
            synchronized (linkedHashMap) {
                linkedHashMap.remove(bPv.toString());
                A11.put("active_media_pipelines", linkedHashMap.values().toString());
            }
            A11.put("frame_render_noop_counter", String.valueOf(bPv.A00));
            edj.BiS("media_pipeline_stop", "MediaGraphControllerImpl", A11, BE6.A0O(cyc));
        }
        C26372CyY cyY = bPv.A06.A04.A07;
        C18070vi.A0X(cyY);
        Handler handler = cyY.A01;
        if (handler != null) {
            handler.removeMessages(1, bPv);
        }
    }

    public void Bxq() {
        C22807BPv bPv = this.A01;
        EDJ edj = bPv.A04;
        if (edj != null) {
            edj.CDd(System.nanoTime());
        }
        E4A e4a = bPv.A08;
        if (e4a != null) {
            e4a.Bxu();
        }
        C26372CyY cyY = bPv.A06.A04.A07;
        C18070vi.A0X(cyY);
        cyY.A00(bPv);
    }

    public void Bxr() {
        this.A01.A00++;
    }

    public void Bxs() {
        if (this.A01.A04 != null) {
            System.nanoTime();
        }
    }

    public void Bxt() {
        EDJ edj = this.A01.A04;
        if (edj != null) {
            edj.CDe(System.nanoTime());
        }
    }

    public void Bxv(C26376Cyc cyc) {
        EDJ edj = this.A01.A04;
        if (edj != null) {
            edj.BiS("media_pipeline_resume", "MediaGraphControllerImpl", (Map) null, BE6.A0O(cyc));
        }
    }
}
