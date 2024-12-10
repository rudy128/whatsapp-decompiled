package X;

import android.content.Context;
import android.os.Looper;
import com.facebook.wearable.datax.LocalChannel;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public final class BQm extends BNB {
    public static final C26153CtL A0Q = new C26153CtL();
    public static final /* synthetic */ EEE[] A0R;
    public C25258Cbx A00;
    public final Looper A01;
    public final C25522ChK A02 = new C25522ChK(new BXF(this));
    public final C25522ChK A03 = new C25522ChK(new BXF(this));
    public final C25522ChK A04 = new C25522ChK(new BXK(this));
    public final C25522ChK A05 = new C25522ChK(new BXE(this));
    public final C25522ChK A06 = new C25522ChK(new BXE(this));
    public final C25522ChK A07 = new C25522ChK(new BXO(this));
    public final C25522ChK A08 = new C25522ChK(new BXO(this));
    public final C25522ChK A09 = new C25522ChK(new BXN(this));
    public final C25522ChK A0A = new C25522ChK(new BXN(this));
    public final C25522ChK A0B;
    public final C25522ChK A0C;
    public final C25522ChK A0D = new C25522ChK(new BXM(this));
    public final C25522ChK A0E = new C25522ChK(new BXM(this));
    public final C25522ChK A0F;
    public final BTO A0G;
    public final C24868CNm A0H;
    public final CYR A0I;
    public final C25838Cms A0J;
    public final C22821Di A0K;
    public final C22821Di A0L;
    public final C22821Di A0M;
    public final AnonymousClass1OS A0N;
    public final Context A0O;
    public final C25522ChK A0P;

    public final void A0D(BXP bxp) {
        C18070vi.A0d(bxp, 0);
        C25258Cbx cbx = this.A00;
        int i = this.A0G.A02;
        int i2 = 1;
        if (i >= 1 && i <= 3) {
            i2 = i;
        }
        C23624Bmt A0N2 = C23643BnC.DEFAULT_INSTANCE.A0N();
        ((C23643BnC) C17880vN.A0G(A0N2)).nonce_ = cbx.A00();
        C23624Bmt A0N3 = C23655BnO.DEFAULT_INSTANCE.A0N();
        BTZ btz = bxp.A00;
        ((C23655BnO) C17880vN.A0G(A0N3)).mime_ = C25331Cdc.A00(btz.A06);
        ((C23655BnO) C17880vN.A0G(A0N3)).width_ = btz.A05;
        ((C23655BnO) C17880vN.A0G(A0N3)).height_ = btz.A03;
        ((C23655BnO) C17880vN.A0G(A0N3)).bitrate_ = btz.A00;
        ((C23655BnO) C17880vN.A0G(A0N3)).frameRate_ = btz.A02;
        ((C23655BnO) C17880vN.A0G(A0N3)).eisMode_ = i2;
        ((C23655BnO) C17880vN.A0G(A0N3)).iFrameInterval_ = btz.A04;
        ((C23655BnO) C17880vN.A0G(A0N3)).captureFrameRate_ = btz.A01;
        C23655BnO bnO = (C23655BnO) A0N3.A0C();
        bnO.getClass();
        ((C23643BnC) C17880vN.A0G(A0N2)).config_ = bnO;
        ((C23643BnC) C17880vN.A0G(A0N2)).enabled_ = true;
        C23577Bm6 A0C2 = A0N2.A0C();
        C24712CGy.A01.A02("sup:MediaStreamState", AnonymousClass001.A1E(A0C2, "Configure Video: ", AnonymousClass000.A10()));
        LocalChannel localChannel = cbx.A02;
        if (localChannel != null) {
            byte[] A0M2 = A0C2.A0M();
            localChannel.send(new C25527ChP(5, Arrays.copyOf(A0M2, A0M2.length)));
        }
    }

    public final void A0E(BXS bxs) {
        C18070vi.A0d(bxs, 0);
        LocalChannel localChannel = this.A00.A02;
        if (localChannel != null) {
            C16 c16 = C16.values()[bxs.A00.A01.intValue()];
            C24712CGy.A01.A02("sup:MediaStreamState", AnonymousClass001.A1E(c16, "Sending Lifecycle Event: ", AnonymousClass000.A10()));
            C23624Bmt A0N2 = C23626Bmv.DEFAULT_INSTANCE.A0N();
            ((C23626Bmv) C17880vN.A0G(A0N2)).event_ = c16.BVW();
            DND.A08(localChannel, A0N2, 19);
        }
    }

    static {
        Class<BQm> cls = BQm.class;
        A0R = new EEE[]{new C28239Dtz(cls, "INITIAL", "getINITIAL()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "DISCOVERED", "getDISCOVERED()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "SN_APP_MANAGER_BTC", "getSN_APP_MANAGER_BTC()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "SN_APP_MANAGER_WD", "getSN_APP_MANAGER_WD()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "MEDIA_STREAM_SERVICE_BTC", "getMEDIA_STREAM_SERVICE_BTC()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "MEDIA_STREAM_SERVICE_WD", "getMEDIA_STREAM_SERVICE_WD()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "CONNECTED_BTC", "getCONNECTED_BTC()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "CONNECTED_WD", "getCONNECTED_WD()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "IDLE_BTC", "getIDLE_BTC()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "IDLE_WD", "getIDLE_WD()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "STREAMING_BTC", "getSTREAMING_BTC()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "STREAMING_WD", "getSTREAMING_WD()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "SOCKET_CONNECTION_BTC", "getSOCKET_CONNECTION_BTC()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "SOCKET_CONNECTION_WIFI_DIRECT", "getSOCKET_CONNECTION_WIFI_DIRECT()Lcom/android/facebook/internal/util/State;", 0), new C28239Dtz(cls, "TOOLKIT_HEALTH_CONNECTION", "getTOOLKIT_HEALTH_CONNECTION()Lcom/android/facebook/internal/util/State;", 0)};
    }

    public BQm(Context context, Looper looper, BTO bto, C24868CNm cNm, CYR cyr, C25838Cms cms, C22821Di r13, C22821Di r14, C22821Di r15, AnonymousClass1OS r16) {
        super(looper);
        C6V bxh;
        C6V c6v;
        C25845Cn1 cn1;
        String str;
        this.A01 = looper;
        this.A0L = r13;
        this.A0M = r14;
        this.A0N = r16;
        this.A0K = r15;
        this.A0H = cNm;
        this.A0J = cms;
        this.A0I = cyr;
        this.A0G = bto;
        this.A0O = context;
        this.A00 = new C27966Dp2(this);
        this.A00 = new C25258Cbx(context);
        this.A0P = new C25522ChK(new BXJ(context, this));
        if (bto.A03 == AnonymousClass00R.A0Y) {
            bxh = new BXG(this);
        } else {
            bxh = new BXH(this);
        }
        this.A0B = new C25522ChK(bxh);
        this.A0C = new C25522ChK(new BXI(this));
        try {
            Object newInstance = Class.forName("com.facebook.wearable.mediastream.client.state.ToolkitHealthConnectionStateDelegate").getDeclaredConstructor(new Class[]{BQm.class}).newInstance(new Object[]{this});
            C18070vi.A0z(newInstance, "null cannot be cast to non-null type com.facebook.wearable.mediastream.client.state.BaseStateDelegate");
            c6v = (C6V) newInstance;
        } catch (ClassNotFoundException e) {
            e = e;
            cn1 = C24712CGy.A01;
            str = "ClassNotFoundException";
        } catch (NoSuchMethodException e2) {
            e = e2;
            cn1 = C24712CGy.A01;
            str = "NoSuchMethodException";
        } catch (SecurityException e3) {
            e = e3;
            cn1 = C24712CGy.A01;
            str = "SecurityException";
        } catch (InstantiationException e4) {
            e = e4;
            cn1 = C24712CGy.A01;
            str = "InstantiationException";
        } catch (IllegalAccessException e5) {
            e = e5;
            cn1 = C24712CGy.A01;
            str = "IllegalAccessException";
        } catch (IllegalArgumentException e6) {
            e = e6;
            cn1 = C24712CGy.A01;
            str = "IllegalArgumentException";
        } catch (InvocationTargetException e7) {
            e = e7;
            cn1 = C24712CGy.A01;
            str = "InvocationTargetException";
        }
        C18070vi.A0d(c6v, 0);
        this.A0F = new C25522ChK(c6v);
        cn1.A05("sup:MediaStreamState", str, e);
        c6v = new C22812BQn(this);
        C18070vi.A0d(c6v, 0);
        this.A0F = new C25522ChK(c6v);
    }

    public static final C6B A01(BQm bQm) {
        return C25522ChK.A00(bQm.A0P, bQm, A0R, 0);
    }

    public static final void A02(BQm bQm, Throwable th) {
        AnonymousClass1OS r2;
        Object obj;
        C25522ChK chK;
        EEE[] eeeArr;
        int i;
        C6B A002;
        AnonymousClass1OS r1;
        C22951BWx bWx;
        C25845Cn1 cn1 = C24712CGy.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("handleError from state: ");
        cn1.A05("sup:MediaStreamState", AnonymousClass000.A0y(bQm.A03().A00(), A10), th);
        C22874BTj A003 = BNB.A00(bQm, th);
        C6B A032 = bQm.A03();
        if (C18070vi.A18(A032, bQm.A09())) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Handle SocketConnectionStateError from ");
            A102.append(bQm.A09());
            cn1.A06("sup:MediaStreamState", AnonymousClass000.A0y(" state", A102), (Throwable) null);
            if (th instanceof C24411C2j) {
                cn1.A02("sup:MediaStreamState", th.getMessage());
                r1 = bQm.A0N;
                bWx = ((C24411C2j) th).connectionError;
            } else {
                r2 = bQm.A0N;
                obj = new C22951BWx("BUG_MUST_FIX");
                r2.invoke(obj, A003);
                A002 = A01(bQm);
                bQm.A00.A03 = A002;
            }
        } else {
            if (bQm.A00.A06.intValue() == 0) {
                chK = bQm.A03;
                eeeArr = A0R;
                i = 7;
            } else {
                chK = bQm.A02;
                eeeArr = A0R;
                i = 6;
            }
            if (C18070vi.A18(A032, C25522ChK.A00(chK, bQm, eeeArr, i)) || C18070vi.A18(A032, bQm.A06()) || C18070vi.A18(A032, bQm.A0A())) {
                bQm.A0N.invoke(new C22953BWz("STREAMING_ERROR"), A003);
                return;
            } else if (C18070vi.A18(A032, A01(bQm))) {
                r2 = bQm.A0N;
                obj = new Object();
                r2.invoke(obj, A003);
                A002 = A01(bQm);
                bQm.A00.A03 = A002;
            } else {
                C25522ChK chK2 = bQm.A04;
                if (!C18070vi.A18(A032, C25522ChK.A00(chK2, bQm, eeeArr, 1)) || !(th instanceof C24410C2i)) {
                    bQm.A0N.invoke(new C22951BWx("BUG_MUST_FIX"), A003);
                    A002 = C25522ChK.A00(chK2, bQm, eeeArr, 1);
                    bQm.A00.A03 = A002;
                }
                cn1.A02("sup:MediaStreamState", th.getMessage());
                r1 = bQm.A0N;
                bWx = ((C24410C2i) th).connectionError;
            }
        }
        r1.invoke(bWx, A003);
        A002 = A01(bQm);
        bQm.A00.A03 = A002;
    }

    public final C6B A06() {
        C25522ChK chK;
        EEE[] eeeArr;
        int i;
        if (this.A00.A06.intValue() == 0) {
            chK = this.A06;
            eeeArr = A0R;
            i = 9;
        } else {
            chK = this.A05;
            eeeArr = A0R;
            i = 8;
        }
        return C25522ChK.A00(chK, this, eeeArr, i);
    }

    public final C6B A07() {
        C25522ChK chK;
        EEE[] eeeArr;
        int i;
        if (this.A00.A06.intValue() == 0) {
            chK = this.A08;
            eeeArr = A0R;
            i = 5;
        } else {
            chK = this.A07;
            eeeArr = A0R;
            i = 4;
        }
        return C25522ChK.A00(chK, this, eeeArr, i);
    }

    public final C6B A08() {
        C25522ChK chK;
        EEE[] eeeArr;
        int i;
        if (this.A00.A06.intValue() == 0) {
            chK = this.A0A;
            eeeArr = A0R;
            i = 3;
        } else {
            chK = this.A09;
            eeeArr = A0R;
            i = 2;
        }
        return C25522ChK.A00(chK, this, eeeArr, i);
    }

    public final C6B A09() {
        C25522ChK chK;
        EEE[] eeeArr;
        int i;
        if (this.A00.A06.intValue() == 0) {
            chK = this.A0C;
            eeeArr = A0R;
            i = 13;
        } else {
            chK = this.A0B;
            eeeArr = A0R;
            i = 12;
        }
        return C25522ChK.A00(chK, this, eeeArr, i);
    }

    public final C6B A0A() {
        C25522ChK chK;
        EEE[] eeeArr;
        int i;
        if (this.A00.A06.intValue() == 0) {
            chK = this.A0E;
            eeeArr = A0R;
            i = 11;
        } else {
            chK = this.A0D;
            eeeArr = A0R;
            i = 10;
        }
        return C25522ChK.A00(chK, this, eeeArr, i);
    }

    public final void A0B(C24474C5p c5p) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error: ");
        A10.append(c5p.A00());
        StringBuilder A0u = BE6.A0u(AnonymousClass000.A0y(" -- DUMP STATE:\n\t", A10));
        A05(A0u);
        C24712CGy.A01.A06("sup:MediaStreamState", A0u.toString(), (Throwable) null);
        this.A0N.invoke(c5p, BNB.A00(this, new Exception()));
    }

    public final void A0C(C24474C5p c5p, Throwable th, boolean z) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Connection Step Failure - Error: ");
        A10.append(c5p.A00());
        StringBuilder A0u = BE6.A0u(AnonymousClass000.A0y(" -- DUMP STATE:\n\t", A10));
        A05(A0u);
        C24712CGy.A01.A06("sup:MediaStreamState", A0u.toString(), (Throwable) null);
        AnonymousClass1OS r1 = this.A0N;
        if (th == null) {
            th = new Exception();
        }
        r1.invoke(c5p, BNB.A00(this, th));
        if (z) {
            A04(new BXQ(c5p));
        }
    }

    public final void A0F(C18090vk r2) {
        Object obj;
        try {
            obj = r2.invoke();
        } catch (Throwable th) {
            obj = C108945cZ.A1J(th);
        }
        Throwable A002 = C30671eK.A00(obj);
        if (A002 != null) {
            A02(this, A002);
        }
    }
}
