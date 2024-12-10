package com.facebook.exoplayer.bandwidthestimator.estimate;

import X.AnonymousClass000;
import X.AnonymousClass8BS;
import X.C108985cd;
import X.C27323Dbu;
import X.C9M;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;
import java.util.Map;

public class VideoBandwidthEstimate {
    public static final Map A08 = new C27323Dbu(0);
    public long A00;
    public AbrContextAwareConfiguration A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public VideoBandwidthEstimate(long j, long j2, long j3, long j4, long j5, long j6, int i, AbrContextAwareConfiguration abrContextAwareConfiguration) {
        this.A05 = j;
        this.A07 = j2;
        this.A06 = j3;
        this.A00 = j4;
        this.A04 = j5;
        this.A03 = j6;
        this.A02 = i;
        this.A01 = abrContextAwareConfiguration;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("ttfb=");
        A102.append(this.A05);
        StringBuilder A0q = C108985cd.A0q(A102, A10);
        A0q.append(", bw=");
        A0q.append(this.A00 / 1000);
        StringBuilder A0q2 = C108985cd.A0q(A0q, A10);
        A0q2.append(", ttfb_s=");
        A0q2.append(this.A06);
        StringBuilder A0q3 = C108985cd.A0q(A0q2, A10);
        A0q3.append(", bw_s=");
        A0q3.append(this.A03 / 1000);
        StringBuilder A0q4 = C108985cd.A0q(A0q3, A10);
        A0q4.append(", s=");
        A0q4.append(this.A02);
        AnonymousClass8BS.A1D(A0q4, A10);
        synchronized (C9M.class) {
        }
        return A10.toString();
    }

    public VideoBandwidthEstimate() {
        this.A05 = -1;
        this.A07 = -1;
        this.A06 = -1;
        this.A00 = -1;
        this.A04 = -1;
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = null;
    }
}
