package X;

import android.content.ClipData;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioFormat;
import android.media.Image;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import android.util.Range;
import android.util.SparseIntArray;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.android.exoplayer2.util.Util;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.payments.ui.PaymentContactPickerFragment;
import com.whatsapp.videoplayback.BloksVideoPlayerView;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.security.cert.CertPath;
import java.security.cert.X509Certificate;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.xml.security.signature.XMLSignatureInput;

public abstract class BEB {
    public static double A00(int i, int i2) {
        return Math.sqrt((double) ((((float) (i * i)) / 4.0f) + (((float) (i2 * i2)) / 4.0f)));
    }

    public static int A01(int i) {
        return AnonymousClass00R.A00(3).length + (i * AnonymousClass00R.A00(4).length);
    }

    public static int A05(int i, byte[] bArr, int i2, int i3) {
        int i4 = i3 + 1;
        return (bArr[i4 + 1] & 255) | i | i2 | ((bArr[i4] & 255) << 8);
    }

    public static Pair A0L(Pair pair, C25997CqD cqD) {
        if (pair.first == null) {
            return Pair.create((Object) null, cqD);
        }
        if (pair.second == null) {
            return Pair.create(cqD, (Object) null);
        }
        E9N e9n = new C25709Ckf(cqD).A00;
        e9n.CII((ClipData) pair.first);
        C25997CqD BDP = e9n.BDP();
        E9N e9n2 = new C25709Ckf(cqD).A00;
        e9n2.CII((ClipData) pair.second);
        return Pair.create(BDP, e9n2.BDP());
    }

    public static Range A0M(int[] iArr, int i) {
        int i2 = iArr[0];
        if (i != 0) {
            return Range.create(Integer.valueOf(i2 / 1000), Integer.valueOf(iArr[1] / 1000));
        }
        return Range.create(Integer.valueOf(i2), Integer.valueOf(iArr[1]));
    }

    public static IllegalArgumentException A0S(int i) {
        return new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{Integer.valueOf(i)}));
    }

    public static Object A0V() {
        return Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
    }

    public static Object A0Y(C5x c5x, Object obj, int i) {
        if (i != 0) {
            String str = (String) obj;
            if (AnonymousClass1YE.A0A(str, "$.", false)) {
                return c5x.A00(str);
            }
        }
        return obj;
    }

    public static Object A0Z(Class cls) {
        return cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{false});
    }

    public static void A0j(int i, int i2, char[] cArr, int i3) {
        int i4 = i | i2;
        cArr[i3] = (char) ((i4 >>> 10) + 55232);
        cArr[i3 + 1] = (char) ((i4 & 1023) + 56320);
    }

    public static void A0k(int i, int i2, int[] iArr, int i3) {
        int i4 = i ^ i2;
        int i5 = i2 ^ ((((-2139062144 & i4) >>> 7) * 27) ^ ((2139062143 & i4) << 1));
        int i6 = i5 & -1061109568;
        int i7 = i6 ^ (i6 >>> 1);
        int i8 = i4 ^ ((i7 >>> 5) ^ (((1061109567 & i5) << 2) ^ (i7 >>> 2)));
        iArr[i3] = i5 ^ (i8 ^ ((i8 << -16) | (i8 >>> 16)));
    }

    public static void A0n(Rect rect, RectF rectF, float f, float f2) {
        rectF.set(f + f2, ((float) rect.top) + f2, ((float) rect.right) - f2, ((float) rect.bottom) - f2);
    }

    public static void A0r(C17130tn r2, AnonymousClass04D r3) {
        r3.invoke(new AnonymousClass0OT(r2), r2, 0);
        r2.COB(2058660585);
    }

    public static void A0s(SwipeRefreshLayout swipeRefreshLayout, float f, int i, int i2) {
        swipeRefreshLayout.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout.A0C.getTop());
    }

    public static void A14(Class cls) {
        cls.getMethod("objectFieldOffset", new Class[]{Field.class});
        Class<Class> cls2 = Class.class;
        cls.getMethod("arrayBaseOffset", new Class[]{cls2});
        cls.getMethod("arrayIndexScale", new Class[]{cls2});
    }

    public static void A15(Class cls) {
        Class cls2 = Long.TYPE;
        cls.getMethod("getInt", new Class[]{cls2});
        cls.getMethod("putInt", new Class[]{cls2, Integer.TYPE});
    }

    public static void A16(Class cls) {
        Class<Object> cls2 = Object.class;
        Class cls3 = Long.TYPE;
        cls.getMethod("getInt", new Class[]{cls2, cls3});
        cls.getMethod("putInt", new Class[]{cls2, cls3, Integer.TYPE});
        cls.getMethod("getLong", new Class[]{cls2, cls3});
        cls.getMethod("putLong", new Class[]{cls2, cls3, cls3});
        cls.getMethod("getObject", new Class[]{cls2, cls3});
        cls.getMethod("putObject", new Class[]{cls2, cls3, cls2});
    }

    public static void A1S(XMLSignatureInput xMLSignatureInput) {
        xMLSignatureInput.b = null;
        xMLSignatureInput.c = null;
        xMLSignatureInput.d = null;
        xMLSignatureInput.e = null;
        xMLSignatureInput.f = false;
        xMLSignatureInput.g = false;
        xMLSignatureInput.h = null;
        xMLSignatureInput.m = null;
        xMLSignatureInput.n = null;
        xMLSignatureInput.i = new ArrayList();
        xMLSignatureInput.j = false;
        xMLSignatureInput.k = null;
    }

    public static void A1T(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void A1U(byte[] bArr, int i, long j) {
        bArr[28] = (byte) i;
        bArr[29] = (byte) ((int) (j >> 1));
        bArr[30] = (byte) ((int) (j >> 9));
        bArr[31] = (byte) ((int) (j >> 17));
    }

    public static void A1V(int[] iArr) {
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
        iArr[8] = 0;
        iArr[9] = 0;
    }

    public static void A1W(Object[] objArr) {
        objArr[0] = "zzd";
        objArr[1] = "zze";
        objArr[2] = "zzf";
        objArr[3] = "zzg";
        objArr[4] = "zzh";
    }

    public static void A1X(Object[] objArr) {
        objArr[0] = "unspecified";
        objArr[1] = "keyCompromise";
        objArr[2] = "cACompromise";
        objArr[3] = "affiliationChanged";
        objArr[4] = "superseded";
        objArr[5] = "cessationOfOperation";
        objArr[6] = "certificateHold";
        objArr[7] = "unknown";
        objArr[8] = "removeFromCRL";
        objArr[9] = "privilegeWithdrawn";
        objArr[10] = "aACompromise";
    }

    public static boolean A1Z(Class cls, Object obj) {
        Class<byte[]> cls2 = byte[].class;
        Class cls3 = Boolean.TYPE;
        cls.getMethod("peekLong", new Class[]{obj, cls3});
        cls.getMethod("pokeLong", new Class[]{obj, Long.TYPE, cls3});
        Class cls4 = Integer.TYPE;
        cls.getMethod("pokeInt", new Class[]{obj, cls4, cls3});
        cls.getMethod("peekInt", new Class[]{obj, cls3});
        cls.getMethod("pokeByte", new Class[]{obj, Byte.TYPE});
        cls.getMethod("peekByte", new Class[]{obj});
        cls.getMethod("pokeByteArray", new Class[]{obj, cls2, cls4, cls4});
        cls.getMethod("peekByteArray", new Class[]{obj, cls2, cls4, cls4});
        return true;
    }

    public static int[] A1b() {
        return new int[]{1, 2, 3, 4, 5, 6, 7};
    }

    public static int A02(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        if ((i & -268435456) == 0) {
            return 4;
        }
        return 5;
    }

    public static int A03(int i, int i2, int i3) {
        int i4 = (i & 3) << 3;
        return ((i3 & 255) << i4) | (i2 & ((255 << i4) ^ -1));
    }

    public static int A08(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int A09(byte[] bArr, int i) {
        byte b = bArr[i] & 255;
        byte b2 = bArr[i + 1] & 255;
        byte b3 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (b2 << 8) | b | (b3 << 16);
    }

    public static int A0A(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static int A0B(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >> 8);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >> 16);
        return i5;
    }

    public static int A0C(byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) (i2 & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >> 16) & 255);
        return i5;
    }

    public static long A0E(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public static long A0F(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) << 8) & 65280);
    }

    public static long A0G(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static long A0H(byte[] bArr, int i) {
        long j = (long) bArr[i];
        long j2 = (long) bArr[i + 2];
        long j3 = (long) bArr[i + 3];
        long j4 = (long) bArr[i + 4];
        long j5 = (long) bArr[i + 5];
        return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((j5 & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static AudioFormat A0I(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static Uri A0J(URI uri) {
        return new Uri.Builder().scheme(uri.getScheme()).encodedAuthority(uri.getRawAuthority()).encodedPath(uri.getRawPath()).encodedQuery(uri.getRawQuery()).encodedFragment(uri.getRawFragment()).build();
    }

    public static BadParcelableException A0K(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Parcel data not fully consumed, unread size: ");
        sb.append(i);
        return new BadParcelableException(sb.toString());
    }

    public static IOException A0R(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(obj);
        return new IOException(sb.toString());
    }

    public static IndexOutOfBoundsException A0U(StringBuilder sb, int i) {
        sb.append("Beginning index: ");
        sb.append(i);
        sb.append(" < 0");
        return new IndexOutOfBoundsException(sb.toString());
    }

    public static String A0f(StringBuilder sb, int i, int i2) {
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static StringBuffer A0g(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("No message with ID \"");
        stringBuffer.append(str);
        stringBuffer.append("\" found in resource bundle \"");
        stringBuffer.append("org/apache/xml/security/resource/xmlsecurity");
        return stringBuffer;
    }

    public static StringBuilder A0h(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("remaining delay=[");
        sb.append(((Delayed) obj).getDelay(TimeUnit.MILLISECONDS));
        return sb;
    }

    public static void A0l(ColorStateList colorStateList, Drawable drawable, int[] iArr, int[] iArr2, float f) {
        if (drawable != null) {
            C27831Xu.A0C(drawable, AnonymousClass1Z2.A03(f, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
        }
    }

    public static void A0p(SparseIntArray sparseIntArray) {
        sparseIntArray.put(10241, 9729);
        sparseIntArray.put(10240, 9729);
        sparseIntArray.put(10242, 33071);
        sparseIntArray.put(10243, 33071);
    }

    public static void A0q(View view, float f, float f2) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(250);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        view.startAnimation(animationSet);
    }

    public static void A0u(AnonymousClass1K1 r1, C36241nZ r2, AnonymousClass10E r3, ContactPickerFragment contactPickerFragment, Object obj) {
        contactPickerFragment.A1l = (AnonymousClass4YE) obj;
        contactPickerFragment.A0O = (C56522hb) r2.A0V.get();
        contactPickerFragment.A0f = (AnonymousClass1M9) r3.A2f.get();
        contactPickerFragment.A0k = (C24921Me) r3.ABX.get();
        contactPickerFragment.A19 = (C18000vb) r3.ABz.get();
        contactPickerFragment.A2G = C000200d.A00(r3.A2b);
        contactPickerFragment.A1a = (C36511o1) r1.A4C.get();
        contactPickerFragment.A1J = (AnonymousClass1Cd) r3.A6i.get();
        contactPickerFragment.A17 = (C219217x) r3.ABj.get();
        contactPickerFragment.A18 = (C19830z4) r3.ABl.get();
        contactPickerFragment.A2n = C000200d.A00(r3.AAD);
        contactPickerFragment.A1i = (AnonymousClass1QS) r3.A8J.get();
    }

    public static void A0v(C36241nZ r1, AnonymousClass10E r2, AnonymousClass10G r3, ContactPickerFragment contactPickerFragment, AnonymousClass00H r5) {
        contactPickerFragment.A2C = r5;
        contactPickerFragment.A11 = (C36521o2) r2.A2l.get();
        contactPickerFragment.A13 = (C25161Nd) r2.A2v.get();
        contactPickerFragment.A1H = (C26051Qq) r2.AUB.get();
        contactPickerFragment.A1n = (C32741hg) r2.AAL.get();
        contactPickerFragment.A1E = (C48122Lg) r2.A35.get();
        contactPickerFragment.A0I = C19890zB.A00;
        contactPickerFragment.A0z = (C678831f) r3.A10.get();
        contactPickerFragment.A0d = AnonymousClass10E.A48(r2);
        contactPickerFragment.A0b = (A4u) r2.A1k.get();
        contactPickerFragment.A1r = C36241nZ.A0q(r1);
        contactPickerFragment.A2J = C000200d.A00(r2.A2n);
        contactPickerFragment.A2O = C000200d.A00(r3.A8i);
        contactPickerFragment.A1u = (AnonymousClass1NL) r2.A3u.get();
    }

    public static void A0w(C36241nZ r1, AnonymousClass10E r2, AnonymousClass10G r3, ContactPickerFragment contactPickerFragment, Object obj) {
        contactPickerFragment.A1I = (AnonymousClass1MZ) obj;
        contactPickerFragment.A2a = C000200d.A00(r2.AXW);
        contactPickerFragment.A1j = (C18010vc) r2.A9s.get();
        contactPickerFragment.A2m = C000200d.A00(r3.A4e);
        contactPickerFragment.A1K = (AnonymousClass1MW) r2.A7u.get();
        contactPickerFragment.A0h = (C37511pf) r2.AX7.get();
        contactPickerFragment.A2r = C000200d.A00(r1.A1j);
        contactPickerFragment.A12 = (AnonymousClass1US) r2.AIh.get();
        contactPickerFragment.A0P = (AnonymousClass6a2) r1.A0W.get();
        contactPickerFragment.A1G = (C25181Nf) r2.A2o.get();
        contactPickerFragment.A2U = C000200d.A00(r2.A4u);
        contactPickerFragment.A2e = C000200d.A00(r1.A1O);
        contactPickerFragment.A1g = (C36921og) r3.A1S.get();
    }

    public static void A0y(AnonymousClass10E r1, AnonymousClass10G r2, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A1W = (AnonymousClass18K) r1.A9B.get();
        contactPickerFragment.A0W = (AnonymousClass181) r1.AA9.get();
        contactPickerFragment.A1T = (AnonymousClass1KW) r1.A3d.get();
        contactPickerFragment.A0V = (AnonymousClass18O) r1.A9p.get();
        contactPickerFragment.A1N = (C24661Le) r1.AAJ.get();
        contactPickerFragment.A0X = (C36271nc) r2.A4x.get();
    }

    public static void A10(AnonymousClass10E r1, AnonymousClass1FU r2) {
        r2.A0E = (C18030ve) r1.A04.get();
        r2.A05 = (AnonymousClass1KB) r1.A4b.get();
        r2.A03 = (AnonymousClass190) r1.A31.get();
        C63932tv.A03(r2, (C218617r) r1.A8v.get());
        r2.A0D = (AnonymousClass1KW) r1.A3d.get();
        C63932tv.A04(r2, (AnonymousClass18O) r1.A9p.get());
        r2.A08 = (AnonymousClass11C) r1.AAp.get();
        r2.A0A = (C19830z4) r1.ABl.get();
    }

    public static void A11(AnonymousClass10E r1, ContactPickerFragment contactPickerFragment, Object obj) {
        contactPickerFragment.A0Z = (C33251iW) obj;
        contactPickerFragment.A1z = (C34481kY) r1.ABK.get();
        contactPickerFragment.A1U = (C18030ve) r1.A04.get();
        contactPickerFragment.A1m = (C24641Lc) r1.AAB.get();
        contactPickerFragment.A23 = C000200d.A00(r1.A0p);
        contactPickerFragment.A1s = (AnonymousClass1K3) r1.A30.get();
        contactPickerFragment.A2s = C000200d.A00(r1.Amp);
        contactPickerFragment.A0S = (AnonymousClass1KB) r1.A4b.get();
        contactPickerFragment.A0n = (C27201Vd) r1.A2j.get();
        contactPickerFragment.A0T = (AnonymousClass11S) r1.A63.get();
        contactPickerFragment.A1v = (AnonymousClass1PU) r1.A4j.get();
        contactPickerFragment.A1Z = (C25841Pv) r1.A4p.get();
    }

    public static void A17(Object obj, Object obj2) {
        C17130tn r2 = (C17130tn) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && r2.BZO()) {
            r2.CNR();
        }
    }

    public static void A18(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[41] = obj;
        objArr[42] = obj2;
        objArr[43] = obj3;
        objArr[44] = obj4;
    }

    public static void A19(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[45] = obj;
        objArr[46] = obj2;
        objArr[47] = obj3;
        objArr[48] = obj4;
    }

    public static void A1A(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[52] = obj;
        objArr[53] = obj2;
        objArr[54] = obj3;
        objArr[55] = obj4;
    }

    public static void A1B(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[56] = obj;
        objArr[57] = obj2;
        objArr[58] = obj3;
        objArr[59] = obj4;
    }

    public static void A1C(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[61] = obj;
        objArr[62] = obj2;
        objArr[63] = obj3;
        objArr[64] = obj4;
    }

    public static void A1D(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[67] = obj;
        objArr[68] = obj2;
        objArr[69] = obj3;
        objArr[70] = obj4;
    }

    public static void A1E(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[72] = obj;
        objArr[73] = obj2;
        objArr[74] = obj3;
        objArr[75] = obj4;
    }

    public static void A1F(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[76] = obj;
        objArr[77] = obj2;
        objArr[78] = obj3;
        objArr[79] = obj4;
    }

    public static void A1G(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[83] = obj;
        objArr[84] = obj2;
        objArr[85] = obj3;
        objArr[86] = obj4;
    }

    public static void A1H(Object obj, Object obj2, Object obj3, Object obj4, Object[] objArr) {
        objArr[87] = obj;
        objArr[88] = obj2;
        objArr[89] = obj3;
        objArr[90] = obj4;
    }

    public static void A1I(Object obj, Object obj2, Throwable th, Logger logger) {
        Level level = Level.SEVERE;
        StringBuilder sb = new StringBuilder();
        sb.append("RuntimeException while executing runnable ");
        sb.append(obj);
        sb.append(" with executor ");
        sb.append(obj2);
        logger.log(level, sb.toString(), th);
    }

    public static void A1J(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, "SHA512WITHCVC-ECDSA");
        abstractMap.put(EB2.A00, "XMSS");
        abstractMap.put(EB2.A01, "XMSSMT");
        abstractMap.put(new AnonymousClass1C0("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        abstractMap.put(new AnonymousClass1C0("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        abstractMap.put(new AnonymousClass1C0("1.2.840.10040.4.3"), "SHA1WITHDSA");
        abstractMap.put(EBM.A0X, "SHA1WITHECDSA");
        abstractMap.put(EBM.A0Z, "SHA224WITHECDSA");
        abstractMap.put(EBM.A0a, "SHA256WITHECDSA");
        abstractMap.put(EBM.A0b, "SHA384WITHECDSA");
        abstractMap.put(EBM.A0c, "SHA512WITHECDSA");
        abstractMap.put(AnonymousClass1C6.A0B, "SHA1WITHRSA");
        abstractMap.put(AnonymousClass1C6.A05, "SHA1WITHDSA");
        abstractMap.put(AnonymousClass1C9.A01, "SHA224WITHDSA");
        abstractMap.put(AnonymousClass1C9.A02, "SHA256WITHDSA");
    }

    public static void A1K(Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, "SHA384WITHRSA");
        abstractMap.put(AnonymousClass1Bw.A2G, "SHA512WITHRSA");
        abstractMap.put(EBJ.A0M, "GOST3411WITHGOST3410");
        abstractMap.put(EBJ.A0L, "GOST3411WITHECGOST3410");
        abstractMap.put(EBC.A0H, "GOST3411-2012-256WITHECGOST3410-2012-256");
        abstractMap.put(EBC.A0I, "GOST3411-2012-512WITHECGOST3410-2012-512");
        abstractMap.put(EBE.A03, "SHA1WITHPLAIN-ECDSA");
        abstractMap.put(EBE.A04, "SHA224WITHPLAIN-ECDSA");
        abstractMap.put(EBE.A05, "SHA256WITHPLAIN-ECDSA");
        abstractMap.put(EBE.A06, "SHA384WITHPLAIN-ECDSA");
        abstractMap.put(EBE.A07, "SHA512WITHPLAIN-ECDSA");
        abstractMap.put(EBE.A02, "RIPEMD160WITHPLAIN-ECDSA");
        abstractMap.put(EBF.A0C, "SHA1WITHCVC-ECDSA");
        abstractMap.put(EBF.A0D, "SHA224WITHCVC-ECDSA");
        abstractMap.put(EBF.A0E, "SHA256WITHCVC-ECDSA");
        abstractMap.put(EBF.A0F, "SHA384WITHCVC-ECDSA");
    }

    public static void A1L(String str, String str2, String str3, StringBuffer stringBuffer) {
        stringBuffer.append("    ");
        stringBuffer.append(str);
        stringBuffer.append(":");
        stringBuffer.append(str2);
        stringBuffer.append("    ");
        stringBuffer.append("    ");
        stringBuffer.append(str3);
        stringBuffer.append(str2);
    }

    public static void A1M(StringBuilder sb, int i) {
        sb.append('\\');
        sb.append((char) (((i >>> 6) & 3) + 48));
        sb.append((char) (((i >>> 3) & 7) + 48));
    }

    public static void A1N(StringBuilder sb, int i, int i2, int i3, int i4) {
        sb.append(" l:");
        sb.append(i);
        sb.append(", t:");
        sb.append(i2);
        sb.append(", r:");
        sb.append(i3);
        sb.append(", col:");
        sb.append(i4);
        sb.append(", row:");
    }

    public static void A1O(Method method, AbstractCollection abstractCollection, AbstractMap abstractMap, AbstractMap abstractMap2) {
        abstractMap.put(method.getName(), method);
        if (method.getParameterTypes().length == 0) {
            abstractMap2.put(method.getName(), method);
            if (method.getName().startsWith("get")) {
                abstractCollection.add(method.getName());
            }
        }
    }

    public static void A1P(Method method, AbstractMap abstractMap, AbstractMap abstractMap2) {
        boolean startsWith = method.getName().startsWith("has");
        String name = method.getName();
        if (startsWith) {
            abstractMap.put(name, method);
        } else if (name.startsWith("get")) {
            abstractMap2.put(method.getName(), method);
        }
    }

    public static void A1Q(AbstractCollection abstractCollection) {
        abstractCollection.remove(C26295Cx7.A08);
        abstractCollection.remove(C26295Cx7.A03);
        abstractCollection.remove(C26295Cx7.A0B);
        abstractCollection.remove(C26295Cx7.A06);
        abstractCollection.remove(C26295Cx7.A07);
        abstractCollection.remove(C26295Cx7.A05);
        abstractCollection.remove(C26295Cx7.A0A);
        abstractCollection.remove(C26295Cx7.A02);
        abstractCollection.remove(C26295Cx7.A0C);
        abstractCollection.remove(C26295Cx7.A09);
    }

    public static void A1R(AbstractCollection abstractCollection, long j) {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.nativeOrder());
        order.putLong(j);
        abstractCollection.add(order.array());
    }

    public static boolean A1Y(Parcel parcel, Parcelable parcelable) {
        parcel.writeInterfaceToken("com.facebook.wearable.applinks.IAppLinkServiceV2");
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return false;
        }
        parcel.writeInt(0);
        return false;
    }

    public static int A04(int i, String str) {
        GLES20.glShaderSource(i, str);
        GLES20.glCompileShader(i);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(i, 35713, iArr, 0);
        return iArr[0];
    }

    public static int A06(Image image, int i) {
        return Integer.valueOf(image.getPlanes()[i].getRowStride()).intValue();
    }

    public static int A07(CertPath certPath, int i, int i2) {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        if (x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN()) || i2 == 0) {
            return i2;
        }
        return i2 - 1;
    }

    public static long A0D(List list, int i) {
        long longValue = ((Number) list.get(i)).longValue();
        return (longValue >> 63) ^ (longValue << 1);
    }

    public static C16870tM A0N(C17130tn r2, C16340s6 r3) {
        r2.COB(693286680);
        C16870tM A00 = C03930Le.A00(AnonymousClass0OB.A01, r2, r3);
        r2.COB(-1323940314);
        return A00;
    }

    public static DHS A0O(Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        ((Number) entry.getKey()).intValue();
        return (DHS) entry.getValue();
    }

    public static AnonymousClass1K1 A0P(C36241nZ r1, AnonymousClass10E r2, AnonymousClass10G r3, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A2d = C000200d.A00(r2.A6N);
        contactPickerFragment.A0J = (AnonymousClass1L9) r2.A0E.get();
        contactPickerFragment.A1d = (C34501ka) r2.A68.get();
        contactPickerFragment.A2D = C000200d.A00(r2.A2A);
        contactPickerFragment.A1h = (AnonymousClass1c4) r2.A7C.get();
        contactPickerFragment.A10 = (AnonymousClass12E) r2.A2k.get();
        AnonymousClass1K1 r12 = r1.A2O;
        contactPickerFragment.A2N = C000200d.A00(r12.A0u);
        contactPickerFragment.A0u = (AnonymousClass733) r3.A2s.get();
        return r12;
    }

    public static C122136Mx A0Q(BloksVideoPlayerView bloksVideoPlayerView) {
        AnonymousClass118 waContext = bloksVideoPlayerView.getWaContext();
        WamediaManager wamediaManager = bloksVideoPlayerView.getWamediaManager();
        String A08 = Util.A08(bloksVideoPlayerView.getContext(), bloksVideoPlayerView.getContext().getString(2131898700));
        C18070vi.A0X(A08);
        return new C122136Mx(waContext, wamediaManager, A08);
    }

    public static IllegalArgumentException A0T(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.getClass().getName());
        return new IllegalArgumentException(sb.toString());
    }

    public static Object A0W(Parcel parcel, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        parcel.writeString((String) entry.getKey());
        return entry.getValue();
    }

    public static Object A0X(AnonymousClass10E r1, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A0j = (AnonymousClass1PM) r1.ABM.get();
        return r1.A4t.get();
    }

    public static Object A0a(String str) {
        return Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static String A0b(int i, Object[] objArr) {
        objArr[1] = Integer.valueOf(i);
        objArr[2] = 1;
        return String.format("Pos: %d, limit: %d, len: %d", objArr);
    }

    public static String A0c(E9W e9w) {
        if (e9w.CBP().Bfe()) {
            return null;
        }
        return e9w.CBP().COi();
    }

    public static String A0d(Object obj, Throwable th) {
        String name = obj.getClass().getName();
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        String obj2 = sb.toString();
        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(obj2), th);
        String name2 = th.getClass().getName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append(obj2);
        sb2.append(" threw ");
        sb2.append(name2);
        sb2.append(">");
        return sb2.toString();
    }

    public static String A0e(String str, Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf.length() != 0) {
            return str.concat(valueOf);
        }
        return new String(str);
    }

    public static FloatBuffer A0i(float[] fArr, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        return asFloatBuffer;
    }

    public static void A0m(Path path, AbstractList abstractList, int i) {
        path.lineTo(((PointF) abstractList.get(i)).x, ((PointF) abstractList.get(i)).y);
    }

    public static void A0o(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static void A0t(AnonymousClass1K1 r1, C36241nZ r2, AnonymousClass10E r3, AnonymousClass10G r4, ContactPickerFragment contactPickerFragment) {
        contactPickerFragment.A1C = (C30801eX) r3.AL8.get();
        contactPickerFragment.A2K = C000200d.A00(r1.A0q);
        contactPickerFragment.A1B = (C30781eV) r3.A37.get();
        contactPickerFragment.A0N = (C56422hR) r1.A2t.get();
        contactPickerFragment.A14 = (AnonymousClass11Q) r3.A2T.get();
        contactPickerFragment.A0e = (AnonymousClass11E) r3.A2X.get();
        contactPickerFragment.A25 = C000200d.A00(r1.A0E);
        contactPickerFragment.A0Q = (AnonymousClass6a3) r2.A0X.get();
        contactPickerFragment.A2l = C000200d.A00(r3.Ag3);
        contactPickerFragment.A1e = (A17) r4.A0Z.get();
        contactPickerFragment.A1S = (AnonymousClass1PR) r3.AKV.get();
        contactPickerFragment.A2h = C000200d.A00(r4.AE1);
    }

    public static void A0x(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass1FU r3) {
        r3.A0F = (AnonymousClass1L1) r2.A45.get();
        C63932tv.A05(r3, (AnonymousClass11E) r1.A2X.get());
        C63932tv.A07(r3, (AnonymousClass11O) r1.ABn.get());
        r3.A0C = (AnonymousClass1L2) r2.A40.get();
    }

    public static void A0z(AnonymousClass10E r1, AnonymousClass10G r2, ContactPickerFragment contactPickerFragment) {
        C34701kw.A00(contactPickerFragment, AnonymousClass10G.A8i(r2));
        contactPickerFragment.A2q = C000200d.A00(r2.A4w);
        contactPickerFragment.A2X = C000200d.A00(r2.A2r);
        contactPickerFragment.A2W = C000200d.A00(r1.A5U);
        contactPickerFragment.A2c = C000200d.A00(r1.AYQ);
        contactPickerFragment.A16 = (AnonymousClass11P) r1.AAv.get();
        contactPickerFragment.A2g = C000200d.A00(r2.A3O);
        contactPickerFragment.A0L = (AnonymousClass190) r1.A31.get();
        contactPickerFragment.A0U = (C34531kd) r1.A9m.get();
        contactPickerFragment.A1y = (AnonymousClass10I) r1.AC1.get();
        contactPickerFragment.A1F = (AnonymousClass1CJ) r1.A2H.get();
        contactPickerFragment.A21 = C000200d.A00(r2.A00);
        contactPickerFragment.A1c = (C32011gU) r1.A5k.get();
    }

    public static void A12(AnonymousClass10E r1, PaymentContactPickerFragment paymentContactPickerFragment) {
        paymentContactPickerFragment.A01 = (C24751Ln) r1.ABe.get();
        paymentContactPickerFragment.A03 = (AnonymousClass1QO) r1.A8G.get();
        paymentContactPickerFragment.A02 = (ALX) r1.AcF.get();
        paymentContactPickerFragment.A00 = (AnonymousClass1QR) r1.A8D.get();
    }

    public static void A13(C62572rc r1, AnonymousClass21V r2) {
        File file;
        if (AnonymousClass1EG.A0H(r2.A19()) && (file = r1.A0G) != null) {
            r2.A09 = file.getName();
        }
    }

    public static boolean A1a(Object obj, AbstractList abstractList) {
        int indexOf = abstractList.indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        abstractList.remove(indexOf);
        return true;
    }
}
