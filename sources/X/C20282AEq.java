package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.AEq  reason: case insensitive filesystem */
public class C20282AEq implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AD6(11);
    public final long A00;
    public final A6K A01;
    public final C64622v4 A02;
    public final AnonymousClass1IX A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final long A0C;
    public final String A0D;

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != null) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r6 = 1
            if (r7 == r8) goto L_0x00b2
            boolean r1 = r8 instanceof X.C20282AEq
            r0 = 0
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            X.AEq r8 = (X.C20282AEq) r8
            X.2v4 r1 = r7.A02
            X.2v4 r0 = r8.A02
            if (r1 != 0) goto L_0x00a9
            r5 = 1
            if (r0 == 0) goto L_0x0015
        L_0x0014:
            r5 = 0
        L_0x0015:
            X.A6K r0 = r7.A01
            java.lang.String r1 = r0.A0A
            X.A6K r0 = r8.A01
            java.lang.String r0 = r0.A0A
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r1 = r7.A06
            java.lang.String r0 = r8.A06
            if (r1 != 0) goto L_0x00a2
            if (r0 != 0) goto L_0x00b1
        L_0x002b:
            java.lang.String r1 = r7.A08
            java.lang.String r0 = r8.A08
            if (r1 != 0) goto L_0x009b
            if (r0 != 0) goto L_0x00b1
        L_0x0033:
            java.lang.String r1 = r7.A0D
            java.lang.String r0 = r8.A0D
            if (r1 != 0) goto L_0x0094
            if (r0 != 0) goto L_0x00b1
        L_0x003b:
            boolean r1 = r7.A0A
            boolean r0 = r8.A0A
            if (r1 != r0) goto L_0x00b1
            java.lang.String r1 = r7.A05
            java.lang.String r0 = r8.A05
            if (r1 != 0) goto L_0x008d
            if (r0 != 0) goto L_0x00b1
        L_0x0049:
            java.lang.Integer r1 = r7.A04
            java.lang.Integer r0 = r8.A04
            if (r1 != r0) goto L_0x00b1
            long r3 = r7.A00
            long r1 = r8.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00b1
            java.util.List r1 = r7.A09
            java.util.List r0 = r8.A09
            if (r1 != 0) goto L_0x0086
            if (r0 != 0) goto L_0x00b1
        L_0x005f:
            java.lang.String r1 = r7.A07
            java.lang.String r0 = r8.A07
            if (r1 != 0) goto L_0x007f
            if (r0 != 0) goto L_0x00b1
        L_0x0067:
            X.1IX r1 = r7.A03
            X.1IX r0 = r8.A03
            if (r1 != 0) goto L_0x0078
            if (r0 != 0) goto L_0x00b1
        L_0x006f:
            boolean r1 = r7.A0B
            boolean r0 = r8.A0B
            if (r1 != r0) goto L_0x00b1
            if (r5 == 0) goto L_0x00b1
            return r6
        L_0x0078:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x006f
        L_0x007f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x0067
        L_0x0086:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x005f
        L_0x008d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x0049
        L_0x0094:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x003b
        L_0x009b:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x0033
        L_0x00a2:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            goto L_0x002b
        L_0x00a9:
            if (r0 == 0) goto L_0x0014
            boolean r5 = r1.equals(r0)
            goto L_0x0015
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20282AEq.equals(java.lang.Object):boolean");
    }

    public static C20282AEq A00(String str) {
        return new C20282AEq(ARAssetType.SCRIPTING_PACKAGE, ARRequestAsset$CompressionMethod.ZIP, (EffectAssetType) null, (AnonymousClass9JJ) null, (VersionedCapability) null, (Integer) null, "0061d80511e92ac2cf5a223b747610eb2f8729ee", (String) null, (String) null, (String) null, str, (String) null, (String) null, AnonymousClass001.A1I(":", AnonymousClass000.A11("0061d80511e92ac2cf5a223b747610eb2f8729ee"), 0), (String) null, (List) null, 0, -1, -1, false);
    }

    public int hashCode() {
        return this.A01.A0A.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        A6K a6k = this.A01;
        ByteBuffer allocate = ByteBuffer.allocate(ZipDecompressor.UNZIP_BUFFER_SIZE);
        allocate.putLong(7310021016723351138L);
        A6K.A01(a6k.A0A, allocate);
        A6K.A01(a6k.A0B, allocate);
        A6K.A01(a6k.A0C, allocate);
        A6K.A01(a6k.A02.name(), allocate);
        A6K.A01(a6k.A03(), allocate);
        A6K.A01(a6k.A0D, allocate);
        A6K.A01(a6k.A03.name(), allocate);
        allocate.putInt(a6k.A01);
        A6K.A01(a6k.A09, allocate);
        A6K.A01(a6k.A08.toString(), allocate);
        A6K.A01(C17900vP.A08(a6k.A06), allocate);
        A6K.A01(a6k.A07.toString(), allocate);
        A6K.A01(a6k.A0E, allocate);
        parcel.writeByteArray(Arrays.copyOf(allocate.array(), allocate.position()));
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0D);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A0C);
        parcel.writeTypedList(this.A09);
        parcel.writeString(this.A07);
        parcel.writeTypedList(this.A03);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        int i2 = 0;
        parcel.writeParcelable(this.A02, 0);
        Integer num = this.A04;
        if (num != null) {
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }

    public C20282AEq(Parcel parcel) {
        AnonymousClass1IX copyOf;
        try {
            this.A01 = new A6K(ByteBuffer.wrap(parcel.createByteArray()));
            this.A06 = parcel.readString();
            this.A08 = parcel.readString();
            this.A0D = parcel.readString();
            boolean z = true;
            this.A0A = AnonymousClass000.A1O(parcel.readByte());
            this.A05 = parcel.readString();
            this.A00 = parcel.readLong();
            this.A0C = parcel.readLong();
            this.A09 = parcel.createTypedArrayList(ARCapabilityMinVersionModeling.CREATOR);
            this.A07 = parcel.readString();
            ArrayList createTypedArrayList = parcel.createTypedArrayList(AREffectAsyncAsset.CREATOR);
            if (createTypedArrayList == null) {
                copyOf = null;
            } else {
                copyOf = AnonymousClass1IX.copyOf((Collection) createTypedArrayList);
            }
            this.A03 = copyOf;
            this.A0B = parcel.readByte() == 0 ? false : z;
            this.A02 = (C64622v4) AnonymousClass3Ma.A08(parcel, C64622v4.class);
            this.A04 = AnonymousClass00R.A00(2)[parcel.readInt()];
        } catch (IOException e) {
            throw AnonymousClass8BR.A0x(e);
        }
    }

    public String toString() {
        String A002;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("id: ");
        A6K a6k = this.A01;
        A10.append(a6k.A0A);
        A10.append(", name: ");
        A10.append(a6k.A0C);
        A10.append(", instance id: ");
        A10.append(a6k.A0B);
        A10.append(", cache key: ");
        A10.append(a6k.A09);
        A10.append(", asset type: ");
        ARAssetType aRAssetType = a6k.A02;
        A10.append(aRAssetType);
        A10.append(", sub asset type: ");
        A10.append(a6k.A03());
        A10.append(", compression method: ");
        A10.append(a6k.A03);
        A10.append(", uri: ");
        A10.append(this.A08);
        A10.append(", file size bytes: ");
        A10.append(this.A00);
        A10.append(", hash value: ");
        A10.append(this.A05);
        A10.append(", hash type: ");
        Integer num = this.A04;
        if (num == null) {
            A002 = "null";
        } else {
            A002 = AnonymousClass9OZ.A00(num);
        }
        A10.append(A002);
        A10.append(", is logging disabled: ");
        A10.append(this.A0A);
        A10.append(", is asset encrypted: ");
        A10.append(a6k.A07.booleanValue());
        A10.append(", uses flm capability: ");
        A10.append(this.A0B);
        if (aRAssetType == ARAssetType.EFFECT) {
            A10.append(", model capability minVersion: ");
            A10.append(this.A09);
        }
        return A10.toString();
    }

    public C20282AEq(ARAssetType aRAssetType, ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod, EffectAssetType effectAssetType, AnonymousClass9JJ r22, VersionedCapability versionedCapability, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, long j, long j2, boolean z) {
        String str10 = str2;
        String str11 = str;
        VersionedCapability versionedCapability2 = versionedCapability;
        AnonymousClass9JJ r7 = r22;
        EffectAssetType effectAssetType2 = effectAssetType;
        ARRequestAsset$CompressionMethod aRRequestAsset$CompressionMethod2 = aRRequestAsset$CompressionMethod;
        ARAssetType aRAssetType2 = aRAssetType;
        this.A01 = new A6K(aRAssetType2, aRRequestAsset$CompressionMethod2, effectAssetType2, (AnonymousClass9IY) null, r7, versionedCapability2, false, (Boolean) null, str11, str10, str3, str7, str8, (String) null, i);
        this.A08 = str5;
        this.A06 = str4;
        this.A05 = str6;
        this.A0A = false;
        this.A0D = str11;
        this.A00 = j;
        this.A0C = j2;
        this.A09 = list;
        this.A07 = str9;
        this.A03 = null;
        this.A02 = null;
        this.A0B = z;
        this.A04 = num;
    }
}
