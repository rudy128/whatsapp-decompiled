package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8yP  reason: invalid class name and case insensitive filesystem */
public class C175258yP extends AnonymousClass10T {
    public long A00;
    public Handler A01;
    public C86534Sa A02;
    public A99 A03;
    public AnonymousClass7PS A04;
    public boolean A05;
    public long A06 = 0;
    public String A07;
    public boolean A08 = false;
    public final AnonymousClass11S A09;
    public final C18030ve A0A;
    public final C200710s A0B;
    public final AnonymousClass1DC A0C;
    public final VoipCameraManager A0D;
    public final Set A0E = C17880vN.A12();
    public final AnonymousClass1HQ A0F;
    public final AnonymousClass11P A0G;
    public final B63 A0H = new C21137Af8(this);
    public final B64 A0I = new C21138Af9(this);
    public final B65 A0J = new C21139AfA(this);

    public static int[] A05(byte[] bArr, int i, int i2, boolean z) {
        byte b;
        byte b2;
        int i3 = i2 * i;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            byte b3 = bArr[i4] & 255;
            byte b4 = bArr[i4 + 1] & 255;
            int i6 = i + i4;
            byte b5 = bArr[i6] & 255;
            byte b6 = bArr[i6 + 1] & 255;
            int i7 = i3 + i5;
            byte b7 = bArr[i7];
            if (z) {
                b2 = b7 & 255;
                b = bArr[i7 + (i3 / 4)] & 255;
            } else {
                b = b7 & 255;
                b2 = bArr[i7 + (i3 / 4)] & 255;
            }
            int i8 = b2 - 128;
            int i9 = b - 128;
            iArr[i4] = A00(b3, i8, i9);
            iArr[i4 + 1] = A00(b4, i8, i9);
            int i10 = i + i4;
            iArr[i10] = A00(b5, i8, i9);
            iArr[i10 + 1] = A00(b6, i8, i9);
            if (i4 != 0 && (i4 + 2) % i == 0) {
                i4 = i10;
            }
            i4 += 2;
            i5++;
        }
        return iArr;
    }

    public C86534Sa A07() {
        CallInfo A032 = A03(this, (CallInfo) null);
        if (A032 != null) {
            return A02(A032);
        }
        Map emptyMap = Collections.emptyMap();
        C86534Sa r2 = new C86534Sa(C201110w.copyOf(emptyMap), (C134216qE) null, (AnonymousClass1EC) null, (UserJid) null, (UserJid) null, CallState.NONE, "", (String) null, (String) null, 0, 0, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false, false);
        this.A02 = r2;
        return r2;
    }

    /* renamed from: A09 */
    public synchronized void registerObserver(BDF bdf) {
        boolean z = !AnonymousClass000.A1R(size());
        super.registerObserver(bdf);
        if (z) {
            VoipCameraManager voipCameraManager = this.A0D;
            voipCameraManager.onCameraClosedListener = this.A0H;
            voipCameraManager.onCameraOpenedListener = this.A0J;
            voipCameraManager.onCameraCreatedListener = this.A0I;
        }
    }

    /* renamed from: A0A */
    public synchronized void unregisterObserver(BDF bdf) {
        super.unregisterObserver(bdf);
        if (size() <= 0) {
            this.A01.removeCallbacksAndMessages((Object) null);
            this.A0B.A03();
            VoipCameraManager voipCameraManager = this.A0D;
            voipCameraManager.onCameraClosedListener = null;
            voipCameraManager.onCameraOpenedListener = null;
            voipCameraManager.onCameraCreatedListener = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x01dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A01(X.C187819gQ r19) {
        /*
            r4 = r19
            X.C4c r8 = r4.A03
            byte[] r11 = r4.A05
            int r6 = r4.A02
            int r5 = r4.A00
            r3 = 0
            X.BwI r0 = X.C24152BwI.A00     // Catch:{ OutOfMemoryError -> 0x012e }
            if (r8 != r0) goto L_0x004e
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r11)     // Catch:{ OutOfMemoryError -> 0x012e }
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ OutOfMemoryError -> 0x012e }
            java.nio.ByteBuffer r0 = r1.order(r0)     // Catch:{ OutOfMemoryError -> 0x012e }
            java.nio.IntBuffer r7 = r0.asIntBuffer()     // Catch:{ OutOfMemoryError -> 0x012e }
            int r2 = r6 * r5
            int r0 = r7.remaining()     // Catch:{ OutOfMemoryError -> 0x012e }
            if (r0 == r2) goto L_0x0042
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ OutOfMemoryError -> 0x012e }
            java.lang.String r0 = "convertARGBByteArrayToIntArray ARGB int array expected length "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x012e }
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x012e }
            java.lang.String r0 = " got "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x012e }
            int r0 = r7.remaining()     // Catch:{ OutOfMemoryError -> 0x012e }
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x012e }
            X.C17890vO.A0w(r1)     // Catch:{ OutOfMemoryError -> 0x012e }
            goto L_0x014e
        L_0x0042:
            int r0 = r7.remaining()     // Catch:{ OutOfMemoryError -> 0x012e }
            int[] r0 = new int[r0]     // Catch:{ OutOfMemoryError -> 0x012e }
            r7.get(r0)     // Catch:{ OutOfMemoryError -> 0x012e }
            r3 = r0
            goto L_0x014e
        L_0x004e:
            X.BwJ r0 = X.C24153BwJ.A00     // Catch:{ OutOfMemoryError -> 0x012e }
            java.lang.String r9 = " got "
            if (r8 != r0) goto L_0x0097
            int r7 = r5 * r6
            int r10 = r7 * 4
            int r2 = r11.length     // Catch:{ OutOfMemoryError -> 0x012e }
            if (r2 == r10) goto L_0x006c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ OutOfMemoryError -> 0x012e }
            java.lang.String r0 = "convertFrameDataToARGB8888 RGBA expected length "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x012e }
            r1.append(r10)     // Catch:{ OutOfMemoryError -> 0x012e }
            X.C17900vP.A0i(r9, r1, r2)     // Catch:{ OutOfMemoryError -> 0x012e }
            goto L_0x014e
        L_0x006c:
            int[] r10 = new int[r7]     // Catch:{ OutOfMemoryError -> 0x012e }
            r9 = 0
        L_0x006f:
            if (r9 >= r7) goto L_0x014d
            int r1 = r9 * 4
            byte r0 = r11[r1]     // Catch:{ OutOfMemoryError -> 0x012e }
            r13 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 + 1
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x012e }
            r12 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 + 2
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x012e }
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 + 3
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x012e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 24
            int r0 = r13 << 16
            r1 = r1 | r0
            int r0 = r12 << 8
            r1 = r1 | r0
            r1 = r1 | r2
            r10[r9] = r1     // Catch:{ OutOfMemoryError -> 0x012e }
            int r9 = r9 + 1
            goto L_0x006f
        L_0x0097:
            r0 = r8
            X.BwH r0 = (X.C24151BwH) r0     // Catch:{ OutOfMemoryError -> 0x012e }
            int r1 = r0.A00     // Catch:{ OutOfMemoryError -> 0x012e }
            r0 = 17
            if (r1 == r0) goto L_0x00d9
            r0 = 35
            if (r1 == r0) goto L_0x00bb
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r1 == r0) goto L_0x00b4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ OutOfMemoryError -> 0x012e }
            java.lang.String r0 = "convertFrameDataToARGB8888 unsupported format "
            X.C17900vP.A0Y(r8, r0, r1)     // Catch:{ OutOfMemoryError -> 0x012e }
            goto L_0x014e
        L_0x00b4:
            r0 = 0
            int[] r3 = A05(r11, r6, r5, r0)     // Catch:{ OutOfMemoryError -> 0x012e }
            goto L_0x014e
        L_0x00bb:
            int r0 = r6 * 3
            int r0 = r0 * r5
            int r7 = r0 / 2
            int r2 = r11.length     // Catch:{ OutOfMemoryError -> 0x012e }
            if (r2 == r7) goto L_0x00d3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ OutOfMemoryError -> 0x012e }
            java.lang.String r0 = "convertFrameDataToARGB8888 YUV_420_888 expected length "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x012e }
            r1.append(r7)     // Catch:{ OutOfMemoryError -> 0x012e }
            X.C17900vP.A0i(r9, r1, r2)     // Catch:{ OutOfMemoryError -> 0x012e }
            goto L_0x014e
        L_0x00d3:
            r0 = 1
            int[] r3 = A05(r11, r6, r5, r0)     // Catch:{ OutOfMemoryError -> 0x012e }
            goto L_0x014e
        L_0x00d9:
            int r9 = r5 * r6
            int[] r10 = new int[r9]     // Catch:{ OutOfMemoryError -> 0x012e }
            r7 = 0
            r19 = 0
        L_0x00e0:
            if (r7 >= r9) goto L_0x014d
            byte r0 = r11[r7]     // Catch:{ OutOfMemoryError -> 0x012e }
            r15 = r0 & 255(0xff, float:3.57E-43)
            int r18 = r7 + 1
            byte r0 = r11[r18]     // Catch:{ OutOfMemoryError -> 0x012e }
            r14 = r0 & 255(0xff, float:3.57E-43)
            int r17 = r6 + r7
            byte r0 = r11[r17]     // Catch:{ OutOfMemoryError -> 0x012e }
            r13 = r0 & 255(0xff, float:3.57E-43)
            int r16 = r17 + 1
            byte r0 = r11[r16]     // Catch:{ OutOfMemoryError -> 0x012e }
            r12 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r9 + r19
            byte r0 = r11[r2]     // Catch:{ OutOfMemoryError -> 0x012e }
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r2 + 1
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x012e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r0 + -128
            int r1 = r1 + -128
            int r0 = A00(r15, r2, r1)     // Catch:{ OutOfMemoryError -> 0x012e }
            r10[r7] = r0     // Catch:{ OutOfMemoryError -> 0x012e }
            int r0 = A00(r14, r2, r1)     // Catch:{ OutOfMemoryError -> 0x012e }
            r10[r18] = r0     // Catch:{ OutOfMemoryError -> 0x012e }
            int r0 = A00(r13, r2, r1)     // Catch:{ OutOfMemoryError -> 0x012e }
            r10[r17] = r0     // Catch:{ OutOfMemoryError -> 0x012e }
            int r0 = A00(r12, r2, r1)     // Catch:{ OutOfMemoryError -> 0x012e }
            r10[r16] = r0     // Catch:{ OutOfMemoryError -> 0x012e }
            if (r7 == 0) goto L_0x0129
            int r0 = r7 + 2
            int r0 = r0 % r6
            if (r0 != 0) goto L_0x0129
            r7 = r17
        L_0x0129:
            int r7 = r7 + 2
            int r19 = r19 + 2
            goto L_0x00e0
        L_0x012e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "convertFrameDataToARGB8888 OOM when convert data with format = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " width = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "height = "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r5)
            com.whatsapp.util.Log.i(r0, r2)
            goto L_0x014e
        L_0x014d:
            r3 = r10
        L_0x014e:
            r8 = 0
            if (r3 != 0) goto L_0x0152
            return r8
        L_0x0152:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x01e1 }
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r3, r6, r5, r0)     // Catch:{ OutOfMemoryError -> 0x01e1 }
            boolean r0 = X.C50602Vb.A00
            r1 = 320(0x140, float:4.48E-43)
            if (r0 == 0) goto L_0x0160
            r1 = 240(0xf0, float:3.36E-43)
        L_0x0160:
            int r0 = r9.getWidth()
            int r0 = r0 / 4
            int r7 = java.lang.Math.max(r1, r0)
            int r0 = r9.getWidth()
            if (r0 <= r7) goto L_0x018a
            int r0 = r9.getWidth()
            double r5 = (double) r0
            double r0 = (double) r7
            double r5 = r5 / r0
            int r0 = r9.getHeight()
            double r2 = (double) r0
            double r2 = r2 / r5
            int r1 = (int) r2
            r0 = 1
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createScaledBitmap(r9, r7, r1, r0)     // Catch:{ OutOfMemoryError -> 0x0184 }
            goto L_0x018a
        L_0x0184:
            r1 = move-exception
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap OOM when scaling down bitmap"
            com.whatsapp.util.Log.i(r0, r1)
        L_0x018a:
            android.graphics.Matrix r14 = new android.graphics.Matrix
            r14.<init>()
            boolean r2 = r4.A04
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0199
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0199:
            r14.preScale(r1, r0)
            int r0 = r4.A01
            float r0 = (float) r0
            r14.postRotate(r0)
            int r12 = r9.getWidth()     // Catch:{ OutOfMemoryError -> 0x01d4 }
            int r13 = r9.getHeight()     // Catch:{ OutOfMemoryError -> 0x01d4 }
            r15 = 1
            r10 = 0
            r11 = r10
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ OutOfMemoryError -> 0x01d4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ OutOfMemoryError -> 0x01d2 }
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap screenshot done. size: "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x01d2 }
            int r0 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x01d2 }
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x01d2 }
            java.lang.String r0 = "x"
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x01d2 }
            int r0 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x01d2 }
            X.C17900vP.A0o(r1, r0)     // Catch:{ OutOfMemoryError -> 0x01d2 }
            if (r2 == r9) goto L_0x01d0
            r8 = r9
        L_0x01d0:
            r9 = r8
            goto L_0x01db
        L_0x01d2:
            r1 = move-exception
            goto L_0x01d6
        L_0x01d4:
            r1 = move-exception
            r2 = r8
        L_0x01d6:
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap OOM when creating result bitmap"
            com.whatsapp.util.Log.i(r0, r1)
        L_0x01db:
            if (r9 == 0) goto L_0x01e0
            r9.recycle()
        L_0x01e0:
            return r2
        L_0x01e1:
            r1 = move-exception
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap OOM when creating raw bitmap"
            com.whatsapp.util.Log.i(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175258yP.A01(X.9gQ):android.graphics.Bitmap");
    }

    private C86534Sa A02(CallInfo callInfo) {
        int i;
        int i2;
        C86534Sa r15;
        CallInfo callInfo2 = callInfo;
        if (this.A02 == null) {
            C201110w copyOf = C201110w.copyOf(callInfo2.participants);
            boolean isCallFull = callInfo2.isCallFull();
            boolean z = callInfo2.isGroupCall;
            CallState callState = callInfo2.callState;
            boolean z2 = callInfo2.videoEnabled;
            boolean isInLonelyState = callInfo2.isInLonelyState();
            C134216qE r13 = callInfo2.self;
            AnonymousClass1EC A0i = AnonymousClass3MW.A0i(callInfo2.groupJid);
            UserJid peerJid = callInfo2.getPeerJid();
            String str = callInfo2.callId;
            boolean isSelfRequestingUpgrade = callInfo2.isSelfRequestingUpgrade();
            boolean isEitherSideRequestingUpgrade = callInfo2.isEitherSideRequestingUpgrade();
            UserJid userJid = callInfo2.callLinkCreatorJid;
            int i3 = callInfo2.callLinkState;
            boolean z3 = callInfo2.callEnding;
            String str2 = callInfo2.callLinkToken;
            String str3 = callInfo2.scheduledId;
            boolean isAudioChat = callInfo2.isAudioChat();
            int A002 = AnonymousClass8BU.A00(isAudioChat ? 1 : 0);
            boolean z4 = callInfo2.canRingAll;
            boolean isPhashBasedCall = callInfo2.isPhashBasedCall();
            int i4 = callInfo2.connectedLimit;
            boolean isCallOnHold = callInfo2.isCallOnHold();
            long j = callInfo2.callDuration;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i5 = i3;
            int i6 = i4;
            int i7 = callInfo2.callResult;
            C134216qE r17 = r13;
            UserJid userJid2 = userJid;
            CallState callState2 = callState;
            r15 = new C86534Sa(copyOf, r17, A0i, peerJid, userJid2, callState2, str4, str5, str6, i5, A002, 0, i6, i7, j, isCallFull, z, z2, isInLonelyState, isSelfRequestingUpgrade, isEitherSideRequestingUpgrade, z3, isAudioChat, z4, isPhashBasedCall, isCallOnHold, callInfo2.isLidCall());
        } else {
            AnonymousClass7PS r4 = this.A04;
            if (r4 == null || !callInfo2.callId.equals(r4.first)) {
                i = 0;
                i2 = 0;
            } else {
                i = AnonymousClass000.A0M(r4.second);
                i2 = AnonymousClass000.A0M(r4.third);
            }
            Map map = callInfo2.participants;
            boolean isCallFull2 = callInfo2.isCallFull();
            boolean z5 = callInfo2.isGroupCall;
            CallState callState3 = callInfo2.callState;
            boolean z6 = callInfo2.videoEnabled;
            boolean isInLonelyState2 = callInfo2.isInLonelyState();
            C134216qE r14 = callInfo2.self;
            AnonymousClass1EC A0i2 = AnonymousClass3MW.A0i(callInfo2.groupJid);
            UserJid peerJid2 = callInfo2.getPeerJid();
            String str7 = callInfo2.callId;
            boolean isSelfRequestingUpgrade2 = callInfo2.isSelfRequestingUpgrade();
            boolean isEitherSideRequestingUpgrade2 = callInfo2.isEitherSideRequestingUpgrade();
            UserJid userJid3 = callInfo2.callLinkCreatorJid;
            int i8 = callInfo2.callLinkState;
            boolean z7 = callInfo2.callEnding;
            String str8 = callInfo2.callLinkToken;
            String str9 = callInfo2.scheduledId;
            boolean isAudioChat2 = callInfo2.isAudioChat();
            boolean z8 = callInfo2.canRingAll;
            boolean isPhashBasedCall2 = callInfo2.isPhashBasedCall();
            int i9 = callInfo2.connectedLimit;
            boolean isCallOnHold2 = callInfo2.isCallOnHold();
            long j2 = callInfo2.callDuration;
            int i10 = callInfo2.callResult;
            String str10 = str7;
            String str11 = str8;
            String str12 = str9;
            int i11 = i8;
            int i12 = i9;
            int i13 = i10;
            C134216qE r172 = r14;
            UserJid userJid4 = userJid3;
            r15 = new C86534Sa(C201110w.copyOf(map), r172, A0i2, peerJid2, userJid4, callState3, str10, str11, str12, i11, i, i2, i12, i13, j2, isCallFull2, z5, z6, isInLonelyState2, isSelfRequestingUpgrade2, isEitherSideRequestingUpgrade2, z7, isAudioChat2, z8, isPhashBasedCall2, isCallOnHold2, callInfo2.isLidCall());
        }
        this.A02 = r15;
        return r15;
    }

    public static CallInfo A03(C175258yP r4, CallInfo callInfo) {
        String str;
        if (callInfo == null) {
            AnonymousClass1HQ r1 = r4.A0F;
            if (r1.BeE()) {
                CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
                C17960vV.A07(callLinkInfo);
                return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
            }
            callInfo = r1.BO3();
            if (callInfo == null) {
                return null;
            }
        }
        if (callInfo.isCallLinkLobbyOrJoiningState() || (str = r4.A07) == null) {
            return callInfo;
        }
        if (AnonymousClass8BU.A1U(callInfo, str)) {
            return CallInfo.convertCallWaitingInfoToCallInfo(callInfo);
        }
        String str2 = callInfo.callId;
        if (str.equals(str2) || r4.A08) {
            return callInfo;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallDatasource/getCallInfoForDisplay CallId ");
        A10.append(str);
        C17900vP.A0e(" does not match current call's id ", str2, A10);
        r4.A08 = true;
        return callInfo;
    }

    public Bitmap A06(C134216qE r12) {
        String str;
        int i;
        if (r12.A0M) {
            C187819gQ lastCachedFrame = this.A0D.getLastCachedFrame();
            if (lastCachedFrame == null) {
                str = "voip/CallDatasource/getSelfLastFrameBitmap no cached frame";
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("voip/CallDatasource/getSelfLastFrameBitmap start. size: ");
                A10.append(lastCachedFrame.A02);
                A10.append("x");
                A10.append(lastCachedFrame.A00);
                A10.append(" format = ");
                C17900vP.A0b(lastCachedFrame.A03, A10);
                return A01(lastCachedFrame);
            }
        } else {
            int i2 = r12.A09;
            if (i2 == 0 || (i = r12.A06) == 0) {
                str = "voip/CallDatasource/getLastFrameBitmap cancelled due to bad participant info or video size";
            } else {
                Bitmap bitmap = null;
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                    if (createBitmap == null || !Voip.dumpLastVideoFrame(r12.A0A, createBitmap)) {
                        Log.i("voip/CallDatasource/getPeerLastFrameBitmap dumpLastVideoFrame failed");
                    } else {
                        Matrix matrix = new Matrix();
                        matrix.preRotate((float) (-(r12.A07 * 90)));
                        try {
                            Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
                            if (createBitmap2 != createBitmap) {
                                bitmap = createBitmap;
                            }
                            createBitmap = bitmap;
                            bitmap = createBitmap2;
                        } catch (OutOfMemoryError e) {
                            Log.i("voip/CallDatasource/getPeerLastFrameBitmap OOM when creating result bitmap", e);
                        }
                    }
                    if (createBitmap == null) {
                        return bitmap;
                    }
                    createBitmap.recycle();
                    return bitmap;
                } catch (OutOfMemoryError e2) {
                    Log.i("voip/CallDatasource/getPeerLastFrameBitmap OOM when creating raw bitmap", e2);
                    return null;
                }
            }
        }
        Log.i(str);
        return null;
    }

    public void A08() {
        String str;
        A99 a99 = this.A03;
        if (a99 != null) {
            CallInfo A0r = AnonymousClass8BR.A0r(a99);
            if (A0r == null) {
                str = "voip/ringAll: voipNative.getCallInfo failed";
            } else {
                ArrayList A13 = AnonymousClass000.A13();
                Iterator A0l = C17890vO.A0l(A0r.participants);
                while (A0l.hasNext()) {
                    C134216qE r2 = (C134216qE) A0l.next();
                    if (r2.A04 == 11) {
                        A13.add(r2.A0A);
                    }
                }
                if (A13.size() == 0) {
                    str = "voip/ringAll: Cannot ring any participant";
                } else {
                    C17960vV.A0F(AnonymousClass000.A1a(A13), "voip/invite: Empty list of peers to invite");
                    a99.A1E.execute(new AnonymousClass7RT(a99, A13, A0r, 10, true));
                    return;
                }
            }
            Log.e(str);
        }
    }

    public void A0B(UserJid userJid) {
        CallInfo A032;
        if ((userJid != null || this.A02.A04 == 2) && (A032 = A03(this, (CallInfo) null)) != null) {
            A99 a99 = this.A03;
            if (a99 != null) {
                a99.A1E.execute(new C21431Ajy(a99, userJid, 47));
            }
            if (userJid == null) {
                AnonymousClass7PS r0 = this.A04;
                this.A04 = new AnonymousClass7PS(r0.first, r0.second, C17880vN.A0h());
                A04(this, A032, false);
            }
        }
    }

    public void A0D(String str) {
        String str2 = this.A07;
        if (!str.equals(str2)) {
            this.A00 = 0;
            if (str2 != null) {
                C20735AWq.A00(this, 19);
            }
            this.A07 = str;
            this.A08 = false;
            this.A05 = false;
            CallInfo A032 = A03(this, (CallInfo) null);
            if (A032 != null) {
                A0C(A032);
            }
        }
    }

    public C175258yP(AnonymousClass11S r4, AnonymousClass1HQ r5, AnonymousClass11P r6, C18030ve r7, AnonymousClass1DC r8, AnonymousClass10I r9, VoipCameraManager voipCameraManager, AnonymousClass00H r11) {
        super(r11);
        this.A0G = r6;
        this.A0A = r7;
        this.A09 = r4;
        this.A0F = r5;
        this.A0C = r8;
        this.A0D = voipCameraManager;
        this.A01 = new Handler(Looper.getMainLooper(), new AAL(this, 0));
        this.A0B = new C200710s(r9, true);
        r5.getClass();
        voipCameraManager.setCaptureDeviceRefreshListener(new C21136Af7(r5));
    }

    public static int A00(int i, int i2, int i3) {
        float f = (float) i3;
        int i4 = ((int) (1.402f * f)) + i;
        float f2 = (float) i2;
        int i5 = i - ((int) ((f2 * 0.344f) + (f * 0.714f)));
        return Math.min(255, Math.max(0, i + ((int) (f2 * 1.772f)))) | (Math.min(255, Math.max(0, i4)) << 16) | -16777216 | (Math.min(255, Math.max(0, i5)) << 8);
    }

    public static void A04(C175258yP r7, CallInfo callInfo, boolean z) {
        if (r7.size() > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            CallInfo A032 = A03(r7, callInfo);
            if (A032 != null) {
                C86534Sa A022 = r7.A02(A032);
                if (z) {
                    C17890vO.A0s(r7, A022, 7);
                } else {
                    C17890vO.A0s(r7, A022, 9);
                    long j = A032.callDuration;
                    if (r7.size() > 0 && uptimeMillis > r7.A00) {
                        r7.notifyAllObservers(new C20722AWc(j));
                        r7.A00 = uptimeMillis;
                    }
                }
                r7.A06 = System.currentTimeMillis();
            }
        }
    }

    public void A0C(CallInfo callInfo) {
        CallState callState;
        if (size() > 0) {
            Handler handler = this.A01;
            handler.removeMessages(2);
            long currentTimeMillis = System.currentTimeMillis();
            if (callInfo == null || !((callState = callInfo.callState) == CallState.NONE || callState == CallState.ACTIVE_ELSEWHERE)) {
                long j = this.A06;
                if (j != 0) {
                    long j2 = j + 250;
                    if (currentTimeMillis < j2) {
                        handler.sendEmptyMessageDelayed(2, j2 - currentTimeMillis);
                        return;
                    }
                }
            }
            A04(this, callInfo, false);
        }
    }
}
