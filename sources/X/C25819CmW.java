package X;

/* renamed from: X.CmW  reason: case insensitive filesystem */
public final class C25819CmW {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final long A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final long A0J;
    public final long A0K;
    public final long A0L;
    public final long A0M;
    public final long A0N;
    public final long A0O;
    public final long A0P;
    public final long A0Q;
    public final Boolean A0R;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25819CmW) {
                C25819CmW cmW = (C25819CmW) obj;
                if (!(this.A0F == cmW.A0F && this.A0I == cmW.A0I && this.A0E == cmW.A0E && this.A0G == cmW.A0G && this.A0H == cmW.A0H && this.A0N == cmW.A0N && this.A0Q == cmW.A0Q && this.A0M == cmW.A0M && this.A0O == cmW.A0O && this.A0P == cmW.A0P && this.A01 == cmW.A01 && this.A02 == cmW.A02 && this.A03 == cmW.A03 && this.A07 == cmW.A07 && this.A06 == cmW.A06 && this.A08 == cmW.A08 && this.A00 == cmW.A00 && this.A0J == cmW.A0J && this.A0K == cmW.A0K && this.A0L == cmW.A0L && this.A05 == cmW.A05 && this.A04 == cmW.A04 && this.A09 == cmW.A09 && this.A0B == cmW.A0B && this.A0A == cmW.A0A && this.A0C == cmW.A0C && this.A0D == cmW.A0D && C18070vi.A18(this.A0R, cmW.A0R))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A0D, AnonymousClass001.A0K(this.A0C, AnonymousClass001.A0K(this.A0A, AnonymousClass001.A0K(this.A0B, AnonymousClass001.A0K(this.A09, AnonymousClass001.A0K(this.A04, AnonymousClass001.A0K(this.A05, AnonymousClass001.A0K(this.A0L, AnonymousClass001.A0K(this.A0K, AnonymousClass001.A0K(this.A0J, AnonymousClass001.A0K(this.A00, AnonymousClass001.A0K(this.A08, AnonymousClass001.A0K(this.A06, AnonymousClass001.A0K(this.A07, AnonymousClass001.A0K(this.A03, AnonymousClass001.A0K(this.A02, AnonymousClass001.A0K(this.A01, AnonymousClass001.A0K(this.A0P, AnonymousClass001.A0K(this.A0O, AnonymousClass001.A0K(this.A0M, AnonymousClass001.A0K(this.A0Q, AnonymousClass001.A0K(this.A0N, AnonymousClass001.A0K(this.A0H, AnonymousClass001.A0K(this.A0G, AnonymousClass001.A0K(this.A0E, AnonymousClass001.A0K(this.A0I, AnonymousClass8BV.A00(this.A0F))))))))))))))))))))))))))) + AnonymousClass001.A0k(this.A0R);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaEngagementSentDailyStat(numPhotoSent=");
        A10.append(this.A0F);
        A10.append(", numPhotoVoSent=");
        A10.append(this.A0I);
        A10.append(", numPhotoHdSent=");
        A10.append(this.A0E);
        A10.append(", numPhotoSentLte=");
        A10.append(this.A0G);
        A10.append(", numPhotoSentWifi=");
        A10.append(this.A0H);
        A10.append(", numVideoSent=");
        A10.append(this.A0N);
        A10.append(", numVideoVoSent=");
        A10.append(this.A0Q);
        A10.append(", numVideoHdSent=");
        A10.append(this.A0M);
        A10.append(", numVideoSentLte=");
        A10.append(this.A0O);
        A10.append(", numVideoSentWifi=");
        A10.append(this.A0P);
        A10.append(", numDocsSent=");
        A10.append(this.A01);
        A10.append(", numDocsSentLte=");
        A10.append(this.A02);
        A10.append(", numDocsSentWifi=");
        A10.append(this.A03);
        A10.append(", numLargeDocsSent=");
        A10.append(this.A07);
        A10.append(", numLargeDocsNonWifi=");
        A10.append(this.A06);
        A10.append(", numMediaSentAsDocs=");
        A10.append(this.A08);
        A10.append(", numAudioSent=");
        A10.append(this.A00);
        A10.append(", numSticker=");
        A10.append(this.A0J);
        A10.append(", numStickerPack=");
        A10.append(this.A0K);
        A10.append(", numUrl=");
        A10.append(this.A0L);
        A10.append(", numGifSent=");
        A10.append(this.A05);
        A10.append(", numExternalShare=");
        A10.append(this.A04);
        A10.append(", numMediaSentChat=");
        A10.append(this.A09);
        A10.append(", numMediaSentGroup=");
        A10.append(this.A0B);
        A10.append(", numMediaSentCommunity=");
        A10.append(this.A0A);
        A10.append(", numMediaSentStatus=");
        A10.append(this.A0C);
        A10.append(", numMediaUploadFailed=");
        A10.append(this.A0D);
        A10.append(", hdMediaTooltipSeen=");
        return AnonymousClass001.A1F(this.A0R, A10);
    }

    public C25819CmW(Boolean bool, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27) {
        this.A0F = j;
        this.A0I = j2;
        this.A0E = j3;
        this.A0G = j4;
        this.A0H = j5;
        this.A0N = j6;
        this.A0Q = j7;
        this.A0M = j8;
        this.A0O = j9;
        this.A0P = j10;
        this.A01 = j11;
        this.A02 = j12;
        this.A03 = j13;
        this.A07 = j14;
        this.A06 = j15;
        this.A08 = j16;
        this.A00 = j17;
        this.A0J = j18;
        this.A0K = j19;
        this.A0L = j20;
        this.A05 = j21;
        this.A04 = j22;
        this.A09 = j23;
        this.A0B = j24;
        this.A0A = j25;
        this.A0C = j26;
        this.A0D = j27;
        this.A0R = bool;
    }

    public C25819CmW() {
        this((Boolean) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }
}
