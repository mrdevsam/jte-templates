@param String username

@template.layouts.main(content = @`
    <div class="bg-white shadow rounded-lg p-6">
        <h1 class="text-2xl font-bold mb-4 ">
            Welcome, ${username}
        </h1>
        <p class="text-gray-600">This is your dashboard.</p>
    </div>
`)