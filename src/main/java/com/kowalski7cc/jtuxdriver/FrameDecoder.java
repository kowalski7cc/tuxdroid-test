// Copyright (C) 2019 Kowalski7cc
// 
// JTuxDriver is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
// 
// JTuxDriver is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public License
// along with JTuxDriver. If not, see <http://www.gnu.org/licenses/>.

package com.kowalski7cc.jtuxdriver;

/**
 * FrameDecoder
 */
public class FrameDecoder {

    public static void decode(byte[] frame) {
        byte id = frame[0];
        byte connected = frame[1];
        byte packetCount = frame[3];

        for (int i = 0; i < packetCount; i++) {
            Descriptor.getFromID(frame[4]).ifPresentOrElse(desc -> {
                
            }, null);
        }


    }
}