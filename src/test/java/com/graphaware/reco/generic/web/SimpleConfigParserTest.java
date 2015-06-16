/*
 * Copyright (c) 2015 GraphAware
 *
 * This file is part of GraphAware.
 *
 * GraphAware is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of
 * the GNU General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.graphaware.reco.generic.web;

import com.graphaware.reco.generic.config.SimpleConfig;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for {@link SimpleConfigParser}.
 */
public class SimpleConfigParserTest {

    @Test
    public void shouldProduceConfig() {
        assertEquals(new SimpleConfig(1, 2), new SimpleConfigParser().produceConfig(1, 2, "whatever"));
        assertEquals(new SimpleConfig(1, Long.MAX_VALUE), new SimpleConfigParser().produceConfig(1, "whatever"));
    }
}
