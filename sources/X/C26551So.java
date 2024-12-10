package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: X.1So  reason: invalid class name and case insensitive filesystem */
public final class C26551So implements Parcelable {
    public static final C26551So A04;
    public static final C26551So A05;
    public static final C26551So A06;
    public static final C26551So A07;
    public static final C26551So A08;
    public static final C26551So A09;
    public static final C26551So A0A;
    public static final C26551So A0B;
    public static final C26551So A0C;
    public static final C26551So A0D;
    public static final C26551So A0E;
    public static final C26551So A0F;
    public static final C26551So A0G;
    public static final C26551So A0H;
    public static final C26551So A0I;
    public static final C26551So A0J;
    public static final C26551So A0K;
    public static final C26551So A0L;
    public static final C26551So A0M;
    public static final C26551So A0N;
    public static final C26551So A0O;
    public static final C26551So A0P;
    public static final C26551So A0Q;
    public static final C26551So A0R;
    public static final C26551So A0S;
    public static final C26551So A0T;
    public static final C26551So A0U;
    public static final C26551So A0V;
    public static final C26551So A0W;
    public static final C26551So A0X;
    public static final C26551So A0Y;
    public static final C26551So A0Z;
    public static final C26551So A0a;
    public static final C26551So A0b;
    public static final C26551So A0c;
    public static final C26551So A0d;
    public static final C26551So A0e;
    public static final C26551So A0f;
    public static final C26551So A0g;
    public static final C26551So A0h;
    public static final C26551So A0i;
    public static final C26551So A0j;
    public static final C26551So A0k;
    public static final C26551So A0l;
    public static final C26551So A0m;
    public static final C26551So A0n;
    public static final C26551So A0o;
    public static final C26551So A0p;
    public static final C26551So A0q;
    public static final C26551So A0r;
    public static final C26551So A0s;
    public static final C26551So A0t;
    public static final C26551So A0u;
    public static final C26551So A0v;
    public static final C26551So A0w;
    public static final C26551So A0x;
    public static final C26551So A0y;
    public static final C26551So A0z;
    public static final byte[] A10;
    public static final byte[] A11;
    public static final byte[] A12;
    public static final byte[] A13;
    public static final byte[] A14;
    public static final byte[] A15;
    public static final byte[] A16;
    public static final byte[] A17;
    public static final byte[] A18;
    public static final byte[] A19;
    public static final byte[] A1A;
    public static final byte[] A1B;
    public static final byte[] A1C;
    public static final byte[] A1D;
    public static final byte[] A1E;
    public static final byte[] A1F;
    public static final byte[] A1G;
    public static final byte[] A1H;
    public static final byte[] A1I;
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        C18070vi.A0d(parcel, 0);
        parcel.writeInt(this.A00);
        if (this == A0M || this == A0W) {
            i2 = 1;
        } else {
            i2 = 0;
            if (this == A0K) {
                i2 = 6;
            }
        }
        parcel.writeInt(i2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, android.os.Parcelable$Creator] */
    static {
        Charset charset = C26571Sq.A05;
        byte[] bytes = "WhatsApp Audio Keys".getBytes(charset);
        C18070vi.A0X(bytes);
        A12 = bytes;
        byte[] bytes2 = "WhatsApp Image Keys".getBytes(charset);
        C18070vi.A0X(bytes2);
        A16 = bytes2;
        byte[] bytes3 = "WhatsApp Image Thumbnail Keys".getBytes(charset);
        C18070vi.A0X(bytes3);
        A17 = bytes3;
        byte[] bytes4 = "WhatsApp Video Keys".getBytes(charset);
        C18070vi.A0X(bytes4);
        A1G = bytes4;
        byte[] bytes5 = "WhatsApp Video Thumbnail Keys".getBytes(charset);
        C18070vi.A0X(bytes5);
        A1H = bytes5;
        byte[] bytes6 = "WhatsApp Document Keys".getBytes(charset);
        C18070vi.A0X(bytes6);
        A14 = bytes6;
        byte[] bytes7 = "WhatsApp Document Thumbnail Keys".getBytes(charset);
        C18070vi.A0X(bytes7);
        A15 = bytes7;
        byte[] bytes8 = "WhatsApp App State Keys".getBytes(charset);
        C18070vi.A0X(bytes8);
        A19 = bytes8;
        byte[] bytes9 = "WhatsApp History Keys".getBytes(charset);
        C18070vi.A0X(bytes9);
        A1A = bytes9;
        byte[] bytes10 = "WhatsApp Link Thumbnail Keys".getBytes(charset);
        C18070vi.A0X(bytes10);
        A18 = bytes10;
        byte[] bytes11 = "WhatsApp Sticker Pack Keys".getBytes(charset);
        C18070vi.A0X(bytes11);
        A1E = bytes11;
        byte[] bytes12 = "WhatsApp Sticker Pack Thumbnail Keys".getBytes(charset);
        C18070vi.A0X(bytes12);
        A1F = bytes12;
        byte[] bytes13 = "waffle_hkdf_info".getBytes(charset);
        C18070vi.A0X(bytes13);
        A1I = bytes13;
        byte[] bytes14 = "WhatsApp Payment Background Keys".getBytes(charset);
        C18070vi.A0X(bytes14);
        A1C = bytes14;
        byte[] bytes15 = "PAYMENT_DOC_UPLOAD".getBytes(charset);
        C18070vi.A0X(bytes15);
        A1D = bytes15;
        byte[] bytes16 = "ads-image".getBytes(charset);
        C18070vi.A0X(bytes16);
        A10 = bytes16;
        byte[] bytes17 = "avatar-image".getBytes(charset);
        C18070vi.A0X(bytes17);
        A13 = bytes17;
        byte[] bytes18 = "WhatsApp Music Artwork Keys".getBytes(charset);
        C18070vi.A0X(bytes18);
        A1B = bytes18;
        byte[] bytes19 = "ads-video".getBytes(charset);
        C18070vi.A0X(bytes19);
        A11 = bytes19;
        A05 = new C26551So("audio", "AUD", bytes, 2);
        A0M = new C26551So("ptt", "PTT", bytes, 2);
        A0s = new C26551So("audio", "AUD", bytes, 82);
        A0E = new C26551So("image", "IMG", bytes2, 1);
        A0F = new C26551So("thumbnail-image", (String) null, bytes3, 1);
        A0t = new C26551So("image", "IMG", bytes2, 42);
        A0h = new C26551So("image", "IMG", bytes2, 23);
        A0I = new C26551So("image", "IMG", bytes2, 23);
        A0H = new C26551So("image", "IMG", bytes2, 57);
        A09 = new C26551So("image", "IMG", bytes2, 37);
        A0e = new C26551So("image", "IMG", bytes2, 44);
        A0j = new C26551So("sticker", "STK", bytes2, 20);
        A0o = new C26551So("image", (String) null, bytes2, 25);
        A0K = new C26551So("kyc-id", (String) null, bytes2, 1);
        A0q = new C26551So("video", "VID", bytes4, 3);
        A0i = new C26551So("ptv", "PTV", bytes4, 81);
        A0J = new C26551So("video", "VID", bytes4, 3);
        A0r = new C26551So("thumbnail-video", (String) null, bytes5, 3);
        A0u = new C26551So("video", "VID", bytes4, 43);
        A04 = new C26551So("gif", "VID", bytes4, 13);
        A0D = new C26551So("thumbnail-gif", (String) null, bytes5, 13);
        A0p = new C26551So("video", (String) null, bytes4, 28);
        A0n = new C26551So("gif", (String) null, bytes4, 29);
        String str = "DOC";
        A0B = new C26551So("document", str, bytes6, 9);
        A0G = new C26551So("document", str, bytes6, 9);
        A0m = new C26551So("document", (String) null, bytes6, 26);
        A0C = new C26551So("thumbnail-document", (String) null, bytes7, 9);
        A0L = new C26551So("thumbnail-link", (String) null, bytes10, 0);
        A0N = new C26551So("md-app-state", (String) null, bytes8, 109);
        A0O = new C26551So("md-msg-hist", "HIST_SYNC", bytes9, 35);
        A0w = new C26551So("waffle-image", (String) null, bytes13, 59);
        A0x = new C26551So("waffle-video", (String) null, bytes13, 60);
        A0v = new C26551So("waffle-gif", (String) null, bytes13, 61);
        A0f = new C26551So("payment-bg-image", (String) null, bytes14, 65);
        A0g = new C26551So("payment-br-document", (String) null, bytes15, 1);
        A0Q = new C26551So("ads-image", (String) null, bytes16, 1);
        A0R = new C26551So("ads-video", (String) null, bytes19, 3);
        A0A = new C26551So("biz-cover-photo", "IMG", bytes2, 1);
        A0V = new C26551So("newsletter-image", "IMG", bytes2, 1);
        A0d = new C26551So("newsletter-video", "VID", bytes4, 3);
        A0a = new C26551So("newsletter-thumbnail-link", (String) null, bytes10, 0);
        A0W = new C26551So("newsletter-ptt", "PTT", bytes, 2);
        A0S = new C26551So("newsletter-audio", "AUD", bytes, 2);
        A0T = new C26551So("newsletter-document", "DOC", bytes6, 9);
        A0U = new C26551So("newsletter-gif", "VID", bytes4, 13);
        A0X = new C26551So("newsletter-sticker", "STK", bytes2, 20);
        A0Y = new C26551So("newsletter-sticker-pack", "STK_PK", bytes11, 105);
        A06 = new C26551So("avatar-image", "AVATAR_IMG", bytes17, 1);
        A08 = new C26551So("biz-flows", (String) null, bytes2, 1);
        A07 = new C26551So("biz-flows", (String) null, bytes6, 9);
        A0y = new C26551So("wamo-image", (String) null, bytes2, 1);
        A0z = new C26551So("wamo-video", (String) null, bytes4, 3);
        A0k = new C26551So("sticker-pack", "STK_PK", bytes11, 105);
        A0l = new C26551So("thumbnail-sticker-pack", (String) null, bytes12, 105);
        A0Z = new C26551So("newsletter-thumbnail-image", (String) null, bytes3, 1);
        A0c = new C26551So("newsletter-thumbnail-video", (String) null, bytes5, 3);
        A0b = new C26551So("newsletter-thumbnail-sticker-pack", (String) null, bytes12, 105);
        A0P = new C26551So("music-artwork", (String) null, bytes18, 1);
    }

    public String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("MmsType{type=");
        sb.append(this.A00);
        sb.append(", origin=");
        if (this == A0M || this == A0W) {
            i = 1;
        } else {
            i = 0;
            if (this == A0K) {
                i = 6;
            }
        }
        sb.append(i);
        sb.append(", fileType=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }

    public C26551So(String str, String str2, byte[] bArr, int i) {
        this.A00 = i;
        this.A03 = bArr;
        this.A02 = str;
        this.A01 = str2;
    }
}
