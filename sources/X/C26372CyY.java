package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.CyY  reason: case insensitive filesystem */
public final class C26372CyY implements Handler.Callback {
    public CJO A00;
    public final Handler A01;
    public final Looper A02;
    public final HashMap A03;
    public final HashMap A04;
    public volatile boolean A05;

    public void A00(E4Z e4z) {
        Handler handler;
        if (!this.A05 && (handler = this.A01) != null) {
            handler.removeMessages(1, e4z);
            HashMap hashMap = this.A03;
            if (C18070vi.A19(hashMap.get(e4z), true)) {
                hashMap.put(e4z, false);
                C108955ca.A1F(handler, e4z, 2);
            }
            handler.sendMessageDelayed(handler.obtainMessage(1, e4z), 5000);
        }
    }

    public boolean handleMessage(Message message) {
        Number A1D;
        Message message2 = message;
        C18070vi.A0d(message2, 0);
        int i = message2.what;
        if (i == 1) {
            HashMap hashMap = this.A04;
            Object obj = message2.obj;
            C18070vi.A0z(obj, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            hashMap.put(obj, C108955ca.A0m());
            HashMap hashMap2 = this.A03;
            Object obj2 = message2.obj;
            C18070vi.A0z(obj2, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            hashMap2.put(obj2, true);
            CJO cjo = this.A00;
            if (cjo != null) {
                Object obj3 = message2.obj;
                C18070vi.A0z(obj3, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
                E4Z e4z = (E4Z) obj3;
                C18070vi.A0d(e4z, 0);
                C22807BPv bPv = cjo.A00;
                EDJ edj = bPv.A04;
                if (edj != null) {
                    edj.BiS("media_pipeline_render_stuck", e4z.BR9(), (Map) null, BE6.A0O(e4z));
                }
                bPv.A03.A00(C0H.A0T);
            }
        } else if (i == 2) {
            HashMap hashMap3 = this.A04;
            Object obj4 = message2.obj;
            C18070vi.A0z(obj4, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            Number A1D2 = C108945cZ.A1D(obj4, hashMap3);
            if (A1D2 != null) {
                long currentTimeMillis = (System.currentTimeMillis() - A1D2.longValue()) + 5000;
                CJO cjo2 = this.A00;
                if (cjo2 != null) {
                    Object obj5 = message2.obj;
                    C18070vi.A0z(obj5, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
                    E4Z e4z2 = (E4Z) obj5;
                    C18070vi.A0d(e4z2, 0);
                    EDJ edj2 = cjo2.A00.A04;
                    if (edj2 != null) {
                        HashMap A11 = C17880vN.A11();
                        BE7.A1I("render_stuck_time", A11, currentTimeMillis);
                        edj2.BiS("media_pipeline_render_stuck_time", e4z2.BR9(), A11, BE6.A0O(e4z2));
                        return true;
                    }
                }
            }
        } else if (i == 3) {
            HashMap hashMap4 = this.A04;
            Iterator A0k = C17890vO.A0k(hashMap4);
            while (A0k.hasNext()) {
                E4Z e4z3 = (E4Z) A0k.next();
                if (C18070vi.A19(this.A03.get(e4z3), true) && (A1D = C108945cZ.A1D(e4z3, hashMap4)) != null) {
                    long currentTimeMillis2 = (System.currentTimeMillis() - A1D.longValue()) + 5000;
                    CJO cjo3 = this.A00;
                    if (cjo3 != null) {
                        C72453Mb.A1R(e4z3);
                        EDJ edj3 = cjo3.A00.A04;
                        if (edj3 != null) {
                            HashMap A112 = C17880vN.A11();
                            BE7.A1I("render_stuck_time", A112, currentTimeMillis2);
                            edj3.BiS("media_pipeline_render_stuck_forever", e4z3.BR9(), A112, BE6.A0O(e4z3));
                        }
                    }
                }
            }
            hashMap4.clear();
            this.A03.clear();
            return true;
        }
        return true;
    }

    public C26372CyY(Looper looper) {
        Handler handler;
        this.A02 = looper;
        if (looper != null) {
            handler = new Handler(looper, this);
        } else {
            handler = null;
        }
        this.A01 = handler;
        this.A04 = C17880vN.A11();
        this.A03 = C17880vN.A11();
    }
}
