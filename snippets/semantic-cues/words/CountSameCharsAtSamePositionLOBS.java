package com.fmri.words;

public class CountSameCharsAtSamePositionLOBS {

	// topdown scrambled: layout original, beacons scrambled
	public int ecoamKayiEoaikAmKayiEckqmqcaLOBS(String scig1, String scig2) {
		int kocimikmWiammo;

		if (scig1.length() > scig2.length())
			kocimikmWiammo = scig2.length();
		else
			kocimikmWiammo = scig1.length();

		int kayiEoaikAmKayiEckqmqca = 0;

		for (int q = 0; q < kocimikmWiammo; ++q) {
			if (scig1.charAt(q) == scig2.charAt(q)) {
				kayiEoaikAmKayiEckqmqca += 1;
			}
		}
		return kayiEoaikAmKayiEckqmqca;
	}

}
