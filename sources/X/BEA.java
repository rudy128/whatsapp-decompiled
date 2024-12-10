package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.location.Location;
import android.media.MediaCodec;
import android.net.Uri;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.JsonReader;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.widget.TextView;
import androidx.compose.ui.Alignment;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.recaptcha.internal.zzhc;
import com.google.android.recaptcha.internal.zzhd;
import com.google.android.recaptcha.internal.zzin;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.jid.UserJid;
import java.io.StringReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.AbstractCollection;
import java.util.List;
import java.util.UUID;
import javax.net.ssl.SSLException;
import org.apache.commons.logging.Log;
import org.apache.xml.security.c14n.CanonicalizationException;
import org.json.JSONObject;
import org.w3c.dom.Node;
import org.wawebrtc.MediaCodecVideoEncoder;

public abstract class BEA {
    public static int A05(int i, int i2, int i3, int i4) {
        int i5 = (i - i2) - 1;
        return (((i3 >> i5) & 1) << 1) + ((i4 >> i5) & 1);
    }

    public static int A07(Resources.Theme theme, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
        int color = obtainStyledAttributes.getColor(0, i2);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static long A0F(int i, long j) {
        return (j ^ (((long) i) << 56)) ^ 71499008037633920L;
    }

    public static long A0G(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C16870tM A0S(C17130tn r2, Alignment alignment) {
        r2.COB(733328855);
        C16870tM A00 = C04870Pg.A00(r2, alignment, false);
        r2.COB(-1323940314);
        return A00;
    }

    public static Object A0d(Class cls) {
        return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public static Object A0e(ClassLoader classLoader, String str, InvocationHandler invocationHandler, Class[] clsArr) {
        Class<?> loadClass = classLoader.loadClass(str);
        C18070vi.A0X(loadClass);
        clsArr[0] = loadClass;
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, clsArr, invocationHandler);
        C18070vi.A0X(newProxyInstance);
        return newProxyInstance;
    }

    public static Object A0f(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        Object obj = jSONObject.get("variable");
        C18070vi.A0X(obj);
        return obj;
    }

    public static String A0k(String str) {
        return String.valueOf(str.substring(0, 1).toLowerCase());
    }

    public static String A0o(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        String string = jSONObject.getString("variable");
        C18070vi.A0X(string);
        return string;
    }

    public static CanonicalizationException A0x(Node node, Object[] objArr) {
        objArr[2] = node.getNodeValue();
        return new CanonicalizationException("c14n.Canonicalizer.RelativeNamespace", objArr);
    }

    public static void A12(Paint paint) {
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
    }

    public static void A14(RectF rectF, float f, float f2) {
        rectF.set(f - f2, rectF.top - f2, rectF.right + f2, rectF.bottom + f2);
    }

    public static void A17(TextView textView) {
        textView.setAutoLinkMask(0);
        textView.setLinksClickable(false);
        textView.setFocusable(false);
        textView.setClickable(false);
        textView.setLongClickable(false);
    }

    public static void A18(C17130tn r1, AnonymousClass0VR r2) {
        AnonymousClass0VR.A0R(r2, false);
        r1.BKC();
        AnonymousClass0VR.A0R(r2, false);
        AnonymousClass0VR.A0R(r2, false);
    }

    public static void A1H(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
    }

    public static void A1R(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(new String(new int[]{i}, 0, 1));
    }

    public static void A1U(Object[] objArr, int i, int i2) {
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
    }

    public static boolean A1a(String str, int[] iArr, String[] strArr) {
        return MediaCodecVideoEncoder.findHwEncoder(str, strArr, iArr, -1, false) != null;
    }

    public static Object[] A1b(int i) {
        return new Object[]{Integer.valueOf(i)};
    }

    public static double A01() {
        return Math.pow(10.0d, 6.0d);
    }

    public static int A06(long j, int i) {
        return i >>> ((int) ((j & 3) << 3));
    }

    public static int A0A(zzhd zzhd) {
        zzhc zzhc = zzhd.zza;
        return zzhc.zzd() + zzhc.zzn();
    }

    public static int A0D(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public static int A0E(AnonymousClass1Bx[] r0, int i, int i2) {
        return i2 + r0[i].CP9().A0F().A0D();
    }

    public static long A0H(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static long A0J(byte[] bArr, int i) {
        return (((long) bArr[i + 2]) << 16) & 16711680;
    }

    public static Uri A0K(DFL dfl) {
        String A0D = dfl.A0D(38);
        Uri uri = C20012A3c.A00;
        if (A0D != null) {
            return Uri.parse(A0D);
        }
        return null;
    }

    public static Looper A0L(String str, int i) {
        HandlerThread handlerThread = new HandlerThread(str, i);
        handlerThread.start();
        return handlerThread.getLooper();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Cyy, X.EBx] */
    public static C28641EBx A0U(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
        if (queryLocalInterface instanceof C28641EBx) {
            return (C28641EBx) queryLocalInterface;
        }
        return new C26398Cyy(iBinder, "com.google.android.gms.nearby.internal.connection.IResultListener");
    }

    public static ALN A0V(String str) {
        ALN aln = new ALN(new JsonReader(new StringReader(str)));
        aln.BkN();
        return aln;
    }

    public static C219718c A0X(String str) {
        return new C219718c(new SSLException(str), (byte) 80);
    }

    public static C219718c A0Y(Throwable th) {
        return new C219718c(new SSLException(th), (byte) 80);
    }

    public static CharSequence A0a(View view, int i) {
        if (i != 0) {
            return view.getResources().getText(i);
        }
        return null;
    }

    public static StringBuilder A0p(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Expected size ");
        sb.append(i);
        return sb;
    }

    public static StringBuilder A0q(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Source subfield ");
        sb.append(i);
        sb.append(" is present but null: ");
        return sb;
    }

    public static StringBuilder A0r(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        return sb;
    }

    public static StringBuilder A0t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        return sb;
    }

    public static AnonymousClass5WK A0w(Object obj) {
        return new AnonymousClass5WK((Throwable) C27178DXn.A05.get(obj));
    }

    public static short A0y(short[] sArr, int i, int i2, int i3, int i4) {
        return (short) (((sArr[i] * (i2 - i3)) + (sArr[i4] * i3)) / i2);
    }

    public static void A13(Paint paint, C26049CrJ crJ) {
        if (crJ != null) {
            paint.setColorFilter((ColorFilter) crJ.A05());
        }
    }

    public static void A15(MediaCodec.BufferInfo bufferInfo, Buffer buffer) {
        buffer.position(bufferInfo.offset);
        buffer.limit(bufferInfo.offset + bufferInfo.size);
    }

    public static void A1A(zzin zzin) {
        if (!zzin.zza.zzG()) {
            zzin.zzn();
        }
    }

    public static void A1B(ConversationRowAudioPreview conversationRowAudioPreview) {
        conversationRowAudioPreview.A01.setVisibility(0);
        conversationRowAudioPreview.A00.setVisibility(8);
    }

    public static void A1D(Object obj, int i, int i2) {
        if (i2 < i - 1) {
            System.arraycopy(obj, i2 + 1, obj, i2, (i - i2) - 1);
        }
    }

    public static void A1E(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[14] = obj;
        objArr[15] = obj2;
        objArr[16] = obj3;
    }

    public static void A1F(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[49] = obj;
        objArr[50] = obj2;
        objArr[51] = obj3;
    }

    public static void A1G(Object obj, Object obj2, Object obj3, Object[] objArr) {
        objArr[21] = obj;
        objArr[22] = obj2;
        objArr[23] = obj3;
    }

    public static void A1I(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        String obj2 = sb.toString();
        EAY eay = C26265CwA.A00;
        if (eay.BfN(6)) {
            eay.BJn("KFrescoController", obj2);
        }
    }

    public static void A1L(Object obj, StringBuilder sb, StringBuilder sb2) {
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append(10);
    }

    public static void A1M(Object obj, AbstractCollection abstractCollection, byte[] bArr, int i) {
        abstractCollection.add(Byte.valueOf((byte) (bArr[i] ^ ((Number) obj).byteValue())));
    }

    public static void A1S(StringBuilder sb, String str) {
        sb.append("Field ");
        sb.append(str);
        sb.append(" for ");
    }

    public static boolean A1Z(Appendable appendable, boolean z) {
        if (!z) {
            return true;
        }
        appendable.append(',');
        return z;
    }

    public static char A00(String str, StringBuilder sb, int i) {
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            sb.append("_");
        }
        return charAt;
    }

    public static float A02(DFL dfl, int i) {
        String A0D = dfl.A0D(i);
        if (A0D == null) {
            return 0.0f;
        }
        return A90.A01(A0D);
    }

    public static int A03() {
        return (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
    }

    public static int A04(int i, int i2) {
        return AnonymousClass1Z2.A06(i, (Color.alpha(i) * i2) / 255);
    }

    public static int A08(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        return childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin;
    }

    public static int A09(CKJ ckj, C25971Cpe cpe) {
        Object A04 = cpe.A04(ckj);
        C28111Yx.A02(A04);
        return ((Number) A04).intValue();
    }

    public static int A0B(List list) {
        int size = list.size();
        int i = size + size;
        if (size == 0) {
            return 10;
        }
        return i;
    }

    public static int A0C(List list) {
        int size = list.size();
        int i = size << 1;
        if (size == 0) {
            return 10;
        }
        return i;
    }

    public static long A0I(List list, int i) {
        return Double.doubleToRawLongBits(((Number) list.get(i)).doubleValue());
    }

    public static Parcelable A0M(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static RemoteException A0N(Object obj) {
        return new RemoteException(String.valueOf(obj).concat(" : Binder has died."));
    }

    public static AccessibilityManager A0O(View view) {
        return (AccessibilityManager) view.getContext().getSystemService("accessibility");
    }

    public static CaptioningManager A0P(View view) {
        return (CaptioningManager) view.getContext().getSystemService("captioning");
    }

    public static C16870tM A0Q(C17130tn r2) {
        r2.COB(-483455358);
        return C03910Lc.A00(AnonymousClass0OB.A05, r2, AnonymousClass0MX.A02);
    }

    public static C16870tM A0R(C17130tn r2, C16330s5 r3) {
        r2.COB(-483455358);
        C16870tM A00 = C03910Lc.A00(AnonymousClass0OB.A05, r2, r3);
        r2.COB(-1323940314);
        return A00;
    }

    public static C20269AEc A0T(Location location) {
        return new C20269AEc(location.getLatitude(), location.getLongitude());
    }

    public static UserJid A0W(DRB drb, String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        sb.append(" for ");
        return drb.A0D;
    }

    public static ArrayIndexOutOfBoundsException A0Z(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public static CharSequence A0b(Object obj) {
        obj.getClass();
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static IllegalStateException A0c(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj);
        return new IllegalStateException(sb.toString());
    }

    public static RuntimeException A0g(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return new RuntimeException(sb.toString());
    }

    public static RuntimeException A0h(String str, StringBuilder sb, int i) {
        sb.append(str);
        sb.append(i);
        return new RuntimeException(sb.toString());
    }

    public static String A0i(Object obj) {
        return new AnonymousClass20F(obj.getClass()).BZJ();
    }

    public static String A0j(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(obj.toString());
        return sb.toString();
    }

    public static String A0l(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public static String A0m(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public static String A0n(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public static StringBuilder A0s(Object obj, int i) {
        return new StringBuilder(i + String.valueOf(obj).length());
    }

    public static ByteBuffer A0u(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
    }

    public static UUID A0v(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public static void A0z() {
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
    }

    public static void A10(ColorStateList colorStateList, Paint paint, View view) {
        paint.setColor(colorStateList.getColorForState(view.getDrawableState(), colorStateList.getDefaultColor()));
    }

    public static void A11(Matrix matrix, Path path, List list, int i) {
        path.addPath(((C28645ECd) list.get(i)).BWP(), matrix);
    }

    public static void A16(Parcel parcel, BHN bhn, ClassLoader classLoader) {
        bhn.A01 = parcel.readInt();
        bhn.A00 = parcel.readInt();
        bhn.A02 = parcel.readParcelable(classLoader);
    }

    public static void A19(C17130tn r1, AnonymousClass0VR r2, C18090vk r3) {
        r1.COE();
        if (r2.A0K) {
            r1.BHe(r3);
        } else {
            r1.CRc();
        }
    }

    public static void A1C(Class cls) {
        Class.forName(cls.getName(), true, cls.getClassLoader());
    }

    public static void A1J(Object obj, String str, StringBuffer stringBuffer, Log log) {
        stringBuffer.append(str);
        stringBuffer.append(obj);
        log.debug(stringBuffer.toString());
    }

    public static void A1K(Object obj, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static void A1N(String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        android.util.Log.w(str3, sb.toString());
    }

    public static void A1O(String str, String str2, StringBuffer stringBuffer, Log log) {
        stringBuffer.append(str);
        stringBuffer.append(str2);
        log.debug(stringBuffer.toString());
    }

    public static void A1P(String str, String str2, StringBuilder sb, int i, int i2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }

    public static void A1Q(String str, StringBuilder sb, double d) {
        sb.append(str);
        sb.append(d);
        com.whatsapp.util.Log.i(sb.toString());
    }

    public static void A1T(ByteBuffer byteBuffer, UUID uuid) {
        byteBuffer.putLong(uuid.getMostSignificantBits());
        byteBuffer.putLong(uuid.getLeastSignificantBits());
    }

    public static void A1V(Object[] objArr, int i, int i2, int i3, int i4) {
        objArr[i2] = Integer.valueOf(i);
        objArr[i4] = Integer.valueOf(i3);
    }

    public static boolean A1W(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.A0H(view, (int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public static boolean A1X(CKJ ckj, C25971Cpe cpe) {
        Object A04 = cpe.A04(ckj);
        C28111Yx.A02(A04);
        return ((Boolean) A04).booleanValue();
    }

    public static boolean A1Y(CKM ckm, C25729Ckz ckz) {
        Object A00 = ckz.A00(ckm);
        C28111Yx.A02(A00);
        return ((Boolean) A00).booleanValue();
    }
}
