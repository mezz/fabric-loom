/*
 * This file is part of fabric-loom, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2022 FabricMC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.fabricmc.loom.util.kotlin;

import kotlinx.metadata.jvm.KotlinClassMetadata;
import org.gradle.api.Project;

public class KotlinPluginUtils {
	private static final String KOTLIN_PLUGIN_ID = "org.jetbrains.kotlin.jvm";

	public static boolean hasKotlinPlugin(Project project) {
		return project.getPluginManager().hasPlugin(KOTLIN_PLUGIN_ID);
	}

	public static String getKotlinPluginVersion(Project project) {
		Class<?> koltinPluginClass = project.getPlugins().getPlugin(KOTLIN_PLUGIN_ID).getClass();
		return koltinPluginClass.getPackage().getImplementationVersion().split("-")[0];
	}

	public static String getKotlinMetadataVersion() {
		return KotlinClassMetadata.class.getPackage().getImplementationVersion();
	}
}
