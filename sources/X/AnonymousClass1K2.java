package X;

import android.app.Activity;
import android.util.Range;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.calling.header.CallHeaderStateHolder;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallery.NewMediaPickerFragment;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.productinfra.music.publishing.MusicPublishing;
import com.whatsapp.registration.RegistrationUpsellProtocolHelper;
import com.whatsapp.registration.upsell.RegistrationUpsellGraphQLHelper;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import com.whatsapp.status.playback.avatar.AvatarReactionRepository;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.xfamily.accountlinking.auth.webauth.WebAuthAccessTokenFetcher;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.1K2  reason: invalid class name */
public final class AnonymousClass1K2 implements AnonymousClass00S {
    public final AnonymousClass1K1 A00;
    public final AnonymousClass10E A01;
    public final int A02;
    public final C24331Jt A03;

    public AnonymousClass1K2(AnonymousClass1K1 r1, C24331Jt r2, AnonymousClass10E r3, int i) {
        this.A01 = r3;
        this.A03 = r2;
        this.A00 = r1;
        this.A02 = i;
    }

    public static AnonymousClass1FL A02(Activity activity) {
        try {
            return (AnonymousClass1FL) activity;
        } catch (ClassCastException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected activity to be a FragmentActivity: ");
            sb.append(activity);
            throw new IllegalStateException(sb.toString(), e);
        }
    }

    public static C106685Wu A05(C18140vp r1) {
        C18070vi.A0d(r1, 0);
        Object obj = r1.get();
        C18070vi.A0X(obj);
        C106685Wu r0 = (C106685Wu) obj;
        AnonymousClass00W.A02(r0);
        return r0;
    }

    public static C108355bZ A06(C18030ve r1, C18140vp r2, C18140vp r3) {
        Object obj;
        C18070vi.A0d(r1, 0);
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        if (r1.A0N(7072)) {
            obj = r3.get();
        } else {
            obj = r2.get();
        }
        C18070vi.A0X(obj);
        C108355bZ r0 = (C108355bZ) obj;
        AnonymousClass00W.A02(r0);
        return r0;
    }

    public static C95644mZ A08(C219117w r2, C18140vp r3) {
        Object obj;
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r3, 1);
        Class<C95644mZ> cls = C95644mZ.class;
        if (r2.A00.containsKey(cls)) {
            obj = r2.A01(cls);
        } else {
            obj = r3.get();
            C18070vi.A0b(obj);
        }
        C95644mZ r0 = (C95644mZ) obj;
        AnonymousClass00W.A02(r0);
        return r0;
    }

    public static C143857Fb A0M(C219117w r2, C18140vp r3) {
        Object obj;
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r3, 1);
        Class<C143857Fb> cls = C143857Fb.class;
        if (r2.A00.containsKey(cls)) {
            obj = r2.A01(cls);
        } else {
            obj = r3.get();
            C18070vi.A0b(obj);
        }
        C143857Fb r0 = (C143857Fb) obj;
        AnonymousClass00W.A02(r0);
        return r0;
    }

    private Object A0N() {
        int i;
        int i2 = this.A02;
        switch (i2) {
            case 0:
                AnonymousClass10G A11 = this.A01.A00;
                return new C20005A2v((C191899nN) A11.A7i.get(), (C190299kh) A11.A7j.get());
            case 1:
                return new AnonymousClass4SD();
            case 2:
                return new C52682bJ((C18030ve) this.A01.A04.get());
            case 3:
                return new C131296kr(this);
            case 4:
                return new C85884Pc(this);
            case 5:
                return new C56472hW(this);
            case 6:
                AnonymousClass10E r1 = this.A01;
                AnonymousClass11S r7 = (AnonymousClass11S) r1.A63.get();
                AnonymousClass1M9 r8 = (AnonymousClass1M9) r1.A2f.get();
                C18000vb r11 = (C18000vb) r1.ABz.get();
                AnonymousClass11C r10 = (AnonymousClass11C) r1.AAp.get();
                C24921Me r9 = (C24921Me) r1.ABX.get();
                AnonymousClass00H A002 = C000200d.A00(r1.AAd);
                return new C95074le((AnonymousClass1KB) r1.A4b.get(), r7, r8, r9, r10, r11, (C32091gc) r1.A6G.get(), (C18010vc) r1.A9s.get(), (AnonymousClass10I) r1.AC1.get(), A002, C000200d.A00(r1.A0s), C000200d.A00(r1.A5R), C000200d.A00(r1.AP1), C000200d.A00(r1.A13), C000200d.A00(r1.A04));
            case 7:
                AnonymousClass10E r12 = this.A01;
                AnonymousClass18K r112 = (AnonymousClass18K) r12.A9B.get();
                C26811To r72 = (C26811To) r12.AAf.get();
                C33251iW r6 = (C33251iW) r12.ABA.get();
                AnonymousClass00H A003 = C000200d.A00(r12.A6V);
                AnonymousClass10G A112 = r12.A00;
                C88104Yi r92 = (C88104Yi) A112.AFS.get();
                return new C79493vW(r6, r72, (C56812i4) A112.AHU.get(), r92, (C18030ve) r12.A04.get(), r112, (C88174Yp) r12.AP1.get(), (AnonymousClass10I) r12.AC1.get(), A003);
            case 8:
                AnonymousClass10E r13 = this.A01;
                AnonymousClass1M9 r73 = (AnonymousClass1M9) r13.A2f.get();
                C23631Ha A012 = C19880zA.A01(r13.A13.get());
                AnonymousClass00H A004 = C000200d.A00(r13.AP1);
                return new C79813w4(A012, r73, (C18030ve) r13.A04.get(), (AnonymousClass10I) r13.AC1.get(), (AnonymousClass1PV) r13.ABp.get(), A004, C000200d.A00(r13.A0s));
            case 9:
                AnonymousClass10E r14 = this.A01;
                return new C79783w1((AnonymousClass1L9) r14.A0E.get(), (C33251iW) r14.ABA.get(), this.A00.A1p(), C000200d.A00(r14.AAd), C000200d.A00(r14.AP1));
            case 10:
                AnonymousClass10E r15 = this.A01;
                AnonymousClass1CJ r82 = (AnonymousClass1CJ) r15.A2H.get();
                return new C48992Ot((AnonymousClass1L9) r15.A0E.get(), (AnonymousClass1KB) r15.A4b.get(), r82, (C25181Nf) r15.A2o.get(), (AnonymousClass6GM) r15.A00.AE1.get(), (AnonymousClass10I) r15.AC1.get());
            case 11:
                AnonymousClass10E r2 = this.A01;
                return new C27045DQq((AnonymousClass1L9) r2.A0E.get(), (AnonymousClass1CJ) r2.A2H.get());
            case 12:
                AnonymousClass10E r16 = this.A01;
                return new C696938e((AnonymousClass1L9) r16.A0E.get(), (AnonymousClass1KB) r16.A4b.get(), (C25181Nf) r16.A2o.get(), (AnonymousClass6GM) r16.A00.AE1.get(), (AnonymousClass10I) r16.AC1.get());
            case 13:
                AnonymousClass10E r3 = this.A01;
                return new C27046DQr((AnonymousClass1KB) r3.A4b.get(), (AnonymousClass11C) r3.AAp.get(), (AnonymousClass1CJ) r3.A2H.get());
            case 14:
                AnonymousClass10E r22 = this.A01;
                return new C27044DQp((AnonymousClass1L9) r22.A0E.get(), (C33251iW) r22.AB9.get());
            case 15:
                AnonymousClass10E r17 = this.A01;
                AnonymousClass1CJ r83 = (AnonymousClass1CJ) r17.A2H.get();
                return new C48982Os((AnonymousClass1L9) r17.A0E.get(), (AnonymousClass1KB) r17.A4b.get(), r83, (C25181Nf) r17.A2o.get(), (AnonymousClass6GM) r17.A00.AE1.get(), (AnonymousClass10I) r17.AC1.get());
            case 16:
                AnonymousClass10E r32 = this.A01;
                AnonymousClass1CJ r18 = (AnonymousClass1CJ) r32.A2H.get();
                return new C79383vL((AnonymousClass11P) r32.AAv.get(), r18, (C87794Wz) r32.A00.ADP.get());
            case 17:
                AnonymousClass10E r19 = this.A01;
                return new C79483vV((AnonymousClass1KB) r19.A4b.get(), (C26811To) r19.AAf.get(), (C18030ve) r19.A04.get(), (C88174Yp) r19.AP1.get(), (C28531aO) r19.AjI.get(), (AnonymousClass10I) r19.AC1.get(), C000200d.A00(r19.A0s));
            case 18:
                AnonymousClass10E r23 = this.A01;
                return new C79763vz((AnonymousClass1L9) r23.A0E.get(), (AnonymousClass1CJ) r23.A2H.get());
            case 19:
                AnonymousClass10E r110 = this.A01;
                AnonymousClass00H A005 = C000200d.A00(r110.AAd);
                AnonymousClass00H A006 = C000200d.A00(r110.Aaz);
                return new C95094lg(C19880zA.A00(), (AnonymousClass1KB) r110.A4b.get(), (AnonymousClass18O) r110.A9p.get(), (AnonymousClass1c4) r110.A7C.get(), A005, A006, C000200d.A00(r110.AN9));
            case 20:
                AnonymousClass10E r111 = this.A01;
                AnonymousClass1KB r62 = (AnonymousClass1KB) r111.A4b.get();
                C33251iW r74 = (C33251iW) r111.ABA.get();
                AnonymousClass00H A007 = C000200d.A00(r111.AdQ);
                AnonymousClass00H A008 = C000200d.A00(r111.AdN);
                return new C79873wA(r62, r74, (AnonymousClass1WF) r111.A6J.get(), (C18030ve) r111.A04.get(), (C62262r7) r111.A8S.get(), (AnonymousClass10I) r111.AC1.get(), A007, A008, C000200d.A00(r111.ABc), C000200d.A00(r111.A0s));
            case 21:
                AnonymousClass10E r113 = this.A01;
                C33251iW r63 = (C33251iW) r113.ABA.get();
                AnonymousClass00H A009 = C000200d.A00(r113.AdQ);
                AnonymousClass00H A0010 = C000200d.A00(r113.A0s);
                return new C79833w6(r63, (AnonymousClass11P) r113.AAv.get(), (C62262r7) r113.A8S.get(), (AnonymousClass10I) r113.AC1.get(), A009, A0010);
            case 22:
                AnonymousClass1K1 r114 = this.A00;
                AnonymousClass10E r24 = this.A01;
                AnonymousClass00H A0011 = C000200d.A00(r24.A2H);
                C79853w8 A0012 = AnonymousClass3BJ.A00((AnonymousClass1KB) r24.A4b.get(), (AnonymousClass11S) r24.A63.get(), (AnonymousClass1M9) r24.A2f.get(), (AnonymousClass12L) r24.A90.get(), (C36451nu) r24.A0G.get(), A0011, C000200d.A00(r24.AAd), C000200d.A00(r24.A0F), C000200d.A00(r24.A4t), C000200d.A00(r24.A8r));
                r114.A8y(A0012);
                return A0012;
            case 23:
                AnonymousClass10E r25 = this.A01;
                return new C79753vy((C32861hs) r25.Agw.get(), (C32431hB) r25.A66.get());
            case 24:
                AnonymousClass10E r26 = this.A01;
                return new AnonymousClass3ve((C33251iW) r26.ABA.get(), (C88104Yi) r26.A00.AFS.get());
            case 25:
                AnonymousClass10E r115 = this.A01;
                AnonymousClass1L9 r64 = (AnonymousClass1L9) r115.A0E.get();
                AnonymousClass00H A0013 = C000200d.A00(r115.A2H);
                AnonymousClass1M9 r75 = (AnonymousClass1M9) r115.A2f.get();
                AnonymousClass00H A0014 = C000200d.A00(r115.AAd);
                AnonymousClass1MZ r93 = (AnonymousClass1MZ) r115.A4t.get();
                return new C79803w3(r64, r75, r115.A00.A40(), r93, (AnonymousClass12L) r115.A90.get(), A0013, A0014);
            case 26:
                AnonymousClass10E r27 = this.A01;
                return new C79883wB((C33251iW) r27.ABA.get(), (C88104Yi) r27.A00.AFS.get());
            case 27:
                AnonymousClass10E r4 = this.A01;
                return new C95104lh((C18030ve) r4.A04.get(), C000200d.A00(r4.AVb), C000200d.A00(r4.AmD), C000200d.A00(r4.A00.A5j));
            case 28:
                AnonymousClass10E r33 = this.A01;
                return new AnonymousClass1LE((C19830z4) r33.ABl.get(), (C18030ve) r33.A04.get(), (AnonymousClass1DC) r33.A95.get());
            case 29:
                AnonymousClass10E r28 = this.A01;
                return new C38581rX((C38791rt) r28.AFu.get(), (C18030ve) r28.A04.get());
            case 30:
                return new C27241Vh(this);
            case 31:
                AnonymousClass10E r34 = this.A01;
                return new C139376yj((C18030ve) r34.A04.get(), (AnonymousClass18K) r34.A9B.get(), C000200d.A00(r34.A00.A0i));
            case 32:
                return new C51252Xo(this);
            case 33:
                return new AnonymousClass380(this, 0);
            case 34:
                return new C131326ku(this);
            case 35:
                return new AnonymousClass2Y5(this);
            case 36:
                return new AnonymousClass2Y8(this);
            case 37:
                return new AnonymousClass6ZJ(this);
            case 38:
                return C199410f.copyOf((Collection) A0U());
            case 39:
                return new C51072Ww(this);
            case 40:
                return new C61842qN(this);
            case 41:
                return new C51092Wy(this);
            case 42:
                return new C51102Wz(this);
            case 43:
                return new AnonymousClass2X2(this);
            case 44:
                return new AnonymousClass2X3(this);
            case 45:
                AnonymousClass10E r35 = this.A01;
                return new AnonymousClass6nA(C000200d.A00(r35.A00.A3D), (C18600wl) r35.A9E.get(), (AnonymousClass1OX) r35.A9C.get());
            case 46:
                AnonymousClass10E r116 = this.A01;
                AnonymousClass1CJ r94 = (AnonymousClass1CJ) r116.A2H.get();
                AnonymousClass1L9 r65 = (AnonymousClass1L9) r116.A0E.get();
                AnonymousClass00H A0015 = C000200d.A00(r116.A6N);
                AnonymousClass122 r102 = (AnonymousClass122) r116.A2y.get();
                AnonymousClass00H A0016 = C000200d.A00(r116.ABh);
                return new C61742qB(r65, (AnonymousClass11P) r116.AAv.get(), (C19830z4) r116.ABl.get(), r94, r102, (C18030ve) r116.A04.get(), (AnonymousClass1LU) r116.ABd.get(), (AnonymousClass1PQ) r116.AAn.get(), A0015, A0016);
            case 47:
                AnonymousClass10E r117 = this.A01;
                AnonymousClass1VW r84 = (AnonymousClass1VW) r117.A2d.get();
                C18000vb r122 = (C18000vb) r117.ABz.get();
                AnonymousClass00H A0017 = C000200d.A00(r117.A08);
                AnonymousClass00H A0018 = C000200d.A00(r117.A62);
                C19830z4 r118 = (C19830z4) r117.ABl.get();
                AnonymousClass00H A0019 = C000200d.A00(r117.A0B);
                return new C59852mz((AnonymousClass1KB) r117.A4b.get(), (AnonymousClass11S) r117.A63.get(), r84, (C27191Vc) r117.A2i.get(), (AnonymousClass118) r117.ABY.get(), r118, r122, (AnonymousClass10I) r117.AC1.get(), A0017, A0018, A0019);
            case 48:
                return new C27261Vj(this);
            case 49:
                AnonymousClass10E r5 = this.A01;
                return new C38721rm((AnonymousClass11P) r5.AAv.get(), (C19830z4) r5.ABl.get(), (C18030ve) r5.A04.get(), (AnonymousClass1LE) this.A00.A0F.get());
            case 50:
                AnonymousClass10E r42 = this.A01;
                return new C38751rp((C38731rn) r42.A6o.get(), C000200d.A00(r42.A12), C000200d.A00(r42.A14), C000200d.A00(r42.A0K));
            case 51:
                AnonymousClass10E r43 = this.A01;
                AnonymousClass1QD r29 = (AnonymousClass1QD) r43.A89.get();
                AnonymousClass1QO r119 = (AnonymousClass1QO) r43.A8G.get();
                return new C36871ob((AnonymousClass1QR) r43.A8D.get(), r29, r119, (AnonymousClass10I) r43.AC1.get());
            case 52:
                AnonymousClass10E r36 = this.A01;
                return new C54552eK((AnonymousClass10I) r36.AC1.get(), C000200d.A00(r36.A04), C000200d.A00(r36.AFD));
            case 53:
                return new AnonymousClass6ZM(this);
            case 54:
                return new AnonymousClass6ZN(this);
            case 55:
                return new C56382hN(this);
            case 56:
                AnonymousClass10E r0 = this.A01;
                AnonymousClass10G A113 = r0.A00;
                CXN A2R = A113.A2Q();
                C65812x9 r85 = (C65812x9) A113.AFQ.get();
                C25545Chi chi = (C25545Chi) A113.AFf.get();
                C185219cE r132 = new C185219cE();
                CMC AEC = A113.AEA();
                return new C133096oA(A113.A25(), chi, r85, (C19995A2i) r0.A0y.get(), A2R, (C24970CRu) A113.AJ1.get(), AEC, r132);
            case 57:
                return new C87824Xf(this.A00.A04());
            case 58:
                AnonymousClass10E r120 = this.A01;
                AnonymousClass11S r66 = (AnonymousClass11S) r120.A63.get();
                AnonymousClass00S AQZ = r120.A0V;
                AnonymousClass00H A0020 = C000200d.A00(this.A00.A05);
                AnonymousClass00S AOv = r120.A0W;
                return new AnonymousClass73V(r66, (AnonymousClass11P) r120.AAv.get(), (C18030ve) r120.A04.get(), A0020, C000200d.A00(r120.ADu), C000200d.A00(r120.ABd), AQZ, AOv, r120.A0R);
            case 59:
                return new C125546bF();
            case 60:
                AnonymousClass10E r121 = this.A01;
                AnonymousClass1OZ r86 = (AnonymousClass1OZ) r121.A6N.get();
                return new C48232Lr((AnonymousClass1M9) r121.A2f.get(), (C19830z4) r121.ABl.get(), r86, new C60452o3(), (AnonymousClass10I) r121.AC1.get());
            case 61:
                AnonymousClass10E r123 = this.A01;
                AnonymousClass181 r67 = (AnonymousClass181) r123.AA9.get();
                AnonymousClass129 r1110 = (AnonymousClass129) r123.A4I.get();
                return new C58712l8(r67, (C18000vb) r123.ABz.get(), (C134036pu) r123.A00.AB8.get(), (AnonymousClass1D9) r123.A0n.get(), (AnonymousClass1LU) r123.ABd.get(), r1110, (AnonymousClass10I) r123.AC1.get());
            case 62:
                AnonymousClass10E r37 = this.A01;
                return new AnonymousClass4QR((C18030ve) r37.A04.get(), (AnonymousClass12L) r37.A90.get(), (AnonymousClass1MB) r37.AAb.get());
            case 63:
                return new C65932xL(this, 0);
            case 64:
                return new C66302xx(this, 0);
            case 65:
                AnonymousClass10E r38 = this.A01;
                return new C190429kv((C26911Ty) r38.A1J.get(), (C18030ve) r38.A04.get(), C000200d.A00(r38.A1r));
            case 66:
                return new C182479Un(this);
            case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                return new C196469v7();
            case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER /*68*/:
                AnonymousClass10E r39 = this.A01;
                return new C185479ce((C26911Ty) r39.A1J.get(), (AnonymousClass1PM) r39.ABM.get(), (C18030ve) r39.A04.get());
            case 69:
                return new C182489Uo(this);
            case 70:
                return new C56412hQ(this);
            case 71:
                return new C182499Up(this);
            case 72:
                return new C182509Uq(this);
            case 73:
                return new C182519Ur(this);
            case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                return new C56452hU(this);
            case C166418cr.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                AnonymousClass10E r310 = this.A01;
                return new A78((AnonymousClass11S) r310.A63.get(), (C24751Ln) r310.ABe.get(), C000200d.A00(r310.ABc));
            case C166418cr.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                return new A41((A8Q) this.A01.A1p.get());
            case C166418cr.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                AnonymousClass10E r44 = this.A01;
                return new C61552ps((AnonymousClass11S) r44.A63.get(), (C18030ve) r44.A04.get(), (AnonymousClass18K) r44.A9B.get(), (AnonymousClass10I) r44.AC1.get());
            case C166418cr.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                return new C182549Uu(this);
            case 79:
                return new AnonymousClass9V3(this);
            case C166418cr.PLACEHOLDER_MESSAGE_FIELD_NUMBER /*80*/:
                return new AnonymousClass9VC(this);
            case 81:
                return new C51112Xa(this);
            case C166418cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                return new C131316kt(this);
            case C166418cr.ALBUM_MESSAGE_FIELD_NUMBER /*83*/:
                AnonymousClass1K1 r210 = this.A00;
                return new C127206dy((C124796Zs) r210.A8P.get(), (C131206ki) r210.A8Q.get());
            case 84:
                return new C124796Zs(this);
            case C166418cr.EVENT_COVER_IMAGE_FIELD_NUMBER /*85*/:
                i = 2;
                break;
            case C166418cr.STICKER_PACK_MESSAGE_FIELD_NUMBER /*86*/:
                AnonymousClass1K1 r211 = this.A00;
                return new C127196dx((C124806Zt) r211.A8R.get(), (C131206ki) r211.A8S.get());
            case C166418cr.STATUS_MENTION_MESSAGE_FIELD_NUMBER /*87*/:
                return new C124806Zt(this);
            case C166418cr.POLL_RESULT_SNAPSHOT_MESSAGE_FIELD_NUMBER /*88*/:
                i = 3;
                break;
            case 89:
                AnonymousClass1K1 r212 = this.A00;
                return new C127186dw((C124816Zu) r212.A8T.get(), (C131206ki) r212.A8U.get());
            case 90:
                return new C124816Zu(this);
            case C166418cr.ASSOCIATED_CHILD_MESSAGE_FIELD_NUMBER /*91*/:
                i = 4;
                break;
            case C166418cr.GROUP_STATUS_MENTION_MESSAGE_FIELD_NUMBER /*92*/:
                AnonymousClass1K1 r213 = this.A00;
                return new C127216dz((C124826Zv) r213.A8V.get(), (C131206ki) r213.A8W.get());
            case C166418cr.POLL_CREATION_MESSAGE_V4_FIELD_NUMBER /*93*/:
                return new C124826Zv(this);
            case C166418cr.POLL_CREATION_MESSAGE_V5_FIELD_NUMBER /*94*/:
                i = 5;
                break;
            case 95:
                return new C124836Zw(this);
            case 96:
                i = 6;
                break;
            case 97:
                AnonymousClass1K1 r311 = this.A00;
                return new C128416fx((C124846Zx) r311.A8X.get(), (C127236e1) r311.A4I.get(), (C131206ki) r311.A8Y.get());
            case 98:
                return new C124846Zx(this);
            case 99:
                return new AnonymousClass2JB();
            default:
                throw new AssertionError(i2);
        }
        return new C172218t4(this, i);
    }

    private Object A0O() {
        int i = this.A02;
        switch (i) {
            case 100:
                return new C1189666e();
            case 101:
                return new C172218t4(this, 7);
            case 102:
                AnonymousClass10E r1 = this.A01;
                return new C127236e1((AnonymousClass11P) r1.AAv.get(), (C19830z4) r1.ABl.get());
            case 103:
                Activity A002 = this.A00.AAO;
                AnonymousClass10E r12 = this.A01;
                return new AnonymousClass73Z(A002, C19880zA.A00(), (C25721Pj) r12.A10.get(), C000200d.A00(r12.A9B), C000200d.A00(r12.A14));
            case 104:
                AnonymousClass10E r9 = this.A01;
                AnonymousClass1D9 r14 = (AnonymousClass1D9) r9.A0n.get();
                AnonymousClass1LU r15 = (AnonymousClass1LU) r9.ABd.get();
                AnonymousClass10I r16 = (AnonymousClass10I) r9.AC1.get();
                return new AnonymousClass6AT((C218617r) r9.A8v.get(), (AnonymousClass1KB) r9.A4b.get(), (C34531kd) r9.A9m.get(), (AnonymousClass181) r9.AA9.get(), (AnonymousClass118) r9.ABY.get(), r14, r15, r16, C000200d.A00(r9.A00.ADW));
            case 105:
                AnonymousClass10E r7 = this.A01;
                AnonymousClass6AR r122 = (AnonymousClass6AR) this.A00.A4r.get();
                return new AnonymousClass6AS((C36361nl) r7.A5h.get(), (C33251iW) r7.ABA.get(), (AnonymousClass118) r7.ABY.get(), (C18000vb) r7.ABz.get(), (AnonymousClass1LU) r7.ABd.get(), r122, C000200d.A00(r7.A00.ADW));
            case 106:
                AnonymousClass10E r13 = this.A01;
                return new AnonymousClass6AR((C33251iW) r13.ABA.get(), (AnonymousClass11C) r13.AAp.get(), (AnonymousClass118) r13.ABY.get(), (AnonymousClass1KW) r13.A3d.get(), (AnonymousClass1LU) r13.ABd.get(), (C18010vc) r13.A9s.get());
            case 107:
                AnonymousClass10E r5 = this.A01;
                return new AnonymousClass6AQ((AnonymousClass1L9) r5.A0E.get(), (C18000vb) r5.ABz.get(), (AnonymousClass6AR) this.A00.A4r.get(), C000200d.A00(r5.A00.ADW));
            case AnonymousClass74N.A03 /*108*/:
                AnonymousClass10E r8 = this.A01;
                AnonymousClass10G A11 = r8.A00;
                AnonymousClass00H A003 = C000200d.A00(r8.A4U);
                C18030ve r10 = (C18030ve) r8.A04.get();
                C36401np r11 = (C36401np) A11.A30.get();
                return new A0K((AnonymousClass1L9) r8.A0E.get(), (AnonymousClass1KB) r8.A4b.get(), (AnonymousClass1LC) A11.A5B.get(), (AnonymousClass11C) r8.AAp.get(), (AnonymousClass19D) r8.A02.get(), r10, r11, A003, C000200d.A00(r8.A2n));
            case 109:
                AnonymousClass10E r2 = this.A01;
                return new A04((AnonymousClass11C) r2.AAp.get(), (C19830z4) r2.ABl.get(), (AnonymousClass19D) r2.A02.get(), (AnonymousClass1CM) r2.A9V.get(), AnonymousClass1K1.A1j(this.A00));
            case 110:
                return new C56482hX(this);
            case 111:
                return new C51132Xc(this);
            case 112:
                return new C51142Xd(this);
            case 113:
                AnonymousClass10E r17 = this.A01;
                return new AAB((AnonymousClass1RB) r17.AUE.get(), (AnonymousClass1KB) r17.A4b.get(), (AnonymousClass118) r17.ABY.get(), (C18000vb) r17.ABz.get(), (AnonymousClass10I) r17.AC1.get());
            case 114:
                return new C51152Xe(this);
            case 115:
                return new C51162Xf(this);
            case 116:
                return new C51172Xg(this);
            case 117:
                return new C51182Xh(this);
            case 118:
                return new C51192Xi(this);
            case 119:
                return new C51202Xj(this);
            case 120:
                return new C51212Xk(this);
            case 121:
                return new C51222Xl(this);
            case 122:
                return new C51232Xm(this);
            case 123:
                return new C51242Xn(this);
            case 124:
                return new C51262Xp(this);
            case 125:
                return new C51272Xq(this);
            case 126:
                return new C51282Xr(this);
            case StringTreeSet.OFFSET_BASE_ENCODING /*127*/:
                return new C51292Xs(this);
            case 128:
                return new C51302Xt(this);
            case 129:
                return new C51312Xu(this);
            case 130:
                return new C51322Xv(this);
            case 131:
                return new C51332Xw(this);
            case 132:
                return new C51342Xx(this);
            case 133:
                return new C51352Xy(this);
            case 134:
                return new C51362Xz(this);
            case 135:
                return new AnonymousClass2Y0(this);
            case 136:
                return new AnonymousClass2Y1(this);
            case 137:
                return new AnonymousClass2Y2(this);
            case 138:
                return new AnonymousClass2Y3(this);
            case 139:
                return new AnonymousClass2Y4(this);
            case 140:
                return new AnonymousClass9VF(this);
            case 141:
                return new C20538AOx(this, 0);
            case 142:
                return new C20539AOy(this, 0);
            case 143:
                return new C66432yA(this, 0);
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                return new C20534AOt(this, 0);
            case 145:
                return new AWK(this, 0);
            case 146:
                return new C20533AOs(this, 0);
            case 147:
                return new C20537AOw(this, 0);
            case 148:
                return new C20535AOu(this, 0);
            case 149:
                return new C20536AOv(this, 0);
            case 150:
                return new C20532AOr(this, 0);
            case 151:
                return new C66452yC(this, 0);
            case 152:
                return new APL(this, 0);
            case 153:
                return new C66442yB(this, 0);
            case 154:
                AnonymousClass10E r3 = this.A01;
                AnonymousClass00H A004 = C000200d.A00(r3.A5j);
                return new C36721oM((AnonymousClass11C) r3.AAp.get(), (C18030ve) r3.A04.get(), AnonymousClass10E.AKP(r3), A004, C000200d.A00(r3.A2n));
            case 155:
                return new C25491Cgm((AnonymousClass18K) this.A01.A9B.get());
            case 156:
                return new C36941oi(this);
            case 157:
                return new C84504Jt(this);
            case 158:
                return new C84514Ju(this);
            case 159:
                return new C84524Jv(this);
            case 160:
                return new C84534Jw(this);
            case 161:
                AnonymousClass10E r18 = this.A01;
                AnonymousClass00H A005 = C000200d.A00(r18.A6N);
                C18030ve r102 = (C18030ve) r18.A04.get();
                AnonymousClass10I r112 = (AnonymousClass10I) r18.AC1.get();
                return new C133146oF((AnonymousClass1LA) r18.AeS.get(), (AnonymousClass11S) r18.A63.get(), (AnonymousClass11E) r18.A2X.get(), (AnonymousClass1M9) r18.A2f.get(), (C678831f) r18.A00.A10.get(), r102, r112, A005);
            case 162:
                AnonymousClass10E r19 = this.A01;
                C37291pH r162 = (C37291pH) r19.A8f.get();
                AnonymousClass11C r172 = (AnonymousClass11C) r19.AAp.get();
                AnonymousClass11P r182 = (AnonymousClass11P) r19.AAv.get();
                C219217x r192 = (C219217x) r19.ABj.get();
                C19830z4 r20 = (C19830z4) r19.ABl.get();
                C18030ve r21 = (C18030ve) r19.A04.get();
                C37291pH r22 = r162;
                return new C37311pJ((AnonymousClass1KB) r19.A4b.get(), (AnonymousClass11S) r19.A63.get(), (C26811To) r19.AAf.get(), (AnonymousClass12E) r19.A2k.get(), (C33821jR) r19.AHQ.get(), r172, r182, r192, r20, r21, r22, (C33501iv) r19.A8d.get(), (C37301pI) r19.A00.A3I.get(), (AnonymousClass10I) r19.AC1.get(), (C18600wl) r19.A9E.get(), (AnonymousClass1OX) r19.A9C.get());
            case 163:
                AnonymousClass10E r6 = this.A01;
                AnonymousClass00H A006 = C000200d.A00(r6.A8W);
                return new C132966nw((AnonymousClass1KB) r6.A4b.get(), (AnonymousClass1VP) r6.A1l.get(), (AnonymousClass11E) r6.A2X.get(), (C18030ve) r6.A04.get(), A006, C000200d.A00(r6.ABd), C000200d.A00(this.A00.A9T));
            case 164:
                return C201110w.of("calllink", this.A01.A00.A2v());
            case 165:
                return new C84544Jx(this);
            case 166:
                return new C84554Jy(this);
            case 167:
                return new AnonymousClass2Y6(this);
            case 168:
                return new AnonymousClass2Y7(this);
            case 169:
                return new C92574hY(this, 0);
            case 170:
                AnonymousClass10E r212 = this.A01;
                AnonymousClass118 r202 = (AnonymousClass118) r212.ABY.get();
                AnonymousClass11P r193 = (AnonymousClass11P) r212.AAv.get();
                C24771Lp r183 = (C24771Lp) r212.A0o.get();
                C18030ve r173 = (C18030ve) r212.A04.get();
                C23661Hd A85 = AnonymousClass10E.A84(r212);
                AnonymousClass1K1 r0 = this.A00;
                AnonymousClass00H A007 = C000200d.A00(r0.A4e);
                AnonymousClass00H A008 = C000200d.A00(r212.A14);
                AnonymousClass00H A009 = C000200d.A00(r212.A12);
                AnonymousClass00H A0010 = C000200d.A00(r0.A4Z);
                AnonymousClass00H A0011 = C000200d.A00(r0.A4Y);
                AnonymousClass10G A112 = r212.A00;
                AnonymousClass00H A0012 = C000200d.A00(A112.ADC);
                AnonymousClass11P r25 = r193;
                AnonymousClass118 r26 = r202;
                C19830z4 r27 = (C19830z4) r212.ABl.get();
                C18000vb r28 = (C18000vb) r212.ABz.get();
                C18030ve r30 = r173;
                C18010vc r31 = (C18010vc) r212.A9s.get();
                AnonymousClass10I r32 = (AnonymousClass10I) r212.AC1.get();
                AnonymousClass1VT r33 = (AnonymousClass1VT) r212.A1X.get();
                C27251Vi r194 = (C27251Vi) A112.A0q.get();
                C136596u4 r203 = (C136596u4) r0.A6S.get();
                AnonymousClass731 r213 = (AnonymousClass731) A112.A7e.get();
                C1408973m r222 = (C1408973m) A112.A7g.get();
                C88184Yq r23 = (C88184Yq) A112.A15.get();
                AnonymousClass11C r24 = (AnonymousClass11C) r212.AAp.get();
                return new C133276oU((C218617r) r212.A8v.get(), (AnonymousClass1KB) r212.A4b.get(), (AnonymousClass2PB) r212.AA4.get(), r183, (AnonymousClass1HS) r212.A98.get(), r194, r203, r213, r222, r23, r24, r25, r26, r27, r28, A85, r30, r31, r32, r33, A007, A008, A009, A0010, A0011, A0012, C000200d.A00(A112.AD9), C000200d.A00(r212.AAB));
            case 171:
                AnonymousClass10E r110 = this.A01;
                return new C139176yM((AnonymousClass190) r110.A31.get(), (AnonymousClass11C) r110.AAp.get(), (C219217x) r110.ABj.get(), (C18030ve) r110.A04.get(), (WamediaManager) r110.ABs.get(), (AnonymousClass1Q5) r110.A8O.get());
            case 172:
                AnonymousClass10E r111 = this.A01;
                AnonymousClass00H A0013 = C000200d.A00(r111.AYd);
                return new C136596u4((AnonymousClass11C) r111.AAp.get(), (C18030ve) r111.A04.get(), (AnonymousClass10I) r111.AC1.get(), A0013);
            case 173:
                AnonymousClass10E r113 = this.A01;
                return new CX2((CQP) r113.ASt.get(), (CQQ) r113.A0X.get(), (AnonymousClass11P) r113.AAv.get());
            case 174:
                AnonymousClass10E r114 = this.A01;
                return new CX1((CQP) r114.ASt.get(), (CQQ) r114.A0X.get(), (AnonymousClass11P) r114.AAv.get());
            case 175:
                GalleryTabHostFragment A0K = A0K();
                A0V(A0K);
                return A0K;
            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                AnonymousClass10E r29 = this.A01;
                return new C132996o0(C000200d.A00(r29.AAv), C000200d.A00(r29.ABd), C000200d.A00(r29.A04), C000200d.A00(this.A00.A0v));
            case 177:
                return new C137826w5(C000200d.A00(this.A01.ABd));
            case 178:
                AnonymousClass10E r210 = this.A01;
                return new C129956ie(C000200d.A00(r210.A04), C000200d.A00(r210.A4b), C000200d.A00(r210.A6N), C000200d.A00(r210.AJn), C000200d.A00(this.A00.A9J), C000200d.A00(r210.ABc));
            case 179:
                AnonymousClass10E r211 = this.A01;
                return new C185629ct((C182459Ul) this.A00.A9D.get(), (AnonymousClass1KB) r211.A4b.get(), (AnonymousClass10I) r211.AC1.get());
            case 180:
                return new C182459Ul(this);
            case 181:
                return new C172358tI((C18030ve) this.A01.A04.get());
            case 182:
                return new C93724jR(this);
            case 183:
                return new C93714jQ(this);
            case 184:
                return new C93734jS(this);
            case 185:
                return new C84154Ih(this);
            case 186:
                return new C36511o1((AnonymousClass18K) this.A01.A9B.get());
            case 187:
                return new C84164Ii(this);
            case 188:
                AnonymousClass10E r115 = this.A01;
                C18600wl r34 = (C18600wl) r115.A9E.get();
                return new AnonymousClass4OG((AnonymousClass1M4) r115.AmV.get(), (C24751Ln) r115.ABe.get(), r34, (AnonymousClass1OX) r115.A9C.get());
            case 189:
                return new C56322hH(this);
            case 190:
                AnonymousClass10E r116 = this.A01;
                return new AnonymousClass4Q5((C25831Pu) r116.A3R.get(), C000200d.A00(r116.A0x));
            case 191:
                return new C84174Ij(this);
            case 192:
                return new AnonymousClass4PS(this);
            case 193:
                return new AnonymousClass4Ik(this);
            case 194:
                return new AnonymousClass4Il(this);
            case 195:
                AnonymousClass10E r117 = this.A01;
                AnonymousClass00H A0014 = C000200d.A00(r117.A04);
                AnonymousClass00H A0015 = C000200d.A00(r117.AIL);
                AnonymousClass00H A0016 = C000200d.A00(r117.AJY);
                AnonymousClass10I r132 = (AnonymousClass10I) r117.AC1.get();
                return new C88504Zz((C88654aI) r117.A8r.get(), (C84894Lg) r117.AJk.get(), (AnonymousClass4QB) r117.AJl.get(), (C58692l6) r117.AlJ.get(), (C85074Lz) r117.AIJ.get(), (C133736pP) r117.A2Y.get(), r132, A0014, A0015, A0016);
            case 196:
                AnonymousClass00H A0017 = C000200d.A00(this.A01.A8r);
                AnonymousClass1K1 r118 = this.A00;
                return new AnonymousClass4QV(A0017, C000200d.A00(r118.A0w), C000200d.A00(r118.A6W));
            case 197:
                AnonymousClass10E r119 = this.A01;
                return new AnonymousClass4QI((C18030ve) r119.A04.get(), (AnonymousClass18K) r119.A9B.get());
            case 198:
                AnonymousClass10E r62 = this.A01;
                return new C192769ox((AnonymousClass11P) r62.AAv.get(), (C88504Zz) this.A00.A0h.get(), (AnonymousClass121) r62.A2y.get(), (AnonymousClass1PQ) r62.AAn.get(), (AnonymousClass10I) r62.AC1.get(), C000200d.A00(r62.AIL));
            case 199:
                AnonymousClass10E r214 = this.A01;
                return new C85414Nh(C000200d.A00(r214.A04), C000200d.A00(r214.A6N), C000200d.A00(r214.ABc), C000200d.A00(this.A00.A9G));
            default:
                throw new AssertionError(i);
        }
    }

    private Object A0P() {
        int i = this.A02;
        switch (i) {
            case 200:
                AnonymousClass10E r2 = this.A01;
                return new C185619cs((C182469Um) this.A00.A6x.get(), (AnonymousClass1KB) r2.A4b.get(), (AnonymousClass10I) r2.AC1.get());
            case 201:
                return new C182469Um(this);
            case 202:
                return new AnonymousClass2JD();
            case 203:
                return new C84184Im(this);
            case 204:
                return new C56332hI(this);
            case 205:
                return new C84194In(this);
            case 206:
                return new C84204Io(this);
            case 207:
                return new C84214Ip(this);
            case 208:
                return new C84224Iq(this);
            case 209:
                return new C56342hJ(this);
            case 210:
                AnonymousClass10E r22 = this.A01;
                return new C127336eB((C18030ve) r22.A04.get(), (AnonymousClass18K) r22.A9B.get());
            case 211:
                AnonymousClass10E r23 = this.A01;
                return new C85144Mg((AnonymousClass1CJ) r23.A2H.get(), C000200d.A00(r23.A5P));
            case 212:
                return new C84234Ir(this);
            case 213:
                return new C66642yV(this);
            case 214:
                AnonymousClass10E r24 = this.A01;
                return new C138056wS((C18030ve) r24.A04.get(), C000200d.A00(r24.AFD));
            case 215:
                return new C87764Ww((C39511tC) this.A01.A1K.get(), this.A00.A0b());
            case 216:
                return new C84244Is(this);
            case 217:
                return new C84254It(this);
            case 218:
                return new C84264Iu(this);
            case 219:
                return new C84274Iv(this);
            case 220:
                return new C51082Wx(this);
            case 221:
                return new C93894ji(this);
            case 222:
                return new AnonymousClass4PT(this);
            case 223:
                return new C84284Iw(this);
            case 224:
                return new AnonymousClass4Ix(this);
            case 225:
                return new C56352hK(this);
            case 226:
                return new C96254nY(this);
            case 227:
                return new C84294Iy(this);
            case 228:
                return new C66662yX(this);
            case 229:
                return new C84304Iz(this);
            case 230:
                return new AnonymousClass4PU(this);
            case 231:
                return new C66672yY(this);
            case 232:
                return new C40261uQ(this);
            case 233:
                return new C40351uZ(this);
            case 234:
                return new C40361ua(this);
            case 235:
                return new C40381uc(this);
            case 236:
                return new C36491nz(this);
            case 237:
                return new C42081xa(this);
            case 238:
                return new C42091xb(this);
            case 239:
                return new C42361y3(this);
            case 240:
                return new C42371y4(this);
            case 241:
                return new C42381y5(this);
            case 242:
                return new C42451yC(this);
            case 243:
                return new C42101xc(this);
            case 244:
                return new C36501o0(this);
            case 245:
                return new AnonymousClass4PV(this);
            case 246:
                return new C36981om(this);
            case 247:
                return new AnonymousClass4J0(this);
            case 248:
                return new C56362hL(this);
            case 249:
                return new RtaXmppClient(C000200d.A00(this.A01.A6N), C000200d.A00(this.A00.A9K));
            case 250:
                return new C50452Um();
            case 251:
                return new AnonymousClass2X0(this);
            case 252:
                return new AnonymousClass4J1(this);
            case 253:
                return new AnonymousClass4J2(this);
            case 254:
                return new C56372hM(this);
            case 255:
                return new AnonymousClass2X1(this);
            case 256:
                return new C93944jn(this);
            case 257:
                return new AnonymousClass4J3(this);
            case 258:
                return new AnonymousClass4J4(this);
            case 259:
                return new C94074k0(this);
            case 260:
                return new AnonymousClass4J5(this);
            case 261:
                return new AnonymousClass4J6(this);
            case 262:
                return new AnonymousClass4J7(this);
            case 263:
                return new AnonymousClass4PW(this);
            case 264:
                return new C131286kq(this);
            case 265:
                AnonymousClass10E r25 = this.A01;
                return new C133956pm((C26811To) r25.AAf.get(), (AnonymousClass1PY) r25.ABh.get());
            case 266:
                AnonymousClass10E r3 = this.A01;
                AnonymousClass1KB r5 = (AnonymousClass1KB) r3.A4b.get();
                AnonymousClass1CJ r11 = (AnonymousClass1CJ) r3.A2H.get();
                AnonymousClass00H A002 = C000200d.A00(r3.ABd);
                AnonymousClass18O r6 = (AnonymousClass18O) r3.A9p.get();
                AnonymousClass1M9 r8 = (AnonymousClass1M9) r3.A2f.get();
                C24921Me r9 = (C24921Me) r3.ABX.get();
                C18000vb r10 = (C18000vb) r3.ABz.get();
                AnonymousClass1NN r12 = (AnonymousClass1NN) r3.A2q.get();
                AnonymousClass00H A003 = C000200d.A00(r3.A00.A2U);
                AnonymousClass1MZ r13 = (AnonymousClass1MZ) r3.A4t.get();
                return new AnonymousClass4SV(r5, r6, (AnonymousClass11E) r3.A2X.get(), r8, r9, r10, r11, r12, r13, (C18030ve) r3.A04.get(), (AnonymousClass126) r3.A4h.get(), (AnonymousClass12M) r3.A4w.get(), (C25011Mn) r3.A9o.get(), A002, A003);
            case 267:
                return new C84964Ln((C18030ve) this.A01.A04.get());
            case 268:
                return new AnonymousClass4J8(this);
            case 269:
                AnonymousClass10E r4 = this.A01;
                return new C88474Zv((C189339iv) r4.A0K.get(), (C18030ve) r4.A04.get(), (AnonymousClass18K) r4.A9B.get(), (C52202aX) r4.A00.ABs.get());
            case 270:
                AnonymousClass10G A11 = this.A01.A00;
                return C199410f.of(A11.AEW(), A11.AEY(), A11.AEa(), A11.AEc());
            case 271:
                return new AnonymousClass6ZK(this);
            case 272:
                return new AnonymousClass6ZL(this);
            case 273:
                AnonymousClass10E r42 = this.A01;
                C219217x r26 = (C219217x) r42.ABj.get();
                AnonymousClass1I6 r1 = (AnonymousClass1I6) r42.Ac3.get();
                return new C130266j9((AnonymousClass1KB) r42.A4b.get(), r1, r26, (C18030ve) r42.A04.get());
            case 274:
                Activity A004 = this.A00.AAO;
                AnonymousClass10E r14 = this.A01;
                C18000vb r7 = (C18000vb) r14.ABz.get();
                return new AnonymousClass4SX(A004, C19880zA.A00(), r7, (C18030ve) r14.A04.get(), (AnonymousClass1DC) r14.A95.get());
            case 275:
                return new C66872ys(this, 0);
            case 276:
                AnonymousClass10E r27 = this.A01;
                C26161Rb A8x = r27.A8w();
                C19830z4 r62 = (C19830z4) r27.ABl.get();
                AnonymousClass1RK r72 = (AnonymousClass1RK) r27.A2R.get();
                return new AnonymousClass4VE((C36931oh) this.A00.A3o.get(), r62, r72, (C18030ve) r27.A04.get(), A8x, (AnonymousClass18K) r27.A9B.get(), (C24901Mc) r27.AA5.get());
            case 277:
                return AnonymousClass3BO.A00();
            case 278:
                return new C70253Ai(this, 0);
            case 279:
                return new C94544kn(this, 0);
            case 280:
                return new C66892yu(this, 0);
            case 281:
                return new C94674l0(this, 0);
            case 282:
                return new C66902yv(this, 0);
            case 283:
                return new C94724l5(this, 0);
            case 284:
                return new C66932yy(this, 0);
            case 285:
                return new C94814lE(this, 0);
            case 286:
                return new C66962z1(this, 0);
            case 287:
                return new C96184nR(this, 0);
            case 288:
                return new C94694l2(this, 0);
            case 289:
                return new C66952z0(this, 0);
            case 290:
                return new AnonymousClass7EW(this, 0);
            case 291:
                return new C94684l1(this, 0);
            case 292:
                return new C94714l4(this, 0);
            case 293:
                return new C66972z2(this, 0);
            case 294:
                return new C94824lF(this, 0);
            case 295:
                return new C94734l6(this, 0);
            case 296:
                return new C94744l7(this, 0);
            case 297:
                return new C94754l8(this, 0);
            case 298:
                return new C66912yw(this, 0);
            case 299:
                return new C96174nQ(this, 0);
            default:
                throw new AssertionError(i);
        }
    }

    private Object A0Q() {
        int i = this.A02;
        switch (i) {
            case 300:
                return new C66922yx(this, 0);
            case 301:
                return new C94774lA(this, 0);
            case 302:
                return new C94764l9(this, 0);
            case 303:
                return new C94804lD(this, 0);
            case 304:
                return new C94784lB(this, 0);
            case 305:
                return new C66882yt(this, 0);
            case 306:
                return new C94834lG(this, 0);
            case 307:
                return new C66942yz(this, 0);
            case 308:
                return new C94794lC(this, 0);
            case 309:
                return new AnonymousClass4J9(this);
            case 310:
                AnonymousClass10E r3 = this.A01;
                AnonymousClass10G A11 = r3.A00;
                return new AnonymousClass2E6((C19830z4) r3.ABl.get(), (C1193267r) r3.A9P.get(), (EmojiSearchProvider) A11.A1c.get(), (C131196kh) this.A00.A6E.get(), (AnonymousClass1L4) A11.A2e.get());
            case 311:
                return AnonymousClass3BL.A00();
            case 312:
                return new AnonymousClass4JA(this);
            case 313:
                AnonymousClass10E r2 = this.A01;
                return new C85184Mk((AnonymousClass10I) r2.AC1.get(), C000200d.A00(r2.ABh));
            case 314:
                AnonymousClass10E r22 = this.A01;
                return new AnonymousClass4R1((C18030ve) r22.A04.get(), (C32011gU) r22.A5k.get());
            case 315:
                AnonymousClass10E r32 = this.A01;
                AnonymousClass10G A112 = r32.A00;
                C19830z4 r9 = (C19830z4) r32.ABl.get();
                C18030ve r10 = (C18030ve) r32.A04.get();
                C53542ch r11 = (C53542ch) A112.ACt.get();
                C18010vc r12 = (C18010vc) r32.A9s.get();
                return new AnonymousClass4RR((AnonymousClass1KB) r32.A4b.get(), (AnonymousClass11C) r32.AAp.get(), r9, r10, r11, r12, (C36401np) A112.A30.get());
            case 316:
                return new C79583vh((C79683vr) this.A01.A00.A8M.get());
            case 317:
                return new AnonymousClass4PX(this);
            case 318:
                return new C79593vi(this.A00.A0u());
            case 319:
                return new AnonymousClass4JB(this);
            case 320:
                return new AnonymousClass4JC(this);
            case 321:
                return new AnonymousClass4JD(this);
            case 322:
                return new C79603vj((C79593vi) this.A00.A4u.get());
            case 323:
                Activity A002 = this.A00.AAO;
                AnonymousClass10E r23 = this.A01;
                return new C79203uq(A002, (C18000vb) r23.ABz.get(), (C18030ve) r23.A04.get());
            case 324:
                return new C94954lS(this);
            case 325:
                return new AnonymousClass4JE(this);
            case 326:
                return new AnonymousClass4JF(this);
            case 327:
                return A08((C219117w) this.A01.A3J.get(), this.A00.A6Z);
            case 328:
                AnonymousClass10E r24 = this.A01;
                return new C95644mZ((C18030ve) r24.A04.get(), (AnonymousClass1DC) r24.A95.get());
            case 329:
                AnonymousClass1K1 r33 = this.A00;
                return A06((C18030ve) this.A01.A04.get(), r33.A9t, r33.A6Y);
            case 330:
                return new C93084iP((C106685Wu) this.A00.A9k.get());
            case 331:
                return A05(this.A00.A6u);
            case 332:
                return new C26993DOp(this.A00.AAO, (AnonymousClass10I) this.A01.AC1.get());
            case 333:
                return new C75863lu((C106685Wu) this.A00.A9k.get());
            case 334:
                return new AnonymousClass4ZT(new C87444Vp());
            case 335:
                AnonymousClass10E r1 = this.A01;
                AnonymousClass10E r13 = r1;
                C18030ve r18 = (C18030ve) r1.A04.get();
                AnonymousClass1KB r17 = (AnonymousClass1KB) r13.A4b.get();
                AnonymousClass118 r16 = (AnonymousClass118) r13.ABY.get();
                AnonymousClass10G A113 = r13.A00;
                AnonymousClass00H A003 = C000200d.A00(r13.AAN);
                AnonymousClass00H A004 = C000200d.A00(this.A00.A6v);
                C27201Vd r222 = (C27201Vd) r13.A2j.get();
                AnonymousClass11C r232 = (AnonymousClass11C) r13.AAp.get();
                AnonymousClass118 r242 = r16;
                C18000vb r25 = (C18000vb) r13.ABz.get();
                AnonymousClass1MZ r26 = (AnonymousClass1MZ) r13.A4t.get();
                A1M a1m = (A1M) A113.A7k.get();
                AnonymousClass1VW r19 = (AnonymousClass1VW) r13.A2d.get();
                AnonymousClass1M9 r20 = (AnonymousClass1M9) r13.A2f.get();
                C24921Me r21 = (C24921Me) r13.ABX.get();
                return new AnonymousClass724(r17, (C72043Kk) A113.A1j.get(), a1m, r19, r20, r21, r222, r232, r242, r25, r26, (AnonymousClass1KW) r13.A3d.get(), r18, (AnonymousClass72F) r13.AcL.get(), (AnonymousClass1R2) r13.A8L.get(), (C26631Sw) r13.AAO.get(), (C32021gV) r13.A6k.get(), (AnonymousClass10I) r13.AC1.get(), A003, A004);
            case 336:
                return new AnonymousClass4XA((C24921Me) this.A01.ABX.get());
            case 337:
                return new AnonymousClass4LX(C000200d.A00(this.A00.AAE));
            case 338:
                return new C86134Qi((C18000vb) this.A01.ABz.get());
            case 339:
                AnonymousClass10E r34 = this.A01;
                AnonymousClass00H A005 = C000200d.A00(r34.A00.A0S);
                AnonymousClass00H A006 = C000200d.A00(r34.A2n);
                C18030ve r7 = (C18030ve) r34.A04.get();
                return new C85724Om((AnonymousClass4JG) this.A00.A7V.get(), (C40751vD) r34.AB7.get(), (C25811Ps) r34.A12.get(), r7, A005, A006);
            case 340:
                return new AnonymousClass4JG(this);
            case 341:
                AnonymousClass10E r14 = this.A01;
                AnonymousClass00H A007 = C000200d.A00(r14.A0s);
                AnonymousClass00H A008 = C000200d.A00(r14.A0p);
                AnonymousClass00H A009 = C000200d.A00(r14.A0V);
                AnonymousClass10G A114 = r14.A00;
                return new AnonymousClass4PK(A007, A008, A009, C000200d.A00(A114.A50), C000200d.A00(r14.AeU), C000200d.A00(r14.A0B), C000200d.A00(r14.A8X), C000200d.A00(A114.AHm), C000200d.A00(A114.A1K), C000200d.A00(r14.A5I), C000200d.A00(r14.ABV), C000200d.A00(A114.A1h), C000200d.A00(A114.A7j), C000200d.A00(this.A00.A0w), C000200d.A00(r14.A1u), C000200d.A00(r14.AUW), C000200d.A00(r14.A1e));
            case 342:
                return new AnonymousClass2X4(this);
            case 343:
                AnonymousClass10E r15 = this.A01;
                AnonymousClass10G A115 = r15.A00;
                AnonymousClass2T5 A3u = A115.A3t();
                AnonymousClass00H A0010 = C000200d.A00(r15.A22);
                C62052qi r8 = (C62052qi) A115.A8L.get();
                AnonymousClass118 r102 = (AnonymousClass118) r15.ABY.get();
                C25181Nf r112 = (C25181Nf) r15.A2o.get();
                return new AnonymousClass4RK((AnonymousClass1KB) r15.A4b.get(), (AnonymousClass1M9) r15.A2f.get(), r8, A3u, r102, r112, (C18030ve) r15.A04.get(), A0010);
            case 344:
                return new AnonymousClass2X5(this);
            case 345:
                return new AnonymousClass2X6(this);
            case 346:
                AnonymousClass1K1 r0 = this.A00;
                C87724Ws A0J = A0J();
                r0.AAB(A0J);
                return A0J;
            case 347:
                return new AnonymousClass2X7(this);
            case 348:
                return new AnonymousClass2X8(this);
            case 349:
                return new AnonymousClass4JH(this);
            case 350:
                return new C56392hO(this);
            case 351:
                return new AnonymousClass2X9(this);
            case 352:
                return new AnonymousClass6ZO(this);
            case 353:
                return new AnonymousClass6ZP(this);
            case 354:
                return new C61852qO(this);
            case 355:
                return A0M((C219117w) this.A01.A3J.get(), this.A00.AAK);
            case 356:
                AnonymousClass10E r27 = this.A01;
                return new C143857Fb((AnonymousClass118) r27.ABY.get(), (C18000vb) r27.ABz.get());
            case 357:
                return new C56402hP(this);
            case 358:
                AnonymousClass10E r110 = this.A01;
                return new C86064Qa(C19880zA.A00(), (AnonymousClass1c4) r110.A7C.get(), (C95424mD) r110.A00.A3T.get());
            case 359:
                return new C70263Aj(this);
            case 360:
                return new C61862qP(this);
            case 361:
                return new AnonymousClass2XA(this);
            case 362:
                return new AnonymousClass2XB(this);
            case 363:
                return new AnonymousClass4PY(this);
            case 364:
                return new AnonymousClass4JI(this);
            case 365:
                return new AnonymousClass2XC(this);
            case 366:
                return new AnonymousClass2XD(this);
            case 367:
                return new AnonymousClass2XE(this);
            case 368:
                return new AnonymousClass2XF(this);
            case 369:
                return new AnonymousClass4JJ(this);
            case 370:
                return new AnonymousClass2XG(this);
            case 371:
                AnonymousClass10E r35 = this.A01;
                AnonymousClass00H A0011 = C000200d.A00(r35.A00.A9U);
                AnonymousClass00H A0012 = C000200d.A00(r35.A53);
                return new C62632ri((C19880zA) r35.A7f.get(), (AnonymousClass11S) r35.A63.get(), (C25491Ok) r35.A1F.get(), (AnonymousClass11P) r35.AAv.get(), (C18000vb) r35.ABz.get(), (C18030ve) r35.A04.get(), A0011, A0012);
            case 372:
                return new AnonymousClass2XH(this);
            case 373:
                return new AnonymousClass2XI(this);
            case 374:
                return new C93594jE(this);
            case 375:
                return new AnonymousClass4JK(this);
            case 376:
                AnonymousClass10E r36 = this.A01;
                return new C190619lF(C000200d.A00(r36.AkQ), C000200d.A00(this.A00.A5S), C000200d.A00(r36.A00.AHx));
            case 377:
                AnonymousClass10E r37 = this.A01;
                AnonymousClass00H A0013 = C000200d.A00(r37.AkQ);
                AnonymousClass118 r72 = (AnonymousClass118) r37.ABY.get();
                C18030ve r82 = (C18030ve) r37.A04.get();
                return new C191609ms((C56582hh) r37.AS6.get(), (AnonymousClass1KB) r37.A4b.get(), (AnonymousClass1M9) r37.A2f.get(), r72, r82, A0013);
            case 378:
                return new AnonymousClass6ZQ(this);
            case 379:
                AnonymousClass10E r38 = this.A01;
                return new MusicPublishing(C000200d.A00(r38.A00.A5h), C000200d.A00(r38.A6y), C000200d.A00(r38.A9E));
            case 380:
                AnonymousClass10E r28 = this.A01;
                return new C127836f0((AnonymousClass1MW) r28.A7u.get(), (C24751Ln) r28.ABe.get());
            case 381:
                return new AnonymousClass4JL(this);
            case 382:
                return new AnonymousClass4JM(this);
            case 383:
                return new AnonymousClass2XJ(this);
            case 384:
                return new AnonymousClass4JN(this);
            case 385:
                AnonymousClass1K1 r111 = this.A00;
                AnonymousClass10E r29 = this.A01;
                AnonymousClass00H A0014 = C000200d.A00(r111.A9F);
                AnonymousClass1CJ r5 = (AnonymousClass1CJ) r29.A2H.get();
                AnonymousClass00H A0015 = C000200d.A00(r29.A9J);
                AnonymousClass10G A116 = r29.A00;
                C95634mY r4 = (C95634mY) A116.A6f.get();
                AnonymousClass1MZ r73 = (AnonymousClass1MZ) r29.A4t.get();
                AnonymousClass00H A0016 = C000200d.A00(A116.A3Q);
                C95684md A0017 = AnonymousClass3BM.A00(r4, r5, (C25181Nf) r29.A2o.get(), r73, (C18030ve) r29.A04.get(), (AnonymousClass12L) r29.A90.get(), (AnonymousClass1PU) r29.A4j.get(), A0014, A0015, A0016, C000200d.A00(r29.A51));
                r111.ADH(A0017);
                return A0017;
            case 386:
                AnonymousClass10E r39 = this.A01;
                AnonymousClass00H A0018 = C000200d.A00(r39.AAx);
                return new AnonymousClass4S7((AnonymousClass1PM) r39.ABM.get(), (C25491Ok) r39.A1F.get(), (C18030ve) r39.A04.get(), (AnonymousClass12L) r39.A90.get(), A0018);
            case 387:
                AnonymousClass1K1 r02 = this.A00;
                C53222cB A0I = A0I();
                r02.AA8(A0I);
                return A0I;
            case 388:
                C53212cA A0G = A0G();
                AnonymousClass1K1.A9q(A0G);
                return A0G;
            case 389:
                AnonymousClass1K1 r03 = this.A00;
                AnonymousClass4X5 A0H = A0H();
                r03.A9s(A0H);
                return A0H;
            case 390:
                return new AnonymousClass4JO(this);
            case 391:
                return new AnonymousClass4JP(this);
            case 392:
                return new AnonymousClass4JQ(this);
            case 393:
                return new AnonymousClass4JR(this);
            case 394:
                return new AnonymousClass4JS(this);
            case 395:
                return new AnonymousClass4JT(this);
            case 396:
                return new AnonymousClass4JU(this);
            case 397:
                AnonymousClass1K1 r04 = this.A00;
                C56252hA A0A = A0A();
                r04.A92(A0A);
                return A0A;
            case 398:
                return new C56722hv((AnonymousClass1UD) this.A01.A14.get());
            case 399:
                AnonymousClass10E r310 = this.A01;
                C26911Ty r92 = (C26911Ty) r310.A1J.get();
                C24681Lg r103 = (C24681Lg) r310.A6Y.get();
                AnonymousClass1NK r113 = (AnonymousClass1NK) r310.A9b.get();
                AnonymousClass10I r122 = (AnonymousClass10I) r310.AC1.get();
                return new C73343Uy((AnonymousClass1KB) r310.A4b.get(), (C33251iW) r310.AB9.get(), r92, r103, r113, r122, C000200d.A00(r310.A19));
            default:
                throw new AssertionError(i);
        }
    }

    private Object A0R() {
        int i = this.A02;
        switch (i) {
            case 400:
                AnonymousClass10E r2 = this.A01;
                AnonymousClass1UD r6 = (AnonymousClass1UD) r2.A14.get();
                C26521Sl r11 = (C26521Sl) r2.A69.get();
                C34501ka r7 = (C34501ka) r2.A68.get();
                AnonymousClass1K1 r1 = this.A00;
                return new C88204Ys((AnonymousClass1KB) r2.A4b.get(), r6, r7, (C134146q7) r1.A5H.get(), (AnonymousClass87Y) r1.A2g.get(), (AnonymousClass2K6) r2.A00.AD9.get(), r11, (AnonymousClass10I) r2.AC1.get());
            case 401:
                AnonymousClass10E r12 = this.A01;
                AnonymousClass1KB r5 = (AnonymousClass1KB) r12.A4b.get();
                AnonymousClass11C r72 = (AnonymousClass11C) r12.AAp.get();
                AnonymousClass1T6 r112 = (AnonymousClass1T6) r12.A6B.get();
                C34501ka r10 = (C34501ka) r12.A68.get();
                C18010vc r122 = (C18010vc) r12.A9s.get();
                AnonymousClass00H A002 = C000200d.A00(r12.A00.AEC);
                C19830z4 r8 = (C19830z4) r12.ABl.get();
                return new C134146q7(r5, (AnonymousClass11E) r12.A2X.get(), r72, r8, (C18030ve) r12.A04.get(), r10, r112, r122, (AnonymousClass10I) r12.AC1.get(), A002);
            case 402:
                return new AnonymousClass34I(this, 0);
            case 403:
                return new AnonymousClass2XK(this);
            case 404:
                return new AnonymousClass2XL(this);
            case 405:
                return new AnonymousClass4JV(this);
            case 406:
                return new AnonymousClass4JW(this);
            case 407:
                return new AnonymousClass6ZR(this);
            case 408:
                return new C172218t4(this, 0);
            case 409:
                AnonymousClass10E r4 = this.A01;
                return new C93054iM((C38731rn) r4.A6o.get(), (C1408073d) r4.A11.get(), (C32951i1) r4.A28.get(), (AnonymousClass2JS) r4.A00.ACB.get());
            case 410:
                return new C84654Ki((AnonymousClass4JX) this.A00.A82.get());
            case 411:
                return new AnonymousClass4JX(this);
            case 412:
                return new AnonymousClass2XM(this);
            case 413:
                return new AnonymousClass2XN(this);
            case 414:
                AnonymousClass1K1 r0 = this.A00;
                C88444Zs A0D = A0D();
                r0.A9W(A0D);
                return A0D;
            case 415:
                AnonymousClass1K1 r42 = this.A00;
                AnonymousClass10E r13 = this.A01;
                return new AnonymousClass4O3((AnonymousClass4JY) r42.A85.get(), C000200d.A00(r13.A8r), C000200d.A00(r13.A00.A8k), C000200d.A00(r42.A0h));
            case 416:
                return new AnonymousClass4JY(this);
            case 417:
                AnonymousClass10E r22 = this.A01;
                AnonymousClass10G A11 = r22.A00;
                AnonymousClass1KT A9P = A11.A9O();
                AnonymousClass00H A003 = C000200d.A00(r22.ABz);
                AnonymousClass00H A004 = C000200d.A00(A11.A2e);
                C23771Ho A005 = C29911d4.A00();
                return new C55862gU((AnonymousClass1KB) r22.A4b.get(), (C18030ve) r22.A04.get(), A9P, A003, A004, A005);
            case 418:
                AnonymousClass1K1 r02 = this.A00;
                C56052gp A0E = A0E();
                r02.A9a(A0E);
                return A0E;
            case 419:
                AnonymousClass10E r43 = this.A01;
                return new AnonymousClass4X0((AnonymousClass1KB) r43.A4b.get(), (C18000vb) r43.ABz.get(), (C18030ve) r43.A04.get(), (A1I) r43.A77.get());
            case 420:
                AnonymousClass1K1 r03 = this.A00;
                C55742gI A0C = A0C();
                r03.A9S(A0C);
                return A0C;
            case 421:
                return C201110w.of("calllink", this.A01.A00.A2s());
            case 422:
                AnonymousClass1K1 r04 = this.A00;
                C53202c9 A09 = A09();
                r04.A91(A09);
                return A09;
            case 423:
                return new AnonymousClass2XO(this);
            case 424:
                AnonymousClass1K1 r05 = this.A00;
                AnonymousClass4OV A0B = A0B();
                r05.A9M(A0B);
                return A0B;
            case 425:
                AnonymousClass10E r23 = this.A01;
                return new C85084Ma((AnonymousClass44c) r23.A00.A4W.get(), (AnonymousClass1LU) r23.ABd.get());
            case 426:
                AnonymousClass1K1 r06 = this.A00;
                AnonymousClass4MU A0F = A0F();
                r06.A9o(A0F);
                return A0F;
            case 427:
                AnonymousClass10E r14 = this.A01;
                return new C88064Ye((AnonymousClass11C) r14.AAp.get(), (C18030ve) r14.A04.get(), C000200d.A00(r14.A00.A30), C000200d.A00(this.A00.A6V));
            case 428:
                AnonymousClass10E r15 = this.A01;
                AnonymousClass1LU r102 = (AnonymousClass1LU) r15.ABd.get();
                AnonymousClass1L9 r52 = (AnonymousClass1L9) r15.A0E.get();
                AnonymousClass11C r73 = (AnonymousClass11C) r15.AAp.get();
                return new AnonymousClass4RD(r52, (C36531o3) r15.A2n.get(), r73, (AnonymousClass1MZ) r15.A4t.get(), (C18030ve) r15.A04.get(), r102, (C36401np) r15.A00.A30.get());
            case 429:
                return new AnonymousClass2XP(this);
            case 430:
                return new AnonymousClass2XQ(this);
            case 431:
                return new AnonymousClass2XR(this);
            case 432:
                return new AnonymousClass2XS(this);
            case 433:
                return new AnonymousClass2XT(this);
            case 434:
                return new AnonymousClass2XU(this);
            case 435:
                return new AnonymousClass4JZ(this);
            case 436:
                return new AnonymousClass2XV(this);
            case 437:
                return new C84314Ja(this);
            case 438:
                AnonymousClass1K1 r16 = this.A00;
                return new C79653vo(C19880zA.A00(), (C79683vr) this.A01.A00.A8M.get(), C000200d.A00(r16.A6s), C000200d.A00(r16.A6q), C000200d.A00(r16.A6t), C000200d.A00(r16.A6r));
            case 439:
                return new C79543vb((C79493vW) this.A00.AA8.get());
            case 440:
                return new C79523vZ((C79383vL) this.A00.A6m.get());
            case 441:
                return new C79553vc((C79483vV) this.A00.AAH.get());
            case 442:
                return new C79533va((C95094lg) this.A00.A9E.get());
            case 443:
                return new C84324Jb(this);
            case 444:
                AnonymousClass10E r24 = this.A01;
                return new C57142ib(C000200d.A00(r24.AAV), C000200d.A00(r24.AAp));
            case 445:
                return new C52372ao(C000200d.A00(this.A00.AAN));
            case 446:
                AnonymousClass10E r17 = this.A01;
                return new C172488tV((AnonymousClass181) r17.AA9.get(), (C19830z4) r17.ABl.get(), (C18030ve) r17.A04.get(), (C31611fq) r17.A4Q.get(), C000200d.A00(r17.A0n));
            case 447:
                AnonymousClass00H A006 = C000200d.A00(this.A01.ABB);
                AnonymousClass1K1 r25 = this.A00;
                return new C128436fz(A006, C000200d.A00(r25.A6g), C000200d.A00(r25.A6i));
            case 448:
                AnonymousClass10E r44 = this.A01;
                AnonymousClass00H A007 = C000200d.A00(r44.A9B);
                AnonymousClass1K1 r18 = this.A00;
                return new AnonymousClass71C(A007, C000200d.A00(r18.A6k), C000200d.A00(r18.A6h), C000200d.A00(r44.A8r));
            case 449:
                AnonymousClass10E r26 = this.A01;
                return new C131916ls((AnonymousClass11S) r26.A63.get(), (C18030ve) r26.A04.get());
            case 450:
                Map map = C137876wA.A01;
                return new C137876wA(C000200d.A00(this.A01.AlM));
            case 451:
                AnonymousClass10E r19 = this.A01;
                return new C1406172f(C000200d.A00(r19.A04), C000200d.A00(r19.ABB), C000200d.A00(this.A00.A6k), C000200d.A00(r19.A9B), C000200d.A00(r19.AeU));
            case 452:
                AnonymousClass10E r110 = this.A01;
                AnonymousClass1K1 r27 = this.A00;
                C131916ls r62 = (C131916ls) r27.A6k.get();
                AnonymousClass00H A008 = C000200d.A00(r110.ABe);
                return new C133256oQ((C88504Zz) r27.A0h.get(), r62, (C18030ve) r110.A04.get(), (AnonymousClass10I) r110.AC1.get(), A008, C000200d.A00(r110.A35), C000200d.A00(r110.A37), C000200d.A00(r110.AXW), C000200d.A00(r110.A1O), C000200d.A00(r110.A00.A0n));
            case 453:
                return new C133366od((C18030ve) this.A01.A04.get());
            case 454:
                AnonymousClass10E r111 = this.A01;
                return new C55762gK((AnonymousClass1KB) r111.A4b.get(), (C26911Ty) r111.A1J.get(), (AnonymousClass1M9) r111.A2f.get(), (C678831f) r111.A00.A10.get(), (C18030ve) r111.A04.get(), (AnonymousClass1LU) r111.ABd.get(), (AnonymousClass10I) r111.AC1.get());
            case 455:
                AnonymousClass10E r113 = this.A01;
                return new C129646i8((AnonymousClass1KB) r113.A4b.get(), (AnonymousClass1M9) r113.A2f.get(), (C678831f) r113.A00.A10.get(), (C18030ve) r113.A04.get(), (AnonymousClass10I) r113.AC1.get());
            case 456:
                Set set = A72.A02;
                AnonymousClass10E r28 = this.A01;
                return new A72((C18030ve) r28.A04.get(), (C34501ka) r28.A68.get());
            case 457:
                AnonymousClass10E r45 = this.A01;
                return new AnonymousClass4S2((AnonymousClass1MZ) r45.A4t.get(), (AnonymousClass1PS) r45.A3T.get(), (AnonymousClass18K) r45.A9B.get(), (C25241Nl) r45.ABr.get());
            case 458:
                AnonymousClass10E r114 = this.A01;
                C33251iW r63 = (C33251iW) r114.ABA.get();
                AnonymousClass1M9 r82 = (AnonymousClass1M9) r114.A2f.get();
                AnonymousClass00H A009 = C000200d.A00(r114.A0x);
                AnonymousClass1NN r103 = (AnonymousClass1NN) r114.A2q.get();
                AnonymousClass00H A0010 = C000200d.A00(this.A00.A14);
                return new AnonymousClass4RT((AnonymousClass1KB) r114.A4b.get(), r63, (AnonymousClass11E) r114.A2X.get(), r82, (AnonymousClass1CJ) r114.A2H.get(), r103, (AnonymousClass126) r114.A4h.get(), (AnonymousClass12M) r114.A4w.get(), A009, A0010);
            case 459:
                return new C84334Jc(this);
            case 460:
                return new AnonymousClass4PZ(this);
            case 461:
                return new C84344Jd(this);
            case 462:
                AnonymousClass1K1 r3 = this.A00;
                return new C79643vn(r3.A0u(), C000200d.A00(r3.A9V), C000200d.A00(r3.A9W));
            case 463:
                AnonymousClass10E r29 = this.A01;
                return new C79563vf((C33251iW) r29.ABA.get(), (C88104Yi) r29.A00.AFS.get());
            case 464:
                AnonymousClass10E r210 = this.A01;
                return new C79893wC((C33251iW) r210.ABA.get(), (C88104Yi) r210.A00.AFS.get());
            case 465:
                return new C84354Je(this);
            case 466:
                AnonymousClass10E r46 = this.A01;
                return new C129016h7(C000500i.A00(r46.Ao9), (AnonymousClass1M9) r46.A2f.get(), (C24921Me) r46.ABX.get(), (AnonymousClass1KW) r46.A3d.get());
            case 467:
                return A00(C19880zA.A01(A0L()));
            case 468:
                AnonymousClass10E r211 = this.A01;
                return new C127356eD((AnonymousClass11P) r211.AAv.get(), (AnonymousClass18K) r211.A9B.get());
            case 469:
                return new C96394nm(this, 0);
            case 470:
                return new C96404nn(this);
            case 471:
                AnonymousClass10E r32 = this.A01;
                return new C36631oD((C18030ve) r32.A04.get(), (AnonymousClass18K) r32.A9B.get(), (C36561o6) r32.AmT.get());
            case 472:
                AnonymousClass10E r33 = this.A01;
                return new C36651oF((C18030ve) r33.A04.get(), (AnonymousClass18K) r33.A9B.get(), (C36561o6) r33.AmT.get());
            case 473:
                AnonymousClass10E r34 = this.A01;
                return new C36661oG((C18030ve) r34.A04.get(), (AnonymousClass18K) r34.A9B.get(), (C36561o6) r34.AmT.get());
            case 474:
                return new C84364Jf(this);
            case 475:
                AnonymousClass10E r115 = this.A01;
                return new C86254Qx(C000200d.A00(r115.A8f), C000200d.A00(r115.A00.A2r), C000200d.A00(r115.A5U), C000200d.A00(r115.A5V), C000200d.A00(r115.ABd));
            case 476:
                return new AnonymousClass6ZS(this);
            case 477:
                AnonymousClass10E r116 = this.A01;
                AnonymousClass1OZ r74 = (AnonymousClass1OZ) r116.A6N.get();
                return new C48202Lo((AnonymousClass1M9) r116.A2f.get(), (C19830z4) r116.ABl.get(), r74, new C60452o3(), (AnonymousClass10I) r116.AC1.get());
            case 478:
                return new C56422hR(this);
            case 479:
                return new C126086cA((C18030ve) this.A01.A04.get());
            case 480:
                AnonymousClass10E r117 = this.A01;
                return new AnonymousClass4XW((AnonymousClass1KB) r117.A4b.get(), (C18000vb) r117.ABz.get(), (C34501ka) r117.A68.get(), (C18600wl) r117.A9E.get(), (C18600wl) r117.A9F.get());
            case 481:
                AnonymousClass10E r118 = this.A01;
                AnonymousClass00H A0011 = C000200d.A00(r118.A68);
                AnonymousClass00H A0012 = C000200d.A00(r118.AlU);
                AnonymousClass10G A112 = r118.A00;
                AnonymousClass00H A0013 = C000200d.A00(A112.AId);
                AnonymousClass00H A0014 = C000200d.A00(r118.AmD);
                AnonymousClass00H A0015 = C000200d.A00(r118.A04);
                AnonymousClass00H A0016 = C000200d.A00(A112.ABJ);
                AnonymousClass00H A0017 = C000200d.A00(r118.AYQ);
                return new C139276yZ((AnonymousClass1KB) r118.A4b.get(), (AnonymousClass10I) r118.AC1.get(), A0011, A0012, A0013, A0014, A0015, A0016, A0017);
            case 482:
                return new C193099pX((AnonymousClass18K) this.A01.A9B.get());
            case 483:
                return new C84374Jg(this);
            case 484:
                return new C84384Jh(this);
            case 485:
                return new C84394Ji(this);
            case 486:
                return new C85864Pa(this);
            case 487:
                return new C85874Pb(this);
            case 488:
                return new C84404Jj(this);
            case 489:
                return new C84414Jk(this);
            case 490:
                return new AnonymousClass4QX((C18000vb) this.A01.ABz.get());
            case 491:
                return new C84424Jl(this);
            case 492:
                return new C84434Jm(this);
            case 493:
                return new C182529Us(this);
            case 494:
                return new C182539Ut(this);
            case 495:
                return new C56432hS(this);
            case 496:
                return new AnonymousClass2XW(this);
            case 497:
                return new C84444Jn(this);
            case 498:
                return new AnonymousClass6ZT(this);
            case 499:
                return new C56442hT(this);
            default:
                throw new AssertionError(i);
        }
    }

    private Object A0S() {
        int i = this.A02;
        switch (i) {
            case 500:
                return new AnonymousClass2XX(this);
            case 501:
                return new AnonymousClass2XY(this);
            case 502:
                return new AnonymousClass6ZU(this);
            case 503:
                return new AnonymousClass6ZV(this);
            case 504:
                return new AnonymousClass6ZW(this);
            case 505:
                return new AnonymousClass6ZX(this);
            case 506:
                return new C131306ks(this);
            case 507:
                return new AnonymousClass6ZY(this);
            case 508:
                AnonymousClass10E r1 = this.A01;
                AnonymousClass1M9 r12 = (AnonymousClass1M9) r1.A2f.get();
                return new C111265jP(C19880zA.A00(), r12, (AnonymousClass1CJ) r1.A2H.get());
            case 509:
                AnonymousClass10E r3 = this.A01;
                return new AnonymousClass8o8((C27191Vc) r3.A2i.get(), (AnonymousClass118) r3.ABY.get(), (AnonymousClass10I) r3.AC1.get());
            case 510:
                return new C688835b(this, 0);
            case 511:
                return new C688935c(this, 0);
            case 512:
                AnonymousClass10E r32 = this.A01;
                return new C138976y0((AnonymousClass11C) r32.AAp.get(), (C18030ve) r32.A04.get(), (C36401np) r32.A00.A30.get());
            case 513:
                return new C127596ec((AnonymousClass11S) this.A01.A63.get(), C000200d.A00(this.A00.A05));
            case 514:
                return new C182559Uv(this);
            case 515:
                return new C182569Uw(this);
            case 516:
                return new C172218t4(this, 1);
            case 517:
                return new AnonymousClass2XZ(this);
            case 518:
                return new C182579Ux(this);
            case 519:
                return new AnonymousClass2UO();
            case 520:
                AnonymousClass10E r13 = this.A01;
                return new C1767995r((AnonymousClass18O) r13.A9p.get(), (AnonymousClass11P) r13.AAv.get(), (AnonymousClass122) r13.A2y.get(), (C18030ve) r13.A04.get(), (BD4) r13.A00.A0V.get(), AnonymousClass10E.AIT(r13));
            case 521:
                AnonymousClass10E r14 = this.A01;
                return new AnonymousClass44O((AnonymousClass18O) r14.A9p.get(), (AnonymousClass11P) r14.AAv.get(), (AnonymousClass122) r14.A2y.get(), (C18030ve) r14.A04.get(), (BD4) r14.A00.A0V.get(), AnonymousClass10E.AIT(r14));
            case 522:
                AnonymousClass10E r15 = this.A01;
                return new AnonymousClass44Q((AnonymousClass18O) r15.A9p.get(), (AnonymousClass11P) r15.AAv.get(), (AnonymousClass122) r15.A2y.get(), (C18030ve) r15.A04.get(), (BD4) r15.A00.A0V.get(), AnonymousClass10E.AIT(r15));
            case 523:
                AnonymousClass10E r16 = this.A01;
                return new C1768095s((AnonymousClass18O) r16.A9p.get(), (AnonymousClass11P) r16.AAv.get(), (AnonymousClass122) r16.A2y.get(), (C18030ve) r16.A04.get(), (BD4) r16.A00.A0V.get(), AnonymousClass10E.AIT(r16));
            case 524:
                AnonymousClass10E r17 = this.A01;
                return new AnonymousClass44P((AnonymousClass18O) r17.A9p.get(), (AnonymousClass11P) r17.AAv.get(), (AnonymousClass122) r17.A2y.get(), (C18030ve) r17.A04.get(), (BD4) r17.A00.A0V.get(), AnonymousClass10E.AIT(r17));
            case 525:
                AnonymousClass10E r18 = this.A01;
                AnonymousClass18O r5 = (AnonymousClass18O) r18.A9p.get();
                AnonymousClass11P r7 = (AnonymousClass11P) r18.AAv.get();
                AnonymousClass122 r9 = (AnonymousClass122) r18.A2y.get();
                C32551hN AIU = AnonymousClass10E.AIT(r18);
                AnonymousClass1QR r10 = (AnonymousClass1QR) r18.A8D.get();
                return new C1768195t(r5, (AnonymousClass1M9) r18.A2f.get(), r7, (C18000vb) r18.ABz.get(), r9, r10, (C18030ve) r18.A04.get(), (BD4) r18.A00.A0V.get(), (AnonymousClass1R2) r18.A8L.get(), AIU);
            case 526:
                AnonymousClass10E r19 = this.A01;
                AnonymousClass00H A002 = C000200d.A00(r19.A6N);
                AnonymousClass00H A003 = C000200d.A00(r19.A00.ACL);
                return new C175608yz((A7U) r19.A5E.get(), (C31061ex) r19.A8E.get(), (C30931ek) r19.A81.get(), A002, A003);
            case 527:
                AnonymousClass10G A11 = this.A01.A00;
                return new C190239kb((A2C) A11.AEZ.get(), (C190699lN) A11.AEb.get());
            case 528:
                return new C182589Uy(this);
            case 529:
                AnonymousClass1K1 r2 = this.A00;
                C175698z8 A1Q = r2.A1P();
                AnonymousClass10E r110 = this.A01;
                AnonymousClass00H A004 = C000200d.A00(r110.AW6);
                AnonymousClass00H A005 = C000200d.A00(r2.A9O);
                return new C191429ma((C25181Nf) r110.A2o.get(), A1Q, (C175738zC) r110.AVx.get(), A004, A005);
            case 530:
                AnonymousClass10E r111 = this.A01;
                AnonymousClass1KB r52 = (AnonymousClass1KB) r111.A4b.get();
                C30931ek r132 = (C30931ek) r111.A81.get();
                AnonymousClass1QS r122 = (AnonymousClass1QS) r111.A8J.get();
                AnonymousClass122 r72 = (AnonymousClass122) r111.A2y.get();
                AnonymousClass1QD r92 = (AnonymousClass1QD) r111.A89.get();
                C31061ex r102 = (C31061ex) r111.A8E.get();
                C33701jF r11 = (C33701jF) r111.A8I.get();
                return new C175988zb(r52, (AnonymousClass118) r111.ABY.get(), r72, (C33711jG) r111.A84.get(), r92, r102, r11, r122, r132, (AnonymousClass10I) r111.AC1.get());
            case 531:
                return new C182599Uz(this);
            case 532:
                AnonymousClass10E r112 = this.A01;
                AnonymousClass1KB r6 = (AnonymousClass1KB) r112.A4b.get();
                AnonymousClass118 r73 = (AnonymousClass118) r112.ABY.get();
                AnonymousClass190 r53 = (AnonymousClass190) r112.A31.get();
                AnonymousClass00H A006 = C000200d.A00(r112.A6N);
                C24751Ln r8 = (C24751Ln) r112.ABe.get();
                C30951em r133 = (C30951em) r112.A8K.get();
                AnonymousClass00H A007 = C000200d.A00(r112.A84);
                C33651jA r123 = (C33651jA) r112.A8B.get();
                AnonymousClass00H A008 = C000200d.A00(r112.Acp);
                return new C175708z9(r53, r6, r73, r8, (C18030ve) r112.A04.get(), (A7U) r112.A5E.get(), (C31061ex) r112.A8E.get(), r123, r133, (AnonymousClass10I) r112.AC1.get(), A006, A007, A008);
            case 533:
                return new AnonymousClass9V0(this);
            case 534:
                return new AnonymousClass9V1(this);
            case 535:
                return new AnonymousClass9V2(this);
            case 536:
                return new AnonymousClass9V4(this);
            case 537:
                return new AnonymousClass9V5(this);
            case 538:
                return new AnonymousClass9V6(this);
            case 539:
                AnonymousClass10E r113 = this.A01;
                AnonymousClass118 r74 = (AnonymousClass118) r113.ABY.get();
                return new C1769696n((AnonymousClass1M9) r113.A2f.get(), (C24921Me) r113.ABX.get(), r74, (AnonymousClass1MZ) r113.A4t.get(), (C18030ve) r113.A04.get(), (AnonymousClass10I) r113.AC1.get());
            case 540:
                AnonymousClass00H A009 = C000200d.A00(this.A00.A9c);
                AnonymousClass10E r114 = this.A01;
                AnonymousClass00H A0010 = C000200d.A00(r114.A6N);
                AnonymousClass118 r75 = (AnonymousClass118) r114.ABY.get();
                C18030ve r82 = (C18030ve) r114.A04.get();
                return new AnonymousClass96o((AnonymousClass1M9) r114.A2f.get(), (C24921Me) r114.ABX.get(), r75, r82, (AnonymousClass10I) r114.AC1.get(), A009, A0010);
            case 541:
                AnonymousClass10E r33 = this.A01;
                AnonymousClass00H A0011 = C000200d.A00(r33.A00.ADz);
                return new C198149xr((C35681md) r33.A7N.get(), (AnonymousClass10I) r33.AC1.get(), A0011);
            case 542:
                return new AnonymousClass9V7(this);
            case 543:
                return new AnonymousClass9V8(this);
            case 544:
                return new AnonymousClass9V9(this);
            case 545:
                return new AnonymousClass9VA(this);
            case 546:
                return new AnonymousClass9VB(this);
            case 547:
                return new C84454Jo(this);
            case 548:
                return new C97194p4(this);
            case 549:
                return new C97204p5(this);
            case 550:
                AnonymousClass10E r22 = this.A01;
                return new AnonymousClass383((AnonymousClass1LW) r22.A2G.get(), (AnonymousClass1Cd) r22.A6i.get());
            case 551:
                return new AnonymousClass4XC(C000200d.A00(this.A01.ABd));
            case 552:
                AnonymousClass10E r115 = this.A01;
                AnonymousClass1OZ r76 = (AnonymousClass1OZ) r115.A6N.get();
                return new C48182Lm((AnonymousClass1M9) r115.A2f.get(), (C19830z4) r115.ABl.get(), r76, new C60452o3(), (AnonymousClass10I) r115.AC1.get());
            case 553:
                AnonymousClass10E r116 = this.A01;
                AnonymousClass1OZ r77 = (AnonymousClass1OZ) r116.A6N.get();
                return new C48212Lp((AnonymousClass1M9) r116.A2f.get(), (C19830z4) r116.ABl.get(), r77, new C60452o3(), (AnonymousClass10I) r116.AC1.get());
            case 554:
                AnonymousClass10E r117 = this.A01;
                AnonymousClass1OZ r78 = (AnonymousClass1OZ) r117.A6N.get();
                return new C48222Lq((AnonymousClass1M9) r117.A2f.get(), (C19830z4) r117.ABl.get(), r78, new C60452o3(), (AnonymousClass10I) r117.AC1.get());
            case 555:
                return new C84464Jp(this);
            case 556:
                return new C85894Pd(this);
            case 557:
                return new C183579Yu(C000200d.A00(this.A01.AU3));
            case 558:
                return new C183589Yv(C000200d.A00(this.A01.A3J));
            case 559:
                AnonymousClass10E r34 = this.A01;
                return new C186249dt((AnonymousClass11P) r34.AAv.get(), (C18030ve) r34.A04.get(), C000200d.A00(r34.A06));
            case 560:
                return new AnonymousClass9VD(this);
            case 561:
                AnonymousClass10E r118 = this.A01;
                AnonymousClass00H A0012 = C000200d.A00(r118.A00.A3h);
                AnonymousClass1K1 r23 = this.A00;
                return new RegistrationUpsellProtocolHelper((B8U) r23.A5M.get(), (B8V) r23.A5N.get(), A0012, C000200d.A00(r23.A9s), C000200d.A00(r118.A3c), C000200d.A00(r118.A4U), (C18600wl) r118.A9E.get(), (C18600wl) r118.A9F.get(), (AnonymousClass1OX) r118.A9C.get());
            case 562:
                return new RegistrationUpsellGraphQLHelper(C000200d.A00(this.A01.ABh));
            case 563:
                AnonymousClass10E r24 = this.A01;
                return new C67442zn((AnonymousClass11S) r24.A63.get(), (AnonymousClass11E) r24.A2X.get(), (C23641Hb) r24.A4P.get(), (AnonymousClass18K) r24.A9B.get(), C000200d.A00(this.A00.A9v), C000200d.A00(r24.A04));
            case 564:
                AnonymousClass1F8 builderWithExpectedSize = C199410f.builderWithExpectedSize(22);
                AnonymousClass10E r25 = this.A01;
                builderWithExpectedSize.addAll(AnonymousClass3BK.A00());
                AnonymousClass10G A112 = r25.A00;
                builderWithExpectedSize.add((Object) A112.A89());
                builderWithExpectedSize.add((Object) A112.A18());
                builderWithExpectedSize.add((Object) A112.A4T());
                builderWithExpectedSize.add((Object) A112.A2Z());
                builderWithExpectedSize.add((Object) A112.A38());
                builderWithExpectedSize.add((Object) A112.A8T());
                builderWithExpectedSize.add((Object) A112.A4V());
                builderWithExpectedSize.add((Object) A112.A4X());
                builderWithExpectedSize.add((Object) A112.A5I());
                builderWithExpectedSize.add((Object) A112.A1o());
                builderWithExpectedSize.add((Object) A112.A4b());
                builderWithExpectedSize.add((Object) A112.A4d());
                builderWithExpectedSize.add(A112.AIZ.get());
                builderWithExpectedSize.add((Object) A112.A7W());
                builderWithExpectedSize.add((Object) A112.A7F());
                builderWithExpectedSize.add((Object) A112.A0m());
                builderWithExpectedSize.add((Object) A112.A8t());
                builderWithExpectedSize.add((Object) A112.A7v());
                builderWithExpectedSize.add((Object) A112.A9d());
                builderWithExpectedSize.add((Object) A112.A4Z());
                builderWithExpectedSize.add((Object) A112.ADf());
                return builderWithExpectedSize.build();
            case 565:
                return new C84474Jq(this);
            case 566:
                return new C56462hV(this);
            case 567:
                AnonymousClass10E r119 = this.A01;
                C19830z4 r62 = (C19830z4) r119.ABl.get();
                return new C187499fu((AnonymousClass11C) r119.AAp.get(), r62, (C18030ve) r119.A04.get(), (C36401np) r119.A00.A30.get(), C000200d.A00(r119.A2n));
            case 568:
                return new AnonymousClass9VE(this);
            case 569:
                return new C86004Pu((AnonymousClass118) this.A01.ABY.get());
            case 570:
                AnonymousClass10E r35 = this.A01;
                return new C85334Mz((AnonymousClass118) r35.ABY.get(), (C19830z4) r35.ABl.get(), (C18000vb) r35.ABz.get());
            case 571:
                return new C139756zO((AnonymousClass18K) this.A01.A9B.get());
            case 572:
                return new C84664Kj((AnonymousClass10I) this.A01.AC1.get());
            case 573:
                return new AnonymousClass6ZZ(this);
            case 574:
                return new C137866w9(C000200d.A00(this.A00.AA7));
            case 575:
                AnonymousClass10E r4 = this.A01;
                return new C139046y7((AnonymousClass181) r4.AA9.get(), (AnonymousClass11E) r4.A2X.get(), (C52192aW) r4.A00.A9q.get(), (AnonymousClass1D9) r4.A0n.get());
            case 576:
                AnonymousClass10E r26 = this.A01;
                AnonymousClass00H A0013 = C000200d.A00(r26.A4L);
                AnonymousClass00H A0014 = C000200d.A00(r26.Anv);
                AnonymousClass00H A0015 = C000200d.A00(r26.A34);
                AnonymousClass00H A0016 = C000200d.A00(r26.ADa);
                AnonymousClass10G A113 = r26.A00;
                AnonymousClass00H A0017 = C000200d.A00(A113.A5I);
                AnonymousClass00H A0018 = C000200d.A00(r26.ABv);
                C36401np r79 = (C36401np) A113.A30.get();
                C18030ve r63 = (C18030ve) r26.A04.get();
                return new C1405571y((AnonymousClass1KB) r26.A4b.get(), r63, r79, (AnonymousClass6pB) A113.AJK.get(), A0013, A0014, A0015, A0016, A0017, A0018);
            case 577:
                return new C124616Za(this);
            case 578:
                AnonymousClass00H A0019 = C000200d.A00(this.A01.A4L);
                AnonymousClass1K1 r27 = this.A00;
                return new C128886gq(A0019, C000200d.A00(r27.AA7), C000200d.A00(r27.A9a));
            case 579:
                return new C138076wU((C124626Zb) this.A00.A8E.get(), C000200d.A00(this.A01.Anp));
            case 580:
                return new C124626Zb(this);
            case 581:
                AnonymousClass10E r120 = this.A01;
                AnonymousClass00H A0020 = C000200d.A00(r120.A0V);
                AnonymousClass1K1 r28 = this.A00;
                return new AvatarReactionRepository((AnonymousClass71H) r28.A6F.get(), A0020, C000200d.A00(r28.A6C), C000200d.A00(r120.AEw), C000200d.A00(r120.A00.AFk), C000200d.A00(r28.A6D), C000200d.A00(r120.A2X), (C18600wl) r120.A9F.get(), C27011Uj.A00());
            case 582:
                AnonymousClass10E r29 = this.A01;
                return new AnonymousClass4OC(C000200d.A00(r29.ADn), (C18600wl) r29.A9F.get());
            case 583:
                AnonymousClass71H A20 = this.A00.A1z();
                AnonymousClass3BN.A00(A20);
                return A20;
            case 584:
                AnonymousClass10E r121 = this.A01;
                return new C111065i8((AnonymousClass1SB) r121.AAS.get(), C000200d.A00(r121.AE3), C27011Uj.A00());
            case 585:
                AnonymousClass10E r36 = this.A01;
                AnonymousClass10G A114 = r36.A00;
                C1193267r r64 = (C1193267r) r36.A9P.get();
                EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) A114.A1c.get();
                return new AnonymousClass2E8((C19830z4) r36.ABl.get(), r64, emojiSearchProvider, (C131196kh) this.A00.A6E.get(), (AnonymousClass1L4) A114.A2e.get());
            case 586:
                return new C124636Zc(this);
            case 587:
                return new C124646Zd(this);
            case 588:
                AnonymousClass1K1 r124 = this.A00;
                return new C79663vp(r124.A0u(), C000200d.A00(this.A01.ABv), C000200d.A00(r124.AA1), C000200d.A00(r124.AA2), C000200d.A00(r124.A6l), C000200d.A00(r124.A9z));
            case 589:
                AnonymousClass10E r37 = this.A01;
                return new C120936Gs((AnonymousClass118) r37.ABY.get(), C000200d.A00(r37.AAI), C000200d.A00(r37.A34));
            case 590:
                AnonymousClass10E r210 = this.A01;
                return new C120926Gr((AnonymousClass118) r210.ABY.get(), C000200d.A00(r210.A34));
            case 591:
                AnonymousClass10E r211 = this.A01;
                return new C79373vK((AnonymousClass11S) r211.A63.get(), (C87794Wz) r211.A00.ADP.get());
            case 592:
                return new C120916Gq((AnonymousClass118) this.A01.ABY.get());
            case 593:
                return new C84484Jr(this);
            case 594:
                AnonymousClass10E r212 = this.A01;
                AnonymousClass118 r65 = (AnonymousClass118) r212.ABY.get();
                AnonymousClass71H r83 = (AnonymousClass71H) this.A00.A6F.get();
                return new C134046pv((C25311Ns) r212.A9R.get(), r65, (C18030ve) r212.A04.get(), r83, C000200d.A00(r212.AAP), C000200d.A00(r212.Ajr), C000200d.A00(r212.A00.A2J), (C18600wl) r212.A9F.get());
            case 595:
                AnonymousClass10E r42 = this.A01;
                return new C1405271v((C218617r) r42.A8v.get(), (AnonymousClass11P) r42.AAv.get(), (AnonymousClass18K) r42.A9B.get(), C000200d.A00(r42.Ajt));
            case 596:
                return new C124656Ze(this);
            case 597:
                return new C51122Xb(this);
            case 598:
                AnonymousClass1K1 r0 = this.A00;
                return new C79633vm(r0.A0u(), C000200d.A00(r0.A6n));
            case 599:
                return new C79363vJ((C87794Wz) this.A01.A00.ADP.get());
            default:
                throw new AssertionError(i);
        }
    }

    private Object A0T() {
        int i = this.A02;
        switch (i) {
            case 600:
                return new C84494Js(this);
            case 601:
                return new C124666Zf(this);
            case 602:
                return new C124676Zg(this);
            case 603:
                return new C124686Zh(this);
            case 604:
                AnonymousClass1K1 r0 = this.A00;
                return new C66622yT(r0.AAO, AnonymousClass1K1.A15(r0));
            case 605:
                AnonymousClass1K1 r3 = this.A00;
                AGV A16 = AnonymousClass1K1.A15(r3);
                AGU A0e = r3.A0d();
                AnonymousClass10E r1 = this.A01;
                return new C20554APo((AnonymousClass1FL) r3.A9l.get(), A0e, AnonymousClass10E.A84(r1), A16, (AnonymousClass18K) r1.A9B.get());
            case 606:
                return A01(this.A00.AAO);
            case 607:
                return new C138266wn((AnonymousClass18K) this.A01.A9B.get());
            case 608:
                AnonymousClass1K1 r5 = this.A00;
                AnonymousClass00H A002 = C000200d.A00(r5.A6O);
                AnonymousClass10E r12 = this.A01;
                C93624jH A0m = r5.A0l();
                return new CallHeaderStateHolder((AnonymousClass1VE) r12.ABT.get(), A0m, (C18030ve) r12.A04.get(), (AnonymousClass10I) r12.AC1.get(), A002, C000200d.A00(r5.AAJ), C000200d.A00(r5.A6R), C27011Uj.A00());
            case 609:
                return new C85914Pf((C175258yP) this.A01.A1R.get());
            case 610:
                AnonymousClass10E r13 = this.A01;
                return new C185749d5((AnonymousClass1M9) r13.A2f.get(), (C24921Me) r13.ABX.get(), (AnonymousClass1MW) r13.A7u.get());
            case 611:
                AnonymousClass10E r10 = this.A01;
                AnonymousClass10G A11 = r10.A00;
                return new AnonymousClass4aM((AnonymousClass11S) r10.A63.get(), (C143867Fc) A11.AFD.get(), (C190979lp) this.A00.A9N.get(), (C108895cT) A11.AFB.get(), (AnonymousClass1M9) r10.A2f.get(), (C24921Me) r10.ABX.get(), (C18000vb) r10.ABz.get(), (AnonymousClass1MW) r10.A7u.get(), (VoipCameraManager) r10.ABQ.get(), r10.A8t);
            case 612:
                AnonymousClass10E r52 = this.A01;
                AnonymousClass00H A003 = C000200d.A00(this.A00.A6Q);
                return new C190979lp((C24921Me) r52.ABX.get(), (C18030ve) r52.A04.get(), (AnonymousClass1UL) r52.A4x.get(), A003);
            case 613:
                AnonymousClass10E r14 = this.A01;
                return new C184269ag((AnonymousClass11S) r14.A63.get(), (C18000vb) r14.ABz.get());
            case 614:
                AnonymousClass1K1 r2 = this.A00;
                AnonymousClass00H A004 = C000200d.A00(r2.A6O);
                AnonymousClass10E r15 = this.A01;
                AnonymousClass00H A005 = C000200d.A00(r15.A04);
                AnonymousClass00H A006 = C000200d.A00(r15.A1b);
                C93624jH A0m2 = r2.A0l();
                AnonymousClass00H A007 = C000200d.A00(r2.A6N);
                AnonymousClass00H A008 = C000200d.A00(r2.A9M);
                AnonymousClass00H A009 = C000200d.A00(r2.A9j);
                return new AnonymousClass4aL((C26911Ty) r15.A1J.get(), (AnonymousClass1V9) r15.A1e.get(), A0m2, (C21141AfC) r15.ABO.get(), (C27301Vn) r15.A9A.get(), (C219217x) r15.ABj.get(), (C19830z4) r15.ABl.get(), (AnonymousClass1DC) r15.A95.get(), A004, A005, A006, A007, A008, A009, C27011Uj.A00());
            case 615:
                return new AnonymousClass4N2((C108895cT) this.A01.A00.AFB.get());
            case 616:
                AnonymousClass10E r16 = this.A01;
                return new C88464Zu((C108895cT) r16.A00.AFB.get(), (AnonymousClass1PM) r16.ABM.get(), (C24921Me) r16.ABX.get(), (C18030ve) r16.A04.get(), (AnonymousClass1DC) r16.A95.get());
            case 617:
                AnonymousClass10E r17 = this.A01;
                AnonymousClass1M9 r32 = (AnonymousClass1M9) r17.A2f.get();
                C24921Me r22 = (C24921Me) r17.ABX.get();
                return new AnonymousClass4XN((C108895cT) r17.A00.AFB.get(), r32, r22, (C18030ve) r17.A04.get());
            case 618:
                AnonymousClass1K1 r33 = this.A00;
                AnonymousClass00H A0010 = C000200d.A00(r33.A6O);
                AnonymousClass10E r18 = this.A01;
                AnonymousClass00H A0011 = C000200d.A00(r18.ABd);
                return new AnonymousClass4OO((AnonymousClass1L9) r18.A0E.get(), A0010, A0011, C000200d.A00(r33.A6P), C27011Uj.A00());
            case 619:
                AnonymousClass10E r19 = this.A01;
                return new AnonymousClass4OP((AnonymousClass1M9) r19.A2f.get(), r19.A8t);
            case 620:
                return new AnonymousClass4RC((C26911Ty) this.A01.A1J.get(), C000200d.A00(this.A00.A6O), C27011Uj.A00());
            case 621:
                AnonymousClass1K1 r53 = this.A00;
                C23771Ho A0012 = C27011Uj.A00();
                AnonymousClass10E r110 = this.A01;
                return new C131136kZ((AnonymousClass11S) r110.A63.get(), (AnonymousClass1HQ) r110.A99.get(), (C85914Pf) r53.A6O.get(), r53.A0i(), (AnonymousClass1V9) r110.A1e.get(), A0012);
            case 622:
                return new C125666bS();
            case 623:
                return new AnonymousClass7OY((C18000vb) this.A01.ABz.get(), C000200d.A00(this.A00.A9f));
            case 624:
                AnonymousClass10E r111 = this.A01;
                return new C133976po((AnonymousClass1KB) r111.A4b.get(), (AnonymousClass118) r111.ABY.get(), (C18000vb) r111.ABz.get());
            case 625:
                AnonymousClass10E r112 = this.A01;
                return new WebAuthAccessTokenFetcher((C124696Zi) this.A00.A8F.get(), C000200d.A00(r112.Anp), (C18600wl) r112.A9E.get());
            case 626:
                return new C124696Zi(this);
            case 627:
                return new C61292pR(AnonymousClass10E.AM4());
            case 628:
                AnonymousClass10E r113 = this.A01;
                C18000vb r34 = (C18000vb) r113.ABz.get();
                AnonymousClass11C r23 = (AnonymousClass11C) r113.AAp.get();
                AnonymousClass1KW r54 = (AnonymousClass1KW) r113.A3d.get();
                return A07(r23, r34, (AnonymousClass1L2) r113.A00.A40.get(), r54, (C18030ve) r113.A04.get(), (C18010vc) r113.A9s.get());
            case 629:
                AnonymousClass10E r36 = this.A01;
                AnonymousClass11P r342 = (AnonymousClass11P) r36.AAv.get();
                C18030ve r332 = (C18030ve) r36.A04.get();
                AnonymousClass00H A0013 = C000200d.A00(r36.AYQ);
                AnonymousClass1KB r322 = (AnonymousClass1KB) r36.A4b.get();
                AnonymousClass11S r31 = (AnonymousClass11S) r36.A63.get();
                C32951i1 r30 = (C32951i1) r36.A28.get();
                C34531kd r29 = (C34531kd) r36.A9m.get();
                AnonymousClass10I r28 = (AnonymousClass10I) r36.AC1.get();
                AnonymousClass1LU r27 = (AnonymousClass1LU) r36.ABd.get();
                C24661Le r26 = (C24661Le) r36.AAJ.get();
                C33251iW r25 = (C33251iW) r36.ABA.get();
                C36361nl r24 = (C36361nl) r36.A5h.get();
                AnonymousClass1L9 r232 = (AnonymousClass1L9) r36.A0E.get();
                C27201Vd r222 = (C27201Vd) r36.A2j.get();
                AnonymousClass00H A0014 = C000200d.A00(r36.AC9);
                C32981i4 r21 = (C32981i4) r36.A3G.get();
                AnonymousClass1M9 r20 = (AnonymousClass1M9) r36.A2f.get();
                AnonymousClass1WX r192 = (AnonymousClass1WX) r36.A9N.get();
                C24921Me r182 = (C24921Me) r36.ABX.get();
                C18000vb r172 = (C18000vb) r36.ABz.get();
                AnonymousClass00H A0015 = C000200d.A00(r36.A3w);
                AnonymousClass00H A0016 = C000200d.A00(r36.A7C);
                AnonymousClass00H A0017 = C000200d.A00(r36.ABv);
                AnonymousClass00H A0018 = C000200d.A00(r36.A2A);
                AnonymousClass10G A112 = r36.A00;
                AnonymousClass00H A0019 = C000200d.A00(A112.A4g);
                AnonymousClass00H A0020 = C000200d.A00(r36.A6V);
                AnonymousClass00H A0021 = C000200d.A00(A112.A5I);
                AnonymousClass00H A0022 = C000200d.A00(r36.AJE);
                AnonymousClass00H A0023 = C000200d.A00(r36.A4u);
                AnonymousClass00H A0024 = C000200d.A00(A112.AHd);
                AnonymousClass00H A0025 = C000200d.A00(r36.A34);
                AnonymousClass00H A0026 = C000200d.A00(A112.A8d);
                AnonymousClass00H A0027 = C000200d.A00(r36.AP1);
                AnonymousClass00H A0028 = C000200d.A00(A112.A03);
                C19890zB A0029 = C19880zA.A00();
                AnonymousClass1K1 r02 = this.A00;
                AnonymousClass00H A0030 = C000200d.A00(r02.AAB);
                AnonymousClass00H A0031 = C000200d.A00(r36.AXy);
                AnonymousClass00H A0032 = C000200d.A00(A112.AHc);
                AnonymousClass00H A0033 = C000200d.A00(r36.A95);
                C19890zB r37 = A0029;
                C19890zB r38 = A0029;
                C19890zB r362 = A0029;
                C33251iW r46 = r25;
                AnonymousClass1M9 r47 = r20;
                C24671Lf r48 = (C24671Lf) r36.A2g.get();
                C24921Me r49 = r182;
                C27201Vd r50 = r222;
                C36531o3 r51 = (C36531o3) r36.A2n.get();
                C32951i1 r522 = r30;
                C137986wL r532 = (C137986wL) A112.ADI.get();
                AnonymousClass11Q r542 = (AnonymousClass11Q) r36.A2T.get();
                AnonymousClass11C r55 = (AnonymousClass11C) r36.AAp.get();
                AnonymousClass11P r56 = r342;
                C19830z4 r57 = (C19830z4) r36.ABl.get();
                C18000vb r58 = r172;
                C24681Lg r59 = (C24681Lg) r36.A6Y.get();
                C36391no r60 = (C36391no) r36.A8P.get();
                AnonymousClass1WX r61 = r192;
                C24661Le r62 = r26;
                C32981i4 r63 = r21;
                C18030ve r64 = r332;
                C25931Qe r65 = (C25931Qe) r36.A3z.get();
                AnonymousClass1LU r66 = r27;
                C32861hs r67 = (C32861hs) r36.Agw.get();
                C24641Lc r68 = (C24641Lc) r36.AAB.get();
                C32741hg r69 = (C32741hg) r36.AAL.get();
                AnonymousClass10I r70 = r28;
                AnonymousClass73X r71 = (AnonymousClass73X) A112.A9Q.get();
                return new C131166kc(A0029, r362, r37, r38, r232, (C61862qP) r02.A7g.get(), r322, r24, r31, r29, (C40751vD) r36.AB7.get(), r46, r47, r48, r49, r50, r51, r522, r532, r542, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A0030, A0031, A0032, A0033, C000200d.A00(r36.AaG));
            case 630:
                AnonymousClass10E r210 = this.A01;
                return new C138316ws((AnonymousClass1KB) r210.A4b.get(), this.A00.A1u(), (AnonymousClass10I) r210.AC1.get());
            case 631:
                Range range = C112285lE.A0M;
                AnonymousClass10E r114 = this.A01;
                AnonymousClass1K1 r132 = this.A00;
                AnonymousClass1DC r252 = (AnonymousClass1DC) r114.A95.get();
                return new C112285lE((C124706Zj) r132.A8G.get(), (C124716Zk) r132.A8H.get(), (C124726Zl) r132.A8I.get(), (C124736Zm) r132.A8J.get(), (C124746Zn) r132.A8K.get(), (C124756Zo) r132.A8L.get(), (C124766Zp) r132.A8M.get(), (C124776Zq) r132.A8N.get(), (C124786Zr) r132.A8O.get(), (C143867Fc) r114.A00.AFD.get(), (C18030ve) r114.A04.get(), r252, r114.A8t);
            case 632:
                return new C124706Zj(this);
            case 633:
                return new C124716Zk(this);
            case 634:
                return new C124726Zl(this);
            case 635:
                return new C124736Zm(this);
            case 636:
                return new C124746Zn(this);
            case 637:
                return new C124756Zo(this);
            case 638:
                return new C124766Zp(this);
            case 639:
                return new C124776Zq(this);
            case 640:
                return new C124786Zr(this);
            default:
                throw new AssertionError(i);
        }
    }

    public Object get() {
        int i = this.A02;
        switch (i / 100) {
            case 0:
                return A0N();
            case 1:
                return A0O();
            case 2:
                return A0P();
            case 3:
                return A0Q();
            case 4:
                return A0R();
            case 5:
                return A0S();
            case 6:
                return A0T();
            default:
                throw new AssertionError(i);
        }
    }

    public static Fragment A00(C19880zA r1) {
        Object A06 = r1.A06(new MediaPickerFragment());
        C18070vi.A0X(A06);
        Fragment fragment = (Fragment) A06;
        AnonymousClass00W.A02(fragment);
        return fragment;
    }

    public static C85644Oe A07(AnonymousClass11C r1, C18000vb r2, AnonymousClass1L2 r3, AnonymousClass1KW r4, C18030ve r5, C18010vc r6) {
        return new C85644Oe(r1, r2, r3, r4, r5, r6);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.2c9] */
    public static C53202c9 A09() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2hA, java.lang.Object] */
    public static C56252hA A0A() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4OV, java.lang.Object] */
    public static AnonymousClass4OV A0B() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2gI, java.lang.Object] */
    public static C55742gI A0C() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.4Zs] */
    public static C88444Zs A0D() {
        return new Object();
    }

    public static C56052gp A0E() {
        return new C56052gp();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.4MU] */
    public static AnonymousClass4MU A0F() {
        return new Object();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2cA, java.lang.Object] */
    public static C53212cA A0G() {
        return new Object();
    }

    public static AnonymousClass4X5 A0H() {
        return new AnonymousClass4X5();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2cB, java.lang.Object] */
    public static C53222cB A0I() {
        return new Object();
    }

    public static C87724Ws A0J() {
        return new C87724Ws();
    }

    public static GalleryTabHostFragment A0K() {
        return new GalleryTabHostFragment();
    }

    public static NewMediaPickerFragment A0L() {
        return new NewMediaPickerFragment();
    }

    public static Set A0U() {
        return new HashSet();
    }

    public static AnonymousClass1FL A01(Activity activity) {
        AnonymousClass1FL A022 = A02(activity);
        AnonymousClass00W.A02(A022);
        return A022;
    }

    public static void A0V(Fragment fragment) {
        AnonymousClass00W.A02(fragment);
    }
}
